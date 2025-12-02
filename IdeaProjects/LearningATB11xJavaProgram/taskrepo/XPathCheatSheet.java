package taskrepo;

/**
 * ╔══════════════════════════════════════════════════════════════════════════════════════════╗
 * ║                     XPATH TRICKS CHEAT SHEET FOR INTERVIEWS                              ║
 * ║                         Amazon.com Element Locator Strategies                            ║
 * ╚══════════════════════════════════════════════════════════════════════════════════════════╝
 * 
 * Print this and keep it handy for your interview!
 */
public class XPathCheatSheet {

    /*
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                           XPATH SYNTAX BASICS                                           ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    ABSOLUTE XPATH (Start from root - NOT RECOMMENDED)
    /html/body/div/div/input
    
    RELATIVE XPATH (Start from anywhere - RECOMMENDED)
    //input[@id='search']
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                           BASIC XPATH PATTERNS                                          ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    1. BY ATTRIBUTE:
       //tagname[@attribute='value']
       //input[@id='twotabsearchtextbox']
       //a[@href='/cart']
       //button[@type='submit']
    
    2. BY TEXT:
       //tagname[text()='exact text']
       //a[text()='Sign In']
       //span[text()='Add to Cart']
    
    3. CONTAINS (Partial Match - VERY USEFUL!):
       //tagname[contains(@attribute,'partial')]
       //input[contains(@id,'search')]
       //div[contains(@class,'product')]
       //span[contains(text(),'Add to')]
    
    4. STARTS-WITH:
       //tagname[starts-with(@attribute,'prefix')]
       //div[starts-with(@id,'product-')]
       //a[starts-with(@href,'/gp/')]
    
    5. ENDS-WITH (XPath 2.0 - May not work in all browsers):
       Use contains instead
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                           ADVANCED XPATH PATTERNS                                       ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    6. MULTIPLE CONDITIONS (AND):
       //input[@type='submit' and @value='Go']
       //a[@class='nav-link' and contains(text(),'Cart')]
       //div[@id='results' and @class='visible']
    
    7. OR CONDITION:
       //input[@id='email' or @id='username']
       //button[@type='submit' or @type='button']
    
    8. NOT CONDITION:
       //div[not(@class='hidden')]
       //input[not(@disabled)]
    
    9. INDEX (Position):
       (//div[@class='product'])[1]     → First product
       (//div[@class='product'])[last()] → Last product
       (//div[@class='product'])[2]     → Second product
       (//li)[position()>2]             → 3rd onwards
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                           AXES (Family Navigation)                                      ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    10. PARENT:
        //span[@class='price']/parent::div
        //input[@id='qty']/..
    
    11. CHILD:
        //div[@id='cart']/child::span
        //ul[@class='menu']/li
    
    12. ANCESTOR (Go up the tree):
        //span[text()='Apple']/ancestor::div
        //input[@id='submit']/ancestor::form
    
    13. DESCENDANT (Go down the tree):
        //div[@id='search-results']//span
        //form[@id='login']//input
    
    14. FOLLOWING-SIBLING (Next siblings):
        //label[text()='Email']/following-sibling::input
        //th[text()='Price']/following-sibling::td
    
    15. PRECEDING-SIBLING (Previous siblings):
        //input[@id='password']/preceding-sibling::label
    
    16. FOLLOWING (All elements after):
        //div[@id='header']/following::div[1]
    
    17. PRECEDING (All elements before):
        //div[@id='footer']/preceding::div[1]
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                     AMAZON.COM SPECIFIC XPATHS                                          ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    SEARCH BOX:
    //input[@id='twotabsearchtextbox']
    //input[contains(@id,'searchtextbox')]
    //input[@placeholder='Search Amazon']
    
    SEARCH BUTTON:
    //input[@id='nav-search-submit-button']
    //input[@type='submit' and @value='Go']
    
    CATEGORY DROPDOWN:
    //select[@id='searchDropdownBox']
    //select[contains(@class,'nav-search-dropdown')]
    
    SEARCH RESULTS:
    //div[@data-component-type='s-search-result']
    //div[contains(@class,'s-result-item')]
    (//div[@data-component-type='s-search-result'])[1]  → First result
    
    PRODUCT TITLE:
    //span[@id='productTitle']
    //h1[contains(@class,'product-title')]
    
    PRODUCT PRICE:
    //span[@class='a-price-whole']
    //span[contains(@class,'a-price')]//span[@class='a-offscreen']
    //span[@id='priceblock_ourprice']
    
    ADD TO CART:
    //input[@id='add-to-cart-button']
    //input[@name='submit.add-to-cart']
    //span[text()='Add to Cart']/parent::button
    
    BUY NOW:
    //input[@id='buy-now-button']
    //input[contains(@id,'buy-now')]
    
    CART ICON:
    //a[@id='nav-cart']
    //a[contains(@href,'cart')]
    
    CART COUNT:
    //span[@id='nav-cart-count']
    //span[contains(@class,'nav-cart-count')]
    
    ACCOUNT/SIGN-IN:
    //a[@id='nav-link-accountList']
    //span[contains(text(),'Hello')]
    
    NAVIGATION MENU:
    //a[@id='nav-hamburger-menu']
    //div[@id='nav-main']//a
    
    FILTERS/REFINEMENTS:
    //div[@id='s-refinements']
    //div[contains(@id,'brandsRefinements')]//a
    //span[text()='Apple']/ancestor::a
    
    PAGINATION:
    //a[contains(@class,'s-pagination-next')]
    //span[contains(@class,'s-pagination-selected')]
    //a[@class='s-pagination-item'][text()='2']
    
    STAR RATING:
    //i[contains(@class,'a-star-4')]
    //span[contains(@class,'a-icon-star')]
    
    PRODUCT IMAGES:
    //img[@id='landingImage']
    //div[@id='altImages']//img
    
    QUANTITY DROPDOWN:
    //select[@id='quantity']
    //select[@name='quantity']
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                         XPATH TRICKS & TIPS                                             ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    🔥 TRICK 1: Dynamic IDs - Use contains/starts-with
       BAD:  //div[@id='product_123456']
       GOOD: //div[contains(@id,'product_')]
       GOOD: //div[starts-with(@id,'product_')]
    
    🔥 TRICK 2: Spaces in class names
       BAD:  //div[@class='a-price a-text-normal']
       GOOD: //div[contains(@class,'a-price')]
    
    🔥 TRICK 3: Find element by visible text
       //button[normalize-space()='Add to Cart']
       //a[normalize-space(text())='Sign In']
    
    🔥 TRICK 4: Case insensitive (using translate)
       //input[translate(@placeholder,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='search']
    
    🔥 TRICK 5: Find nth element from list
       (//div[@class='product'])[3]  → 3rd product
       (//li/a)[last()]              → Last link
    
    🔥 TRICK 6: Find element with multiple classes
       //div[contains(@class,'class1') and contains(@class,'class2')]
    
    🔥 TRICK 7: Find empty element
       //input[not(text())]
       //div[not(node())]
    
    🔥 TRICK 8: Find parent by child
       //span[text()='Price']/parent::div
       //input[@id='email']/ancestor::form
    
    🔥 TRICK 9: Find sibling
       //label[text()='Email']/following-sibling::input[1]
    
    🔥 TRICK 10: Wildcard for any tag
       //*[@id='unique-id']
       //form//*[@type='submit']
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                    HOW TO FIND XPATH IN BROWSER                                         ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    STEP 1: Right-click on element → Inspect
    STEP 2: In DevTools, right-click on HTML → Copy → Copy XPath
    
    BUT! The copied XPath is usually ABSOLUTE (bad)
    
    BETTER WAY:
    1. Look at the element's attributes (id, class, name)
    2. Write your own relative XPath
    3. Test in Console: $x("your-xpath")
    
    TESTING XPATH IN BROWSER CONSOLE:
    $x("//input[@id='twotabsearchtextbox']")
    $x("//div[contains(@class,'product')]")
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                    XPATH vs CSS SELECTOR                                                ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    CSS Selector is FASTER but XPath is MORE POWERFUL
    
    Feature              | XPath | CSS
    ---------------------|-------|-----
    By ID                | ✅    | ✅   #id
    By Class             | ✅    | ✅   .class
    By Attribute         | ✅    | ✅   [attr=value]
    Contains Text        | ✅    | ❌
    Parent Navigation    | ✅    | ❌
    Sibling Navigation   | ✅    | ✅   (limited)
    Axes (ancestor,etc)  | ✅    | ❌
    Index                | ✅    | ✅   :nth-child()
    
    USE XPATH WHEN:
    - Need to find by text
    - Need to navigate to parent
    - Need complex ancestor/descendant logic
    
    USE CSS WHEN:
    - Simple attribute matching
    - Performance is critical
    - ID or class based selection
    
    
    ╔══════════════════════════════════════════════════════════════════════════════════════════╗
    ║                    LOCATOR PRIORITY (Interview Answer!)                                 ║
    ╚══════════════════════════════════════════════════════════════════════════════════════════╝
    
    Priority Order (Best to Worst):
    
    1. ID         → Most reliable, unique by definition
    2. Name       → Usually stable
    3. CSS ID     → #myId (same as ID but CSS syntax)
    4. CSS Class  → .myClass (if unique)
    5. Link Text  → For anchor tags only
    6. XPath      → When above don't work
    7. CSS Complex→ Advanced CSS selectors
    
    */

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("║          XPath Cheat Sheet - Print and Use in Interview!     ║");
        System.out.println("║          Read the comments in this file for all XPaths!      ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════╝");
    }
}
