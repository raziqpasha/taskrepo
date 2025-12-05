# Amazon Product Automation

This sample Selenium project automates an end-to-end search flow on Amazon.com:

1. Navigate to the Amazon home page
2. Search for a user-provided product keyword
3. Click the first result in the search results grid
4. Wait for the product detail page to load by detecting an "Add to Cart" or "Buy Now" button
5. Capture a screenshot of the validated product page

## Prerequisites

- Java 17 or newer
- Maven 3.8+
- Google Chrome or Chromium installed locally (the automation launches a headless Chrome session)

If Chrome/Chromium is not on the default path, update the `CHROME_BINARY` environment variable before running:

```bash
export CHROME_BINARY=/path/to/chrome
```

## Run the workflow

```bash
cd amazon-automation
mvn clean compile
mvn exec:java -Dexec.args="laptop"
```

- Replace `laptop` with any product keyword you would like to search.
- The script defaults to headless mode. To observe a real browser session, change the `headless` argument inside `AmazonProductAutomation#run`.
- A screenshot is written to `target/screenshots/product-details.png` after the product CTA is detected.

## Implementation notes

- `AmazonProductAutomation` centralizes each workflow step (`navigateToHomePage`, `searchForProduct`, `openFirstResult`, `validateProductDetailPage`, `takeScreenshot`) to keep the flow readable.
- Dynamic content is handled exclusively with `WebDriverWait` and helper methods that poll for clickable/search elements and dismiss transient overlays.
- `WebDriverManager` downloads the matching ChromeDriver binary automatically, keeping the project portable.

## Troubleshooting

- **Chrome not found**: install Google Chrome/Chromium, or point Selenium to the binary via `CHROME_BINARY` or by editing `buildChromeOptions`.
- **Element timeouts**: increase the `TIMEOUT` constant in `AmazonProductAutomation` if your network is slow, or adjust the CSS selectors for your locale.
- **Screenshots missing**: ensure the script completes successfully; screenshots are only captured after the product CTA is confirmed.
