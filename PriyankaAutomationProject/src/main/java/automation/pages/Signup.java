package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	WebDriver driver;

	@FindBy(xpath = "(//form//input[@name='email'])[1]")public WebElement emailAddressField;
	@FindBy(xpath = "//form//input[@name='password']")public WebElement passwordField;
	@FindBy(xpath = "(//form//button[@type='submit'])[1]")public WebElement loginButton;
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")public WebElement yourEmailIdOrPasswordisIncorrect;

	public Signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
