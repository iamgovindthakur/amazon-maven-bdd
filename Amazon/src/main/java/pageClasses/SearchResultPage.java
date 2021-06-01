package pageClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClasses.PageBaseClass;

public class SearchResultPage extends PageBaseClass {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	/* Check Shampoo product getting display for all product */
	public void VaidateShampooResults() {
		Assert.assertEquals(getElement("shampooText_Xpath").getText().replace("\"", ""), "shampoo");
	}

	/* select Brand in left navigation filter as Dove */
	public void selectDoveProduct(String ProductCheckBoxlocator) {
		elementClick(ProductCheckBoxlocator);
	}

	/* Check Dove product getting display for all product */
	public void VaidateDoveProduct() {
		Assert.assertEquals(getElement("firstProduct_Xpath").getText().substring(0, 4), "Dove");
	}

	/* Sort the price low to high */
	public void sortProductLowToHigh() {
		elementClick("sotyByBtn_Xpath");
		elementClick("priceLowToHigh_Xpath");
	}

	/* check the price is sorted based on low to high */
	public void VaidatesortProductLowToHigh() {
		Assert.assertEquals(getElement("lowToHighText_Xpath").getText().substring(7), "Low to High");
	}

	/* click any one product */
	public ProductPage selectProduct(String productLocator) {
		elementClick("firstProduct_Xpath");
		ProductPage productPage = new ProductPage(driver);
		PageFactory.initElements(driver, productPage);
		return productPage;
	}

}
