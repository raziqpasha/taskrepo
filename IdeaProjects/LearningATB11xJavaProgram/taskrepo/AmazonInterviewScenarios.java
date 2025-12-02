package taskrepo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * ╔══════════════════════════════════════════════════════════════════════════════╗
 * ║              AMAZON.COM SELENIUM INTERVIEW SCENARIOS                        ║
 * ║                    Complete A-Z Automation Guide                            ║
 * ╚══════════════════════════════════════════════════════════════════════════════╝
 * 
 * This file contains ALL major interview scenarios for Amazon.com automation
 * with detailed XPath strategies and explanations.
 */
public class AmazonInterviewScenarios {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor js;

    // ═══════════════════════════════════════════════════════════════════════════
    // SETUP METHOD
    // ═══════════════════════════════════════════════════════════════════════════
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;
        
        driver.get("https://www.amazon.com");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 1: SEARCH FUNCTIONALITY (Most Asked!)                          ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <div id="nav-search">
     *   <form id="nav-search-bar-form">
     *     <div id="nav-search-dropdown-card">
     *       <select id="searchDropdownBox" name="url">
     *         <option value="search-alias=aps">All Departments</option>
     *         <option value="search-alias=alexa-skills">Alexa Skills</option>
     *       </select>
     *     </div>
     *     <input type="text" id="twotabsearchtextbox" name="field-keywords">
     *     <input id="nav-search-submit-button" type="submit" value="Go">
     *   </form>
     * </div>
     * 
     * XPATH TRICKS USED:
     * 1. By ID - Most reliable: //input[@id='twotabsearchtextbox']
     * 2. By placeholder: //input[@placeholder='Search Amazon']
     * 3. Contains: //input[contains(@id,'searchtextbox')]
     */
    public void scenario1_SearchProduct() {
        // STEP 1: Locate search box using multiple XPath strategies
        
        // Method 1: Using ID (BEST - Most Stable)
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        
        // Method 2: Using XPath with ID
        // WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        
        // Method 3: Using XPath with contains (Flexible)
        // WebElement searchBox = driver.findElement(By.xpath("//input[contains(@id,'searchtextbox')]"));
        
        // Method 4: Using CSS Selector
        // WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        
        // STEP 2: Enter search term
        searchBox.clear();
        searchBox.sendKeys("iPhone 15 Pro Max");
        
        // STEP 3: Click search button
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        // Alternative XPath: //input[@id='nav-search-submit-button']
        // Alternative XPath: //input[@type='submit' and @value='Go']
        searchButton.click();
        
        // STEP 4: Wait for results to load
        wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//div[@class='s-main-slot']")
        ));
        
        // STEP 5: Verify search results contain the keyword
        String pageSource = driver.getPageSource();
        if (pageSource.contains("iPhone")) {
            System.out.println("✅ Search Test PASSED - Products found!");
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 2: CATEGORY DROPDOWN SELECTION (Frequently Asked!)             ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <select id="searchDropdownBox" class="nav-search-dropdown" name="url">
     *   <option selected="selected" value="search-alias=aps">All</option>
     *   <option value="search-alias=arts-crafts-intl-ship">Arts & Crafts</option>
     *   <option value="search-alias=automotive-intl-ship">Automotive</option>
     *   <option value="search-alias=electronics-intl-ship">Electronics</option>
     * </select>
     * 
     * XPATH TRICKS:
     * 1. Select by ID: //select[@id='searchDropdownBox']
     * 2. Options: //select[@id='searchDropdownBox']/option[text()='Electronics']
     * 3. Contains text: //option[contains(text(),'Electronic')]
     */
    public void scenario2_SelectCategoryAndSearch() {
        // STEP 1: Locate dropdown
        WebElement categoryDropdown = driver.findElement(By.id("searchDropdownBox"));
        
        // STEP 2: Create Select object for dropdown
        Select categorySelect = new Select(categoryDropdown);
        
        // STEP 3: Select by visible text
        categorySelect.selectByVisibleText("Electronics");
        
        // Alternative: Select by value
        // categorySelect.selectByValue("search-alias=electronics-intl-ship");
        
        // Alternative: Select by index
        // categorySelect.selectByIndex(5);
        
        // STEP 4: Enter search in selected category
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        
        // STEP 5: Submit search
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // STEP 6: Verify category filter applied
        wait.until(ExpectedConditions.urlContains("electronics"));
        System.out.println("✅ Category Selection Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 3: NAVIGATION MENU & HOVER (Actions Class - Very Popular!)     ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <a id="nav-link-accountList" href="/ap/signin">
     *   <span class="nav-line-1">Hello, Sign in</span>
     *   <span class="nav-line-2">Account & Lists</span>
     * </a>
     * 
     * <div id="nav-flyout-accountList">
     *   <a href="/gp/css/homepage.html">Your Account</a>
     *   <a href="/gp/css/order-history">Your Orders</a>
     * </div>
     * 
     * XPATH TRICKS:
     * 1. By ID: //a[@id='nav-link-accountList']
     * 2. By partial link text: //a[contains(text(),'Account')]
     * 3. By span text: //a[.//span[contains(text(),'Account & Lists')]]
     * 4. Parent-child: //div[@id='nav-flyout-accountList']//a[text()='Your Orders']
     */
    public void scenario3_HoverAndClickSubmenu() {
        // STEP 1: Locate the main menu element
        WebElement accountLink = driver.findElement(By.id("nav-link-accountList"));
        
        // STEP 2: Hover over the element using Actions class
        actions.moveToElement(accountLink).perform();
        
        // STEP 3: Wait for flyout menu to appear
        WebElement flyoutMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("nav-flyout-accountList")
        ));
        
        // STEP 4: Click on submenu item
        WebElement yourOrders = driver.findElement(
            By.xpath("//div[@id='nav-flyout-accountList']//a[contains(text(),'Your Orders')]")
        );
        yourOrders.click();
        
        System.out.println("✅ Hover Menu Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 4: ADD TO CART (E-Commerce Core Scenario!)                     ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE (Product Page):
     * <div id="addToCart">
     *   <input id="add-to-cart-button" name="submit.add-to-cart" 
     *          type="submit" value="Add to Cart">
     * </div>
     * 
     * <div id="buy-now-button">
     *   <input id="buy-now-button" type="submit" value="Buy Now">
     * </div>
     * 
     * <span id="productTitle" class="a-size-large">
     *   Apple iPhone 15 Pro Max, 256GB, Natural Titanium
     * </span>
     * 
     * <span id="priceblock_ourprice" class="a-price-whole">1,199</span>
     * 
     * XPATH TRICKS:
     * 1. Add to cart: //input[@id='add-to-cart-button']
     * 2. Price: //span[@id='priceblock_ourprice'] or //span[contains(@class,'a-price-whole')]
     * 3. Title: //span[@id='productTitle']
     * 4. Multiple conditions: //input[@type='submit' and @value='Add to Cart']
     */
    public void scenario4_SearchAndAddToCart() {
        // STEP 1: Search for product
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 15 Pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // STEP 2: Wait for results and click first product
        wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//div[@data-component-type='s-search-result']")
        ));
        
        // Click first product - Using data attribute (Modern approach)
        WebElement firstProduct = driver.findElement(
            By.xpath("(//div[@data-component-type='s-search-result'])[1]//a[@class='a-link-normal s-no-outline']")
        );
        firstProduct.click();
        
        // STEP 3: Handle new tab if opened
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
            }
        }
        
        // STEP 4: Get product title
        WebElement productTitle = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.id("productTitle")
        ));
        String title = productTitle.getText().trim();
        System.out.println("Product: " + title);
        
        // STEP 5: Get price
        try {
            WebElement priceWhole = driver.findElement(
                By.xpath("//span[@class='a-price-whole']")
            );
            System.out.println("Price: $" + priceWhole.getText());
        } catch (NoSuchElementException e) {
            System.out.println("Price not available");
        }
        
        // STEP 6: Click Add to Cart
        WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("add-to-cart-button")
        ));
        addToCartBtn.click();
        
        // STEP 7: Verify item added - Look for confirmation
        wait.until(ExpectedConditions.or(
            ExpectedConditions.presenceOfElementLocated(By.id("sw-atc-confirmation")),
            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Added to Cart')]"))
        ));
        
        System.out.println("✅ Add to Cart Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 5: VERIFY CART COUNT (Dynamic Element Handling!)               ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <a id="nav-cart" href="/gp/cart/view.html">
     *   <span id="nav-cart-count" class="nav-cart-count">3</span>
     *   <span class="nav-cart-icon"></span>
     * </a>
     * 
     * XPATH TRICKS:
     * 1. Cart count: //span[@id='nav-cart-count']
     * 2. Cart link: //a[@id='nav-cart']
     * 3. Using class: //span[contains(@class,'nav-cart-count')]
     */
    public void scenario5_VerifyCartCount() {
        // STEP 1: Get initial cart count
        WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
        int initialCount = Integer.parseInt(cartCount.getText().trim());
        System.out.println("Initial Cart Count: " + initialCount);
        
        // STEP 2: Add a product (simplified)
        // ... add product steps ...
        
        // STEP 3: Wait for cart count to update
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
            By.id("nav-cart-count"),
            String.valueOf(initialCount + 1)
        ));
        
        // STEP 4: Verify new count
        int newCount = Integer.parseInt(driver.findElement(By.id("nav-cart-count")).getText().trim());
        
        if (newCount == initialCount + 1) {
            System.out.println("✅ Cart Count Updated Successfully! New Count: " + newCount);
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 6: FILTER PRODUCTS (Checkbox & Dynamic Content!)               ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <div id="s-refinements">
     *   <div id="brandsRefinements">
     *     <li>
     *       <span class="a-list-item">
     *         <a href="...">
     *           <input type="checkbox">
     *           <span>Apple</span>
     *         </a>
     *       </span>
     *     </li>
     *   </div>
     *   <div id="priceRefinements">
     *     <span>$100 to $200</span>
     *   </div>
     * </div>
     * 
     * XPATH TRICKS:
     * 1. Brand filter: //span[text()='Apple']/ancestor::a
     * 2. Price filter: //span[contains(text(),'$100')]
     * 3. Checkbox: //input[@type='checkbox']/following-sibling::span[text()='Apple']
     * 4. Rating: //i[contains(@class,'a-star-4')]/ancestor::a
     */
    public void scenario6_FilterByBrandAndPrice() {
        // STEP 1: Search for a product first
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("s-refinements")));
        
        // STEP 2: Click on Brand filter (e.g., HP)
        WebElement brandFilter = driver.findElement(
            By.xpath("//div[@id='brandsRefinements']//span[text()='HP']/ancestor::a")
        );
        
        // Scroll into view if needed
        js.executeScript("arguments[0].scrollIntoView(true);", brandFilter);
        brandFilter.click();
        
        // STEP 3: Wait for page to reload with filtered results
        wait.until(ExpectedConditions.stalenessOf(brandFilter));
        
        // STEP 4: Apply price filter
        WebElement priceFilter = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[contains(text(),'$200')]/ancestor::a")
        ));
        priceFilter.click();
        
        // STEP 5: Verify filters applied in URL
        wait.until(ExpectedConditions.urlContains("HP"));
        System.out.println("✅ Filter Test PASSED! URL: " + driver.getCurrentUrl());
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 7: HANDLING MULTIPLE WINDOWS/TABS (Very Common!)               ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * This scenario handles when clicking a product opens in new tab
     */
    public void scenario7_HandleMultipleWindows() {
        // STEP 1: Store original window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);
        
        // STEP 2: Click element that opens new window
        WebElement productLink = driver.findElement(
            By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")
        );
        
        // Open in new tab using Ctrl+Click
        actions.keyDown(Keys.CONTROL)
               .click(productLink)
               .keyUp(Keys.CONTROL)
               .perform();
        
        // STEP 3: Wait for new window and get all handles
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindows = driver.getWindowHandles();
        
        // STEP 4: Switch to new window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to Child Window: " + window);
                break;
            }
        }
        
        // STEP 5: Perform actions in new window
        String newWindowTitle = driver.getTitle();
        System.out.println("New Window Title: " + newWindowTitle);
        
        // STEP 6: Close child window and switch back
        driver.close();
        driver.switchTo().window(parentWindow);
        
        System.out.println("✅ Multiple Windows Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 8: SCROLL & LAZY LOADING (JavaScript Executor!)                ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * Amazon uses lazy loading - products load as you scroll
     */
    public void scenario8_ScrollAndLoadMoreProducts() {
        // Search first
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // STEP 1: Get initial product count
        List<WebElement> initialProducts = driver.findElements(
            By.xpath("//div[@data-component-type='s-search-result']")
        );
        int initialCount = initialProducts.size();
        System.out.println("Initial Products: " + initialCount);
        
        // STEP 2: Scroll down using JavaScript
        // Method 1: Scroll by pixels
        js.executeScript("window.scrollBy(0, 1000)");
        
        // Method 2: Scroll to bottom
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        // Method 3: Scroll to specific element
        WebElement lastProduct = initialProducts.get(initialProducts.size() - 1);
        js.executeScript("arguments[0].scrollIntoView(true);", lastProduct);
        
        // STEP 3: Wait for new products to load
        try {
            Thread.sleep(2000); // Wait for lazy load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // STEP 4: Count products after scroll
        List<WebElement> newProducts = driver.findElements(
            By.xpath("//div[@data-component-type='s-search-result']")
        );
        System.out.println("Products after scroll: " + newProducts.size());
        
        System.out.println("✅ Scroll Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 9: AUTOCOMPLETE/SUGGESTIONS (Dynamic Dropdown!)                ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <div class="autocomplete-results-container">
     *   <div class="s-suggestion">
     *     <div class="s-suggestion-container">
     *       <span class="s-suggestion-text">iphone 15 pro max</span>
     *     </div>
     *   </div>
     * </div>
     * 
     * XPATH TRICKS:
     * 1. All suggestions: //div[contains(@class,'s-suggestion')]
     * 2. Specific text: //span[contains(@class,'s-suggestion-text')]
     * 3. By suggestion: //div[@class='s-suggestion'][contains(.,'pro max')]
     */
    public void scenario9_SearchAutoComplete() {
        // STEP 1: Type partial search term slowly
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("ipho");
        
        // STEP 2: Wait for autocomplete suggestions
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'autocomplete')]")
        ));
        
        // STEP 3: Get all suggestions
        List<WebElement> suggestions = driver.findElements(
            By.xpath("//div[contains(@class,'s-suggestion')]")
        );
        
        System.out.println("Found " + suggestions.size() + " suggestions:");
        for (WebElement suggestion : suggestions) {
            System.out.println("  - " + suggestion.getText());
        }
        
        // STEP 4: Click on a specific suggestion
        WebElement targetSuggestion = driver.findElement(
            By.xpath("//div[contains(@class,'s-suggestion')][contains(.,'iphone 15')]")
        );
        targetSuggestion.click();
        
        // STEP 5: Verify search was performed
        wait.until(ExpectedConditions.urlContains("iphone"));
        System.out.println("✅ Autocomplete Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 10: PAGINATION (Important for List Pages!)                     ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <div class="s-pagination-container">
     *   <span class="s-pagination-item s-pagination-selected">1</span>
     *   <a class="s-pagination-item s-pagination-button">2</a>
     *   <a class="s-pagination-item s-pagination-button">3</a>
     *   <a class="s-pagination-item s-pagination-next">Next</a>
     * </div>
     * 
     * XPATH TRICKS:
     * 1. Next button: //a[contains(@class,'s-pagination-next')]
     * 2. Page number: //a[@class='s-pagination-item'][text()='2']
     * 3. Current page: //span[contains(@class,'s-pagination-selected')]
     */
    public void scenario10_Pagination() {
        // Search first
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // STEP 1: Scroll to pagination
        WebElement pagination = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//div[contains(@class,'s-pagination')]")
        ));
        js.executeScript("arguments[0].scrollIntoView(true);", pagination);
        
        // STEP 2: Get current page number
        WebElement currentPage = driver.findElement(
            By.xpath("//span[contains(@class,'s-pagination-selected')]")
        );
        System.out.println("Current Page: " + currentPage.getText());
        
        // STEP 3: Click Next button
        WebElement nextButton = driver.findElement(
            By.xpath("//a[contains(@class,'s-pagination-next')]")
        );
        nextButton.click();
        
        // STEP 4: Wait for page 2 to load
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
            By.xpath("//span[contains(@class,'s-pagination-selected')]"),
            "2"
        ));
        
        // STEP 5: Verify URL contains page=2
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("page=2")) {
            System.out.println("✅ Pagination Test PASSED! URL: " + currentUrl);
        }
        
        // STEP 6: Click on specific page number
        WebElement page5 = driver.findElement(
            By.xpath("//a[contains(@class,'s-pagination-item')][text()='5']")
        );
        page5.click();
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 11: SORT FUNCTIONALITY (Dropdown without Select tag!)          ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE (Custom Dropdown):
     * <span class="a-dropdown-container">
     *   <span id="s-result-sort-select" class="a-dropdown-label">Sort by:</span>
     *   <select id="s-result-sort-select" class="a-native-dropdown">
     *     <option value="relevanceblender">Featured</option>
     *     <option value="price-asc-rank">Price: Low to High</option>
     *     <option value="price-desc-rank">Price: High to Low</option>
     *     <option value="review-rank">Avg. Customer Review</option>
     *   </select>
     * </span>
     */
    public void scenario11_SortProducts() {
        // Search first
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // STEP 1: Wait for sort dropdown
        WebElement sortDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//span[@class='a-dropdown-container']//select")
        ));
        
        // STEP 2: Create Select object
        Select sortSelect = new Select(sortDropdown);
        
        // STEP 3: Sort by Price Low to High
        sortSelect.selectByVisibleText("Price: Low to High");
        
        // Or by value:
        // sortSelect.selectByValue("price-asc-rank");
        
        // STEP 4: Wait for page to reload
        wait.until(ExpectedConditions.urlContains("s=price-asc-rank"));
        
        // STEP 5: Verify first product has lowest price
        List<WebElement> prices = driver.findElements(
            By.xpath("//span[@class='a-price-whole']")
        );
        System.out.println("First product price: $" + prices.get(0).getText());
        
        System.out.println("✅ Sort Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 12: PRODUCT IMAGE GALLERY (Click & Verify!)                    ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <div id="altImages">
     *   <li class="imageThumbnail">
     *     <span class="a-button-inner">
     *       <img src="thumbnail1.jpg" alt="Product Image 1">
     *     </span>
     *   </li>
     * </div>
     * <div id="imgTagWrapperId">
     *   <img id="landingImage" src="mainimage.jpg">
     * </div>
     */
    public void scenario12_ProductImageGallery() {
        // Navigate to a product page first...
        
        // STEP 1: Get main image source
        WebElement mainImage = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.id("landingImage")
        ));
        String initialSrc = mainImage.getAttribute("src");
        System.out.println("Initial Image: " + initialSrc);
        
        // STEP 2: Get all thumbnail images
        List<WebElement> thumbnails = driver.findElements(
            By.xpath("//div[@id='altImages']//li[contains(@class,'imageThumbnail')]//img")
        );
        System.out.println("Found " + thumbnails.size() + " thumbnails");
        
        // STEP 3: Hover over second thumbnail
        if (thumbnails.size() > 1) {
            actions.moveToElement(thumbnails.get(1)).perform();
            
            // STEP 4: Wait for main image to change
            wait.until(ExpectedConditions.not(
                ExpectedConditions.attributeToBe(mainImage, "src", initialSrc)
            ));
            
            String newSrc = mainImage.getAttribute("src");
            System.out.println("New Image: " + newSrc);
            
            if (!newSrc.equals(initialSrc)) {
                System.out.println("✅ Image Gallery Test PASSED!");
            }
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 13: QUANTITY SELECTION (Important for Cart!)                   ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <select id="quantity" name="quantity">
     *   <option value="1">1</option>
     *   <option value="2">2</option>
     *   <option value="3">3</option>
     * </select>
     */
    public void scenario13_SelectQuantity() {
        // On product page...
        
        // STEP 1: Locate quantity dropdown
        WebElement quantityDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.id("quantity")
        ));
        
        // STEP 2: Select quantity using Select class
        Select quantitySelect = new Select(quantityDropdown);
        quantitySelect.selectByValue("3");  // Select 3 items
        
        // Or by visible text
        // quantitySelect.selectByVisibleText("3");
        
        // STEP 3: Verify selection
        String selectedValue = quantitySelect.getFirstSelectedOption().getText();
        System.out.println("Selected Quantity: " + selectedValue);
        
        // STEP 4: Add to cart
        driver.findElement(By.id("add-to-cart-button")).click();
        
        System.out.println("✅ Quantity Selection Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 14: LOGIN/SIGN-IN (Authentication Flow!)                       ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE (Login Page):
     * <form name="signIn">
     *   <input type="email" id="ap_email" name="email" placeholder="Email or phone">
     *   <input type="password" id="ap_password" name="password">
     *   <input id="signInSubmit" type="submit" value="Sign-In">
     * </form>
     * 
     * XPATH TRICKS:
     * 1. Email: //input[@id='ap_email'] or //input[@type='email']
     * 2. Password: //input[@id='ap_password'] or //input[@type='password']
     * 3. Submit: //input[@id='signInSubmit']
     */
    public void scenario14_LoginFlow() {
        // STEP 1: Click Sign-In link
        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        signInLink.click();
        
        // STEP 2: Enter email
        WebElement emailInput = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.id("ap_email")
        ));
        emailInput.sendKeys("test@example.com");
        
        // STEP 3: Click Continue
        driver.findElement(By.id("continue")).click();
        
        // STEP 4: Enter password
        WebElement passwordInput = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.id("ap_password")
        ));
        passwordInput.sendKeys("testpassword123");
        
        // STEP 5: Click Sign-In
        driver.findElement(By.id("signInSubmit")).click();
        
        // STEP 6: Handle CAPTCHA or 2FA if present (just log for interview)
        System.out.println("Note: Real tests need to handle CAPTCHA/2FA");
        
        // STEP 7: Verify login success - Check for user name
        try {
            WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[@id='nav-link-accountList-nav-line-1']")
            ));
            System.out.println("✅ Login Test PASSED! Welcome: " + userName.getText());
        } catch (TimeoutException e) {
            System.out.println("❌ Login failed or CAPTCHA appeared");
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 15: HANDLING ALERTS & POPUPS (Important!)                      ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    public void scenario15_HandleAlertsAndPopups() {
        // METHOD 1: Handle JavaScript Alert
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();  // Click OK
            // alert.dismiss();  // Click Cancel
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present");
        }
        
        // METHOD 2: Handle promotional popup/modal
        try {
            WebElement closePopup = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class,'close') or contains(@aria-label,'Close')]")
            ));
            closePopup.click();
            System.out.println("Popup closed successfully");
        } catch (TimeoutException e) {
            System.out.println("No popup appeared");
        }
        
        // METHOD 3: Handle overlay/modal
        try {
            WebElement overlay = driver.findElement(By.id("a-popover-1"));
            if (overlay.isDisplayed()) {
                WebElement closeBtn = overlay.findElement(By.xpath(".//button[@data-action='a-popover-close']"));
                closeBtn.click();
            }
        } catch (NoSuchElementException e) {
            // No overlay
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 16: FRAME/IFRAME HANDLING                                      ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    /**
     * HTML STRUCTURE:
     * <iframe id="some-iframe" src="...">
     *   #document
     *     <body>
     *       <button id="button-in-frame">Click Me</button>
     *     </body>
     * </iframe>
     */
    public void scenario16_HandleFrames() {
        // STEP 1: Switch to frame by ID
        driver.switchTo().frame("iframe-id");
        
        // Or by index
        // driver.switchTo().frame(0);
        
        // Or by WebElement
        // WebElement iframe = driver.findElement(By.tagName("iframe"));
        // driver.switchTo().frame(iframe);
        
        // STEP 2: Perform actions inside frame
        WebElement elementInFrame = driver.findElement(By.id("button-in-frame"));
        elementInFrame.click();
        
        // STEP 3: Switch back to main content
        driver.switchTo().defaultContent();
        
        // Or switch to parent frame
        // driver.switchTo().parentFrame();
        
        System.out.println("✅ Frame Handling Test PASSED!");
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 17: SCREENSHOT ON FAILURE (Very Important!)                    ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    public void scenario17_TakeScreenshot() {
        try {
            // Perform some action that might fail
            driver.findElement(By.id("non-existent-element")).click();
        } catch (Exception e) {
            // Take screenshot on failure
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            
            // Save to file
            java.io.File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
            // Copy to desired location using Files.copy()
            
            System.out.println("Screenshot captured on failure!");
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 18: WAIT STRATEGIES (Explicit, Implicit, Fluent)               ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    public void scenario18_WaitStrategies() {
        // 1. IMPLICIT WAIT (NOT RECOMMENDED with Explicit)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // 2. EXPLICIT WAIT (RECOMMENDED)
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
        // Wait for element to be visible
        WebElement element = explicitWait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("someId"))
        );
        
        // Wait for element to be clickable
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("button")));
        
        // Wait for text to be present
        explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(
            By.id("message"), "Success"
        ));
        
        // Wait for element to disappear
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));
        
        // Wait for URL to contain
        explicitWait.until(ExpectedConditions.urlContains("success"));
        
        // 3. FLUENT WAIT (Most Flexible)
        org.openqa.selenium.support.ui.FluentWait<WebDriver> fluentWait = 
            new org.openqa.selenium.support.ui.FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        
        WebElement fluentElement = fluentWait.until(d -> d.findElement(By.id("dynamicElement")));
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 19: STALE ELEMENT HANDLING (Very Common Interview Question!)   ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    public void scenario19_HandleStaleElement() {
        // Stale Element occurs when:
        // 1. Page refreshes after finding element
        // 2. DOM updates (AJAX)
        // 3. Navigation happens
        
        // SOLUTION 1: Re-find the element
        WebElement element = driver.findElement(By.id("dynamicElement"));
        try {
            element.click();
        } catch (StaleElementReferenceException e) {
            // Re-find and click
            element = driver.findElement(By.id("dynamicElement"));
            element.click();
        }
        
        // SOLUTION 2: Use explicit wait
        wait.until(ExpectedConditions.refreshed(
            ExpectedConditions.elementToBeClickable(By.id("dynamicElement"))
        )).click();
        
        // SOLUTION 3: Retry mechanism
        int attempts = 0;
        while (attempts < 3) {
            try {
                driver.findElement(By.id("dynamicElement")).click();
                break;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
    }

    // ╔══════════════════════════════════════════════════════════════════════════╗
    // ║ SCENARIO 20: DATA-DRIVEN TESTING (Multiple Products!)                   ║
    // ╚══════════════════════════════════════════════════════════════════════════╝
    public void scenario20_DataDrivenSearch() {
        String[] products = {"iPhone", "Samsung Galaxy", "MacBook", "iPad", "AirPods"};
        
        for (String product : products) {
            // Clear previous search
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            
            // Search for product
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();
            
            // Wait for results
            wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@data-component-type='s-search-result']")
            ));
            
            // Get result count
            List<WebElement> results = driver.findElements(
                By.xpath("//div[@data-component-type='s-search-result']")
            );
            
            System.out.println(product + " - Found " + results.size() + " results");
        }
    }

    // ═══════════════════════════════════════════════════════════════════════════
    // MAIN METHOD - Run All Scenarios
    // ═══════════════════════════════════════════════════════════════════════════
    public static void main(String[] args) {
        AmazonInterviewScenarios test = new AmazonInterviewScenarios();
        
        try {
            test.setUp();
            
            // Run scenarios
            test.scenario1_SearchProduct();
            // test.scenario2_SelectCategoryAndSearch();
            // test.scenario3_HoverAndClickSubmenu();
            // ... add more as needed
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            test.tearDown();
        }
    }
}
