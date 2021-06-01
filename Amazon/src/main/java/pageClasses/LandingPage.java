package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClasses.PageBaseClass;

public class LandingPage extends PageBaseClass {

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	/* Search shampoo in amazon */
	public SearchResultPage searchProduct(String productName) {
		enterText("searchBox_Xpath", productName);
		elementClick("searchBtn_Xpath");
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		PageFactory.initElements(driver, searchResultPage);
		return searchResultPage;
	}
	
	

}
