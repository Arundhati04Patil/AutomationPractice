package basicTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Firsttest_webscript extends SeleniumUtility {
	@Test
	public void testCase1() {
		WebDriver driver = setUp("chrome", "https://www.ecatering.irctc.co.in/");
		
		String expectedTitle="Home | eCatering IRCTC: Order Food on Train Online, Food and Meal on Train, Tasty Food for Train Journey";
		String actualTitle=getCurrentTitleOfApplication();
		//below code won't fail your Test case even if validation is failed
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("TC passed");
//		}else {
//			System.out.println("TC failed");
//		}		
		//if validation is failed dn the test case will be marked as failed
		Assert.assertEquals(actualTitle, expectedTitle,"eCatering page validation got failed");
		WebElement searchTrain=driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']"));
		Assert.assertTrue(searchTrain.isDisplayed(), "Train search input field is not visible");
	}

	private String getCurrentTitleOfApplication() {
		// TODO Auto-generated method stub
		return null;
	}
}
/**
Assert.
		assertEquals(arg1,arg2);
		assertEquals(arg1,arg2,"Msg");
			arg: String, any primitive datatype array, collection,
		
		assertTrue(boolean args)
		assertTrue(boolean args,"Msg")
		
		assertFalse(boolean args)
		assertFalse(boolean args,"Msg")
		
		assertNotEquals(arg1,arg2);
		assertNotEquals(arg1,arg2,"Msg");
			arg: String, any primitive datatype, array, collection
		
 */