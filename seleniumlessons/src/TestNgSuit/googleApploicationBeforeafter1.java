package TestNgSuit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class googleApploicationBeforeafter1 extends SeleniumUtility{
	WebDriver driver;
	@BeforeTest
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}
	@Test
	public void testSearch() {
		getActiveElement().sendKeys("SQL", Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
	}
	private String getCurrentTitleOfApplication() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
/**
 * precondition: open browser and enter google url
 * 			TC1: validation google page
 * 			TC2: search SQL and validation search result page
 * post-condition: close the browser 
 */