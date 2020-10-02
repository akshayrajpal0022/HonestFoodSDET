package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import shared.*;

public class Steps {

	@Given("^user is on homepage$")
	public void user_is_on_homepage(){
		Pages.HomePage().gotoHomePage();
	}

	@When("^user accepts cookies$")
	public void user_accepts_cookies() {
		Pages.HomePage().acceptCookies();
	}

	@And("^user clicks on the menu Button$")
	public void user_click_menu_button() {
		Pages.HomePage().clickMenuButton();
	}

	@And("^user enters the address and proceed$")
	public void user_enters_address() {
		Pages.HomePage().openMenu();
	}
	
	@And("^user selects \"([^\\\"]*)\"$")
	public void user_selects_dish(String dish) {
		Pages.HomePage().selectDish(dish);
	}
	
	@And("^user adds the dish to cart$")
	public void user_adds_dish_to_cart() {
		Pages.HomePage().addToCart();
	}

}
