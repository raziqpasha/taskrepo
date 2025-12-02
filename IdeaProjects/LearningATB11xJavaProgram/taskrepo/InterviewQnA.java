package taskrepo;

/**
 * ╔══════════════════════════════════════════════════════════════════════════════════════════╗
 * ║             SELENIUM INTERVIEW QUESTIONS & ANSWERS                                       ║
 * ║                   Most Asked Questions by Recruiters                                    ║
 * ╚══════════════════════════════════════════════════════════════════════════════════════════╝
 */
public class InterviewQnA {

    /*
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q1: WHAT IS THE DIFFERENCE BETWEEN findElement() and findElements()?                    ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    ANSWER:
    
    findElement():
    - Returns single WebElement
    - Throws NoSuchElementException if not found
    - Returns FIRST matching element
    
    findElements():
    - Returns List<WebElement>
    - Returns EMPTY LIST if not found (no exception)
    - Returns ALL matching elements
    
    CODE EXAMPLE:
    WebElement single = driver.findElement(By.id("search"));
    List<WebElement> all = driver.findElements(By.className("product"));
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q2: EXPLAIN IMPLICIT WAIT vs EXPLICIT WAIT vs FLUENT WAIT                               ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    IMPLICIT WAIT:
    - Applied GLOBALLY to all elements
    - Set once, applies everywhere
    - Waits for element to appear in DOM
    - driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    EXPLICIT WAIT:
    - Applied to SPECIFIC elements
    - Waits for specific condition
    - More control and flexibility
    - WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    - wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("x")));
    
    FLUENT WAIT:
    - Most flexible
    - Custom polling interval
    - Can ignore specific exceptions
    - FluentWait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class);
    
    ⚠️ DON'T MIX IMPLICIT AND EXPLICIT WAITS!
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q3: HOW DO YOU HANDLE STALE ELEMENT EXCEPTION?                                          ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    CAUSE: Element was found but DOM changed/refreshed before action
    
    SOLUTIONS:
    1. Re-find the element
    2. Use explicit wait with refreshed condition
    3. Use retry mechanism
    4. Use Page Object Model with @FindBy
    
    CODE:
    // Solution 1: Re-find
    try {
        element.click();
    } catch (StaleElementReferenceException e) {
        element = driver.findElement(By.id("x"));
        element.click();
    }
    
    // Solution 2: Refreshed condition
    wait.until(ExpectedConditions.refreshed(
        ExpectedConditions.elementToBeClickable(By.id("x"))
    )).click();
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q4: HOW DO YOU HANDLE MULTIPLE WINDOWS/TABS?                                            ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    CODE:
    // Store parent window
    String parentWindow = driver.getWindowHandle();
    
    // Click element that opens new window
    element.click();
    
    // Get all window handles
    Set<String> allWindows = driver.getWindowHandles();
    
    // Switch to new window
    for (String window : allWindows) {
        if (!window.equals(parentWindow)) {
            driver.switchTo().window(window);
            break;
        }
    }
    
    // Do actions in new window
    // ...
    
    // Close new window and switch back
    driver.close();
    driver.switchTo().window(parentWindow);
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q5: HOW DO YOU HANDLE DROPDOWN?                                                         ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    FOR <select> TAG:
    Select dropdown = new Select(driver.findElement(By.id("dropdown")));
    dropdown.selectByVisibleText("Option 1");
    dropdown.selectByValue("opt1");
    dropdown.selectByIndex(0);
    
    FOR NON-SELECT (Custom dropdown):
    // Click to open dropdown
    driver.findElement(By.id("dropdown-toggle")).click();
    // Click on option
    driver.findElement(By.xpath("//li[text()='Option 1']")).click();
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q6: EXPLAIN ACTIONS CLASS                                                               ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    Used for: Mouse & Keyboard actions
    
    Actions actions = new Actions(driver);
    
    // Mouse hover
    actions.moveToElement(element).perform();
    
    // Right click
    actions.contextClick(element).perform();
    
    // Double click
    actions.doubleClick(element).perform();
    
    // Drag and drop
    actions.dragAndDrop(source, target).perform();
    
    // Click and hold
    actions.clickAndHold(element).perform();
    
    // Keyboard actions
    actions.sendKeys(Keys.ENTER).perform();
    actions.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q7: HOW DO YOU HANDLE ALERTS?                                                           ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    // Switch to alert
    Alert alert = driver.switchTo().alert();
    
    // Get alert text
    String text = alert.getText();
    
    // Accept (OK)
    alert.accept();
    
    // Dismiss (Cancel)
    alert.dismiss();
    
    // Send text to prompt
    alert.sendKeys("input text");
    
    // Check if alert exists
    try {
        driver.switchTo().alert();
    } catch (NoAlertPresentException e) {
        // No alert
    }
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q8: HOW DO YOU HANDLE FRAMES/IFRAMES?                                                   ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    // Switch by ID or Name
    driver.switchTo().frame("frame-id");
    
    // Switch by index
    driver.switchTo().frame(0);
    
    // Switch by WebElement
    WebElement iframe = driver.findElement(By.tagName("iframe"));
    driver.switchTo().frame(iframe);
    
    // Switch back to main content
    driver.switchTo().defaultContent();
    
    // Switch to parent frame
    driver.switchTo().parentFrame();
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q9: WHAT IS PAGE OBJECT MODEL (POM)?                                                    ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    Design pattern where:
    - Each web page = One Java class
    - Page elements = Class variables
    - Page actions = Class methods
    
    BENEFITS:
    - Code reusability
    - Easy maintenance
    - Reduced code duplication
    - Readable tests
    
    EXAMPLE:
    public class LoginPage {
        @FindBy(id = "email")
        private WebElement emailInput;
        
        @FindBy(id = "password")
        private WebElement passwordInput;
        
        @FindBy(id = "submit")
        private WebElement submitBtn;
        
        public void login(String email, String password) {
            emailInput.sendKeys(email);
            passwordInput.sendKeys(password);
            submitBtn.click();
        }
    }
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q10: DIFFERENCE BETWEEN close() AND quit()?                                             ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    close():
    - Closes CURRENT browser window/tab
    - WebDriver session still active
    
    quit():
    - Closes ALL browser windows
    - Ends WebDriver session
    - Releases resources
    
    BEST PRACTICE: Always use quit() in @AfterTest/tearDown
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q11: HOW DO YOU TAKE SCREENSHOT?                                                        ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    // Cast driver to TakesScreenshot
    TakesScreenshot ts = (TakesScreenshot) driver;
    
    // Take screenshot
    File src = ts.getScreenshotAs(OutputType.FILE);
    
    // Save to file
    Files.copy(src.toPath(), Path.of("screenshot.png"));
    
    // Get as bytes
    byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
    
    // Get as Base64
    String base64 = ts.getScreenshotAs(OutputType.BASE64);
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q12: WHAT IS JAVASCRIPTEXECUTOR?                                                        ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    Used to execute JavaScript in browser
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    // Scroll down
    js.executeScript("window.scrollBy(0, 500)");
    
    // Scroll to element
    js.executeScript("arguments[0].scrollIntoView(true);", element);
    
    // Click (when regular click fails)
    js.executeScript("arguments[0].click();", element);
    
    // Get page title
    String title = (String) js.executeScript("return document.title");
    
    // Highlight element
    js.executeScript("arguments[0].style.border='3px solid red'", element);
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q13: HOW DO YOU HANDLE DYNAMIC ELEMENTS?                                                ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    STRATEGIES:
    
    1. Use partial matching
       //input[contains(@id,'search')]
       //div[starts-with(@id,'product_')]
    
    2. Use stable parent
       //div[@id='stable-parent']//input[@type='text']
    
    3. Use other attributes
       //input[@name='q']
       //input[@placeholder='Search']
    
    4. Use text content
       //button[text()='Submit']
    
    5. Use explicit waits
       wait.until(ExpectedConditions.presenceOfElementLocated(...))
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q14: WHAT ARE THE TYPES OF LOCATORS? (Order of preference)                              ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    1. By.id("id")           → FASTEST, unique
    2. By.name("name")       → Usually stable
    3. By.className("class") → If unique
    4. By.tagName("tag")     → Rarely unique
    5. By.linkText("text")   → For links only
    6. By.partialLinkText()  → For partial link text
    7. By.cssSelector()      → Fast, flexible
    8. By.xpath()            → Most powerful, slower
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q15: SELENIUM 4 NEW FEATURES                                                            ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    1. Relative Locators (Friendly Locators)
       By.above(), By.below(), By.toLeftOf(), By.toRightOf(), By.near()
       
       WebElement password = driver.findElement(
           with(By.tagName("input")).below(By.id("email"))
       );
    
    2. New Window/Tab handling
       driver.switchTo().newWindow(WindowType.TAB);
       driver.switchTo().newWindow(WindowType.WINDOW);
    
    3. Chrome DevTools Protocol (CDP)
       DevTools devTools = ((ChromeDriver) driver).getDevTools();
    
    4. No need for WebDriverManager (built-in driver management)
    
    5. Better Grid architecture
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q16: HOW TO HANDLE AJAX CALLS?                                                          ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    ANSWER: Use Explicit Waits
    
    // Wait for element to appear after AJAX
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ajax-content")));
    
    // Wait for element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(By.id("button")));
    
    // Wait for element to disappear (loading spinner)
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("spinner")));
    
    // Wait for JavaScript to complete
    wait.until(driver -> ((JavascriptExecutor) driver)
        .executeScript("return document.readyState").equals("complete"));
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q17: WHAT IS DATA-DRIVEN TESTING?                                                       ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    Running SAME test with DIFFERENT data
    
    Sources:
    - Excel files (Apache POI)
    - CSV files
    - Database
    - TestNG @DataProvider
    - JSON files
    
    EXAMPLE with @DataProvider:
    
    @DataProvider
    public Object[][] loginData() {
        return new Object[][] {
            {"user1@test.com", "pass1"},
            {"user2@test.com", "pass2"},
            {"user3@test.com", "pass3"}
        };
    }
    
    @Test(dataProvider = "loginData")
    public void testLogin(String email, String password) {
        login(email, password);
    }
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q18: WHAT IS HEADLESS BROWSER?                                                          ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    Browser that runs WITHOUT graphical interface
    
    BENEFITS:
    - Faster execution
    - Less memory
    - Good for CI/CD
    
    CODE:
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    WebDriver driver = new ChromeDriver(options);
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q19: ASSERTION TYPES (TestNG)                                                           ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    HARD ASSERTION (stops on failure):
    Assert.assertEquals(actual, expected);
    Assert.assertTrue(condition);
    Assert.assertFalse(condition);
    Assert.assertNotNull(object);
    
    SOFT ASSERTION (continues after failure):
    SoftAssert soft = new SoftAssert();
    soft.assertEquals(actual, expected);
    soft.assertTrue(condition);
    soft.assertAll();  // MUST call at end!
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║ Q20: TESTNG ANNOTATIONS (Execution Order)                                               ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    @BeforeSuite    → Once before all tests
    @BeforeTest     → Before <test> in XML
    @BeforeClass    → Before first method in class
    @BeforeMethod   → Before EACH @Test method
    
    @Test           → Test method
    
    @AfterMethod    → After EACH @Test method
    @AfterClass     → After all methods in class
    @AfterTest      → After <test> in XML
    @AfterSuite     → Once after all tests
    
    */

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║           Interview Q&A - Read and Prepare Well!              ║");
        System.out.println("║           All answers are in the comments above!              ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");
    }
}
