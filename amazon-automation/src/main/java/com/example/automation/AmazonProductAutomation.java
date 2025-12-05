package com.example.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Simple Amazon search workflow implemented with Selenium WebDriver.
 */
public class AmazonProductAutomation {

    private static final String DEFAULT_PRODUCT = "laptop";
    private static final String AMAZON_URL = "https://www.amazon.com";
    private static final Duration TIMEOUT = Duration.ofSeconds(20);

    private WebDriver driver;
    private WebDriverWait wait;

    public static void main(String[] args) {
        String query = args.length > 0 ? String.join(" ", args) : DEFAULT_PRODUCT;
        AmazonProductAutomation automation = new AmazonProductAutomation();
        automation.run(query, true);
    }

    public void run(String query, boolean headless) {
        try {
            setUp(headless);
            navigateToHomePage();
            searchForProduct(query);
            openFirstResult();
            WebElement actionableButton = validateProductDetailPage();
            Path screenshotPath = takeScreenshot("product-details.png");
            System.out.printf("Product CTA detected: %s%n", actionableButton.getAttribute("id"));
            System.out.printf("Screenshot written to %s%n", screenshotPath.toAbsolutePath());
        } finally {
            tearDown();
        }
    }

    private void setUp(boolean headless) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(buildChromeOptions(headless));
        driver.manage().timeouts().implicitlyWait(Duration.ZERO);
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    private ChromeOptions buildChromeOptions(boolean headless) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1400,900");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        if (headless) {
            options.addArguments("--headless=new");
        }
        String chromeBinary = System.getenv("CHROME_BINARY");
        if (chromeBinary != null && !chromeBinary.isBlank()) {
            options.setBinary(chromeBinary);
        }
        return options;
    }

    private void navigateToHomePage() {
        driver.get(AMAZON_URL);
        dismissOverlays();
    }

    private void searchForProduct(String query) {
        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        searchInput.clear();
        searchInput.sendKeys(query);
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
        submitButton.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.s-main-slot")));
    }

    private void openFirstResult() {
        By firstResultLink = By.cssSelector("div[data-component-type='s-search-result'] h2 a");
        WebElement result = wait.until(ExpectedConditions.elementToBeClickable(firstResultLink));
        String currentWindow = driver.getWindowHandle();
        result.click();
        switchToNewWindowIfNeeded(currentWindow);
    }

    private WebElement validateProductDetailPage() {
        By addToCart = By.id("add-to-cart-button");
        By buyNow = By.id("buy-now-button");
        return wait.until(driver -> {
            dismissOverlays();
            WebElement addToCartButton = findDisplayedElement(driver, addToCart);
            if (addToCartButton != null) {
                return addToCartButton;
            }
            return findDisplayedElement(driver, buyNow);
        });
    }

    private WebElement findDisplayedElement(WebDriver driver, By locator) {
        return driver.findElements(locator).stream()
                .filter(WebElement::isDisplayed)
                .findFirst()
                .orElse(null);
    }

    private Path takeScreenshot(String fileName) {
        Path screenshotsDir = Paths.get("target", "screenshots");
        try {
            Files.createDirectories(screenshotsDir);
            File rawFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path destination = screenshotsDir.resolve(fileName);
            Files.copy(rawFile.toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
            return destination;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to persist screenshot", e);
        }
    }

    private void dismissOverlays() {
        if (driver == null) {
            return;
        }
        List<By> dismissButtons = List.of(
                By.id("attach-close_sideSheet-link"),
                By.cssSelector("button[data-action='a-popover-close']"),
                By.cssSelector("input[aria-label='Close']")
        );
        WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        dismissButtons.forEach(locator -> {
            try {
                WebElement element = shortWait.until(ExpectedConditions.elementToBeClickable(locator));
                element.click();
            } catch (Exception ignored) {
                // Overlay not present, continue.
            }
        });
    }

    private void switchToNewWindowIfNeeded(String currentWindow) {
        Set<String> windows = driver.getWindowHandles();
        if (windows.size() <= 1) {
            return;
        }
        for (String handle : windows) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    private void tearDown() {
        Optional.ofNullable(driver).ifPresent(WebDriver::quit);
    }
}
