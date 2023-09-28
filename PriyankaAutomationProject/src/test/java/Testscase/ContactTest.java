package Testscase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationexercise.qa.base.Base;
import com.automationexercise.qa.pages.ContactUsPage;
import com.automationexercise.qa.pages.RegisterPage;

public class ContactTest extends Base {
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
	public void verifyContactUs() {
		Register registerpage = new Register(driver);
		boolean homepage = registerpage.verifyHomePage();
		System.out.println(homepage);
		Assert.assertEquals(homepage, true);
		Contact contactpage = new Contact(driver);
		contactpage.clickOnContactUsButton();
		contactpage.enterName("Priyanka");
		contactpage.enterEmail("18@gmail.com");
		contactpage.enterSubject("Welcome");
		contactpage.enterYourMessageHere("HEY!!");
		contactpage.clickOnContactUsButton();
	}
}
