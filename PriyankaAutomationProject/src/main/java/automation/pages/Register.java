package automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	WebDriver driver;

	@FindBy(xpath = "//a//i[@class='fa fa-home']")public WebElement homePage;
	@FindBy(xpath = "//a//i[@class='fa fa-lock']")public WebElement signupAndLogin;
	@FindBy(xpath = "//form//input[@name='name']")public WebElement nameField;
	@FindBy(xpath = "(//form//input[@name='email'])[2]")public WebElement emailAddressField;
	@FindBy(xpath = "(//form//button[@type='submit'])[2]") public WebElement signUpButton;
	@FindBy(xpath = "//span//input[@id='id_gender1']")public WebElement mrAndMrs;
	@FindBy(xpath = "//input[@id='password']")public WebElement passwordField;
    @FindBy(xpath = "//input[@id='newsletter']")public WebElement signupforournewsletter;
    @FindBy(xpath = "//input[@id='optin']")public WebElement receiveSpecialOffersFromOurPartners;
	@FindBy(xpath = "//input[@id='first_name']")public WebElement firstNameField;
	@FindBy(xpath = "//input[@name='last_name']")public WebElement lastNameField;
	@FindBy(xpath = "//input[@name='company']")public WebElement companyField;
	@FindBy(xpath = "//input[@name='address1']")public WebElement address1Field;
	@FindBy(xpath = "//input[@name='address2']")public WebElement address2Field;
	@FindBy(xpath = "//input[@name='state']")public WebElement stateField;
	@FindBy(xpath = "//input[@name='city']")public WebElement cityField;
	@FindBy(xpath = "//input[@name='zipcode']")public WebElement zipcodeField;
	@FindBy(xpath = "//input[@name='mobile_number']")public WebElement mobilenumberField;
	@FindBy(xpath = "(//button[@type='submit'])[1]")public WebElement createAccountButton;
	@FindBy(xpath = "//form//p[text()='Email Address already exist!']")public WebElement emailAddressAlreadyExist;
	@FindBy(xpath = "(//a//i[@class='fa fa-list'])[1]")public WebElement testCasesButton;
	@FindBy(xpath="//h2//b[text()='Test Cases']")public WebElement testCasesText;

	public Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
