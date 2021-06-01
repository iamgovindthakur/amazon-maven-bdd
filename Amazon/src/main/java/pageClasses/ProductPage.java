package pageClasses;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import baseClasses.PageBaseClass;

public class ProductPage extends PageBaseClass {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	/* adding product to wish list */
	public void AddToWishList(String WishListBtnLocator) {

		Set<String> handles = driver.getWindowHandles();
		String currentHandle = driver.getWindowHandle();
		for (String handle : handles) {
			if (!handle.equals(currentHandle)) {
				driver.switchTo().window(handle);
			}
		}
		elementClick(WishListBtnLocator);
	}
}
