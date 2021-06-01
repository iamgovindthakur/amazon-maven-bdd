package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
import pageClasses.LandingPage;
import pageClasses.ProductPage;
import pageClasses.SearchResultPage;

public class AmazonTestCases extends BaseTestClass {

	LandingPage landingPage;
	SearchResultPage searchResult;
	ProductPage productPage;

	@Test(groups = "Scenario One",priority=0)
	public void toCheckSearchingAndSortingFuctionality() {
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		searchResult = landingPage.searchProduct("shampoo");
		searchResult.VaidateShampooResults();
		searchResult.sortProductLowToHigh();
		searchResult.VaidatesortProductLowToHigh();
		quitBrowser();
	}

	@Test(groups = "Scenario Two",priority=1)
	public void toCheckSearchingAndSortingAndWishListFuctionality() {
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		searchResult = landingPage.searchProduct("shampoo");
		searchResult.VaidateShampooResults();
		searchResult.selectDoveProduct("doveCheckbox_Xpath");
		searchResult.VaidateDoveProduct();
		productPage = searchResult.selectProduct("firstProduct_Xpath");
		productPage.AddToWishList("addToWishlistBtn_Xpath");
		quitBrowser();
	}
}
