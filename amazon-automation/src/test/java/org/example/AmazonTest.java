package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    @BeforeClass
    public void start() {
        setup();
    }

    @Test
    public void amazonProductFlow() {
        driver.get("https://www.amazon.com");

        WebElement searchBox = Utils.waitForElement(driver, By.id("twotabsearchtextbox"), 10);
        searchBox.clear();
        searchBox.sendKeys("laptop");
        searchBox.submit();

        WebElement firstResult = Utils.waitForElement(
                driver,
                By.cssSelector("div[data-component-type='s-search-result'] h2 a"),
                15);

        String originalWindow = driver.getWindowHandle();
        Utils.scrollIntoView(driver, firstResult);
        firstResult.click();
        Utils.switchToNewWindowIfPresent(driver, originalWindow, 15);

        WebElement addToCartBtn = Utils.waitForElement(
                driver,
                By.cssSelector("#add-to-cart-button, #buy-now-button"),
                20);

        Assert.assertTrue(addToCartBtn.isDisplayed(),
                "Add to Cart button is NOT visible – Product page did not load properly!");

        Utils.takeScreenshot(driver, "ProductPage");

        System.out.println("Test Passed: Product page loaded & screenshot taken.");
    }

    @AfterClass
    public void end() {
        tearDown();
    }
}
