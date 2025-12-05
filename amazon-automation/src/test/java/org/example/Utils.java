package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class Utils {

    private Utils() {
    }

    public static WebElement waitForElement(WebDriver driver, By locator, int timeOutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void switchToNewWindowIfPresent(WebDriver driver, String originalWindow, int timeOutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutSeconds));
        try {
            wait.until(d -> d.getWindowHandles().size() > 1);
        } catch (TimeoutException ignored) {
            driver.switchTo().window(originalWindow);
            return;
        }
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                return;
            }
        }
        driver.switchTo().window(originalWindow);
    }

    public static void scrollIntoView(WebDriver driver, WebElement element) {
        if (driver instanceof JavascriptExecutor executor) {
            executor.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        }
    }

    public static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            Path directory = Path.of("screenshots");
            Files.createDirectories(directory);
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src.toPath(), directory.resolve(fileName + ".png"));
        } catch (Exception e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }
}
