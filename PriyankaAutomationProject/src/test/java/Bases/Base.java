package Bases;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.automationexercise.qa.utils.Utilities;

public class Base {
	WebDriver driver;
	public Properties prop;
	public Properties dataProp;

	public void loadPropertiesFile() {
		prop = new Properties();


	public WebDriver initializeBrowserAndOpenApplicationURL(String broswer) {
		if (broswer.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (broswer.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (broswer.equals("safari")) {
			driver = new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));

		driver.get(prop.getProperty("url"));
		return driver;
	}
	 // Method to verify the title is equal to expected title
	public void titleEquals(String expectedTitle) {
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle,"Actual Title is equal to the expected Title(" + expectedTitle + ")");
		System.out.println(actualTitle);
	}

	// Method to verify the innerHtmlText of the single webelement is equal to the expected text
	public void innerTextEquals(WebElement element, String expectedText) {
		String actualText = element.getText();
		assertEquals(actualText, expectedText);
		System.out.println(actualText);
	}
	
	// Method to verify the innerHtmlText of the multiple webelement is equal to the expected text
	public void multipleInnerTextEquals(List<WebElement> element, String expectedText) {
		for(WebElement data: element) {
			String actualText = data.getText();
			assertEquals(actualText, expectedText);	
		}
			
	}

	// Method to verify whether the element is available in the application or not
	public void elementAvailable(WebElement element, boolean expectedValue) {
		boolean actualValue = element.isDisplayed();
		assertEquals(actualValue, expectedValue);
		System.out.println(actualValue);
	}

	// Method to verify whether the element is enabled in the application or not
	public void elementEnabled(WebElement element, boolean expectedValue) {
		boolean actualValue = element.isEnabled();
		assertEquals(actualValue, expectedValue);
	}

	// Method to verify whether the element is selected in the application or not
	public void elementSelected(WebElement element, boolean expectedValue) {
		boolean actualValue = element.isEnabled();
		assertEquals(actualValue, expectedValue);
	}
	
}
