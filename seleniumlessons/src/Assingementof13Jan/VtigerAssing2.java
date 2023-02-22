package Assingementof13Jan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class VtigerAssing2 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility m1 = new SeleniumUtility();	
		WebDriver driver = m1.setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	
	//	driver.findElement(By.id("username")).sendKeys("admin");
	//	driver.findElement(By.id("password")).sendKeys("Test@123");
		
	//	marketing-->leads-->creat--> edit--->delet
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();
		driver.findElement(By.xpath("//span[text()=' Leads']")).click();
		
// ***************add lead*******************
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		WebElement dropdown = driver.findElement(By.id("s2id_autogen1"));
		dropdown.click();
		
		driver.findElement(By.id("select2-results-2")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
	//	wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li #select2-result-label-34")));
	//	driver.findElement(By.cssSelector("li #select2-result-label-34")).click();
	//	Select scl = new Select(dropdown);
	//	scl.selectByVisibleText("Mrs.");
		
	// ***************lead creation***************	
		driver.findElement(By.name("firstname")).sendKeys("Arundhati",Keys.TAB);
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		
	//*************	save lead*****************
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//driver.findElement(By.xpath("//div[3]/div/div/button")).click();
		Thread.sleep(3000);
		
	//*********modify/edit lead*****************
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Edit']")));
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		
		driver.findElement(By.id("//button[text()='Edit")).click();
//		wait1.until(ExpectedConditions.elementToBeClickable(By.id("s2id_autogen3")));
//		driver.findElement(By.id("s2id_autogen3")).click();
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select2-results-4>li:nth-of-type(5)")));
		List<WebElement> leadpost = driver.findElements(By.cssSelector("#select2-results-4>li:nth-of-type(5)"));
		System.out.println("print list:" +leadpost.size());
			for(int i=0;i<leadpost.size();i++)
			{
				System.out.println("print posts:" +leadpost.get(i).getText());
					if(leadpost.get(i).getText().equals("Employee")) {
						leadpost.get(i).click();
						
					}
			}
			driver.findElement(By.name("email")).click();
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			//delete lead
			driver.findElement(By.xpath("//div[@class='btn-group']//button[@data-toggle='dropdown']")).click();
			driver.findElement(By.cssSelector("#Leads_detailView_moreAction_Delete_Lead>a")).click();
		    driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.close();
	}



	}


