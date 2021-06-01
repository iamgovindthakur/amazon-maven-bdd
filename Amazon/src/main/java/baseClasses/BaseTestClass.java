package baseClasses;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {

	public WebDriver driver;

	public static Properties prop;

	/****************** Invoke Browser ***********************/
	public void invokeBrowser(String browserName) {

		try {

			if (browserName.equalsIgnoreCase("Chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("Mozila")) {

				WebDriverManager.firefoxdriver().setup();

				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("Opera")) {

				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {

				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else {

				driver = new SafariDriver();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		if (prop == null) {
			prop = new Properties();

			try {
				FileInputStream file = new FileInputStream(System.getProperty("user.dir")
						+ "//src/test//resources//ObjectRepository//projectConfig.properties");
				prop.load(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/****************** Quit Browser ***********************/
	public void quitBrowser() {
		driver.quit();

	}

}
