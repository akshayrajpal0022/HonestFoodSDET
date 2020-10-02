package shared;

import pageObjects.HomePage;

public class Pages {
	
	private static HomePage homePage = new HomePage();
	
	public static HomePage HomePage() {
		return homePage;
	}
}