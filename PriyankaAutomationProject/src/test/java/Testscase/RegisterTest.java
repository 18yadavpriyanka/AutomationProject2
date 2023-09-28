package Testscase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationexercise.qa.base.Base;
import com.automationexercise.qa.pages.RegisterPage;
import com.automationexercise.qa.utils.Utilities;

public class RegisterTest extends Base {
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
	public void verifyRegisterUser() {

		Register registerpage = new Register(driver);
		boolean homepage = registerpage.verifyHomePage();
		System.out.println(homepage);
		Assert.assertEquals(homepage, true);
		registerpage.clickOnSignUpAndLoginButton();
		registerpage.enterNameField("PRIYA");
		registerpage.enterEmailAddressField("18@gmail.com"));
		registerpage.clickOnSignUpButton();
		registerpage.selectTitle();
		registerpage.enterPassword("223");
		registerpage.selectDOB();
		registerpage.clickOnNewsLetter();
		registerpage.clickOnSpecialOffers();
		registerpage.enterFirstName("priya");
		registerpage.enterLastName("don");
		registerpage.enterCompany("gun");
		registerpage.enterAddress1("2101");
		registerpage.enterAddress2("ibg");
		registerpage.selectCountry();
		registerpage.enterState("maharashtra");
		registerpage.enterCity("Mumbai");
		registerpage.enterZipCode("09990");
		registerpage.enterMobileNumber("9000000099");
		registerpage.clickOnCreateAccount();
	}

	@Test(priority = 2)
	public void verifyTestCasesPage() {
		Register registerpage = new Register(driver);
		boolean homepage = registerpage.verifyHomePage();
		System.out.println(homepage);
		Assert.assertEquals(homepage, true);
		registerpage.clickOnTestCasesButton();
		boolean testcases = registerpage.retriveTestCasesText();
		System.out.println(testcases);
		Assert.assertEquals(testcases, true);
	}
}
