package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	@FindBy(xpath = "//a[contains(@class,\"shop-menu-btn\")]")
	private WebElement menuButton;
	
	@FindBy(xpath = "//a[contains(@class,\"popup-no-address-link\")]")
	private WebElement skipAddress;
	
	@FindBy(className = "agree-cookie")
	private WebElement agreeCookies;
	
	@FindBy(id = "topup-modal--close")
	private WebElement addToCart;
	
	public HomePage() {
		PageFactory.initElements(getWebDriver(), this);
	}
	
	public void clickMenuButton() {
		
		clickOnElement(menuButton);
	}
	
	public void openMenu() {
		clickOnElement(skipAddress);
	}

	public void gotoHomePage() {
		getWebDriver().get("https://staging.clubkitchen.at");
		
	}
	
	public void acceptCookies() {
		clickOnElement(agreeCookies);
	}

	public void selectDish(String dish) {
		getWebDriver().findElement(By.xpath("//a[@title='" +dish+ "']")).click();
	}

	public void addToCart() {
		clickOnElement(addToCart);
		close();
	}
	
	public void close() {
		getWebDriver().quit();
	}

}
