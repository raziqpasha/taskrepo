package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    protected ChromeDriver driver;

    protected void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(defaultOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ZERO);
    }

    protected void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private ChromeOptions defaultOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        String chromeBinary = System.getenv("CHROME_BINARY");
        if (chromeBinary != null && !chromeBinary.isBlank()) {
            options.setBinary(chromeBinary);
        }
        return options;
    }
}
