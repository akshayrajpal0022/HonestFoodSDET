package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	static WebDriver driver;
	static WebDriverWait wait;
	JavascriptExecutor js;

	BasePage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en-GB");
		options.addArguments("disable-infobars");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 5000);
	}

	/**
	 * This method can be used to get current driver instance
	 * @return
	 */
	public WebDriver getWebDriver() {
		return driver;
	}

	/**
	 * This method is used to wait until element is visible
	 * @param element
	 * @return
	 */
	protected static WebElement waitTillVisible(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is used to wait until element is clickable
	 * @param element
	 * @return
	 */
	protected WebElement waitTillElementClickable(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method is used to click on an element
	 * @param element
	 */
	protected void clickOnElement(WebElement element) {
		waitTillVisible(element);
		waitTillElementClickable(element);
		element.click();
	}

}