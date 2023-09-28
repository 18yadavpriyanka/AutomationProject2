package Testscase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationexercise.qa.base.Base;
import com.automationexercise.qa.pages.ProductsPage;
import com.automationexercise.qa.pages.RegisterPage;

public class ProductsTest extends Base {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		loadPropertiesFile();
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyAllProductsAndProductDetailPage() {

		Register registerpage = new Register(driver);
		boolean homepage = registerpage.verifyHomePage();
		Assert.assertEquals(homepage, true);
		Products productspage = new Products(driver);
		productspage.clickOnProductsButton();
		boolean allproducts = productspage.verifyAllProductsText();
		Assert.assertEquals(allproducts, true);
		productspage.clickOnViewProduct();
		boolean productname = productspage.verifyProductName();
		Assert.assertEquals(productname, true);
		boolean price = productspage.verifyPriceText();
		Assert.assertEquals(price, true);
	}
}
