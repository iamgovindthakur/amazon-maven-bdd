package stepDefinition;

import org.openqa.selenium.support.PageFactory;

import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.LandingPage;
import pageClasses.ProductPage;
import pageClasses.SearchResultPage;

public class steps extends BaseTestClass {

	LandingPage landingPage;
	SearchResultPage searchResult;
	ProductPage productPage;

	@Given("Login to Amazon site www.amazon.in")
	public void login_to_Amazon_site_www_amazon_in() {
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
	}

	@When("Search shampoo in amazon")
	public void search_shampoo_in_amazon() {
		searchResult = landingPage.searchProduct("shampoo");
	}

	@Then("Check Shampoo product getting display for all product")
	public void check_Shampoo_product_getting_display_for_all_product() {
		searchResult.VaidateShampooResults();
	}

	@And("Sort the price low to high and check the price is sorted based on low to high")
	public void sort_the_price_low_to_high_and_check_the_price_is_sorted_based_on_low_to_high() {
		searchResult.sortProductLowToHigh();
		searchResult.VaidatesortProductLowToHigh();
	}

	@And("close the browser")
	public void close_the_browser() {
		quitBrowser();
	}

	@Then("select Brand in left navigation filter as Dove")
	public void select_Brand_in_left_navigation_filter_as_Dove() {
		searchResult.selectDoveProduct("doveCheckbox_Xpath");
	}

	@Then("Check Dove product getting display for all product")
	public void check_Dove_product_getting_display_for_all_product() {
		searchResult.VaidateDoveProduct();
	}

	@Then("click any one product and add to wish list")
	public void click_any_one_product_and_add_to_wish_list() {
		productPage = searchResult.selectProduct("firstProduct_Xpath");
		productPage.AddToWishList("addToWishlistBtn_Xpath");
	}

}