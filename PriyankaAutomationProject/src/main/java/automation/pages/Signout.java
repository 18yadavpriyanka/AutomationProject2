package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {
	WebDriver driver;

	@FindBy(xpath = "//a//i[@class='fa fa-lock']")
	private WebElement logoutButton;

	public Signout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnLogoutButton() {
		logoutButton.click();
	}
}
