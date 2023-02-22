package SeleniumUtility;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class AssingementofVtigerTaskcreation {

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
				
				WebDriverWait wait1 = new WebDriverWait(driver, 30);
			//	wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li #select2-result-label-34")));
			//	driver.findElement(By.cssSelector("li #select2-result-label-34")).click();
			//	Select scl = new Select(dropdown);
			//	scl.selectByVisibleText("Mrs.");
				
			// ***************lead creation***************	
				driver.findElement(By.name("firstname")).sendKeys("Sara",Keys.TAB);
				driver.findElement(By.name("lastname")).sendKeys("Patel");
				driver.findElement(By.xpath("//input[@id='Leads_editView_fieldName_phone']")).sendKeys("9875354334");
				driver.findElement(By.xpath("//input[@id='Leads_editView_fieldName_company']")).sendKeys("Ananya");
				driver.findElement(By.xpath("//input[@id='Leads_editView_fieldName_mobile']")).sendKeys("8676536765");
			//*************	save lead*****************
				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
				driver.findElement(By.xpath("//button[text()='Save']")).click();
				Thread.sleep(3000);
				
			//*********modify/edit lead*****************
				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Edit']")));
				driver.findElement(By.xpath("//button[text()='Edit']")).click();
				
				driver.findElement(By.id("s2id_autogen3")).click();
//				wait1.until(ExpectedConditions.elementToBeClickable(By.id("s2id_autogen3")));
//				driver.findElement(By.id("s2id_autogen3")).click();
				
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
					
					wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@title='All']")));
					driver.findElement(By.xpath("//p[@title='All']")).click();
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arundhati");
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
					driver.findElement(By.xpath("//button[@data-trigger='listSearch']//span")).click();
					
			    //**********validation for searched data
					String Expectedpg =  "Leads";
				//	String Actualpg= driver.getCurrentUrl();
				//	System.out.println(ActualTitle);
						if(Expectedpg.contains("Leads")) {
							System.out.println("Added Id is present");
						}
						else {
							System.out.println("Added Id is not present");
						}
						
					wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='listViewRecordActions']//div[@class='table-actions']/span[4]")));
					driver.findElement(By.xpath("//td[@class='listViewRecordActions']//div[@class='table-actions']/span[4]")).click();
					driver.findElement(By.cssSelector("div>ul .deleteRecordButton")).click();
					driver.findElement(By.xpath("//button[text()='Yes']")).click(); 
					driver.findElement(By.xpath("//thead/tr[2]/th[1]/div[1]/button[2]")).clear();    ///clear
					driver.close();
					
					/*driver.findElement(By.xpath("//div[@class='btn-group']//button[@data-toggle='dropdown']")).click();
					driver.findElement(By.cssSelector("#Leads_detailView_moreAction_Delete_Lead>a")).click();
				    driver.findElement(By.xpath("//button[text()='Yes']")).click(); */
				
			}
	}


