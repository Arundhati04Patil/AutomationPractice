package Propertyfilecalender;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBuscalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://www.redbus.in/");

		WebElement FromCity_Field = driver.findElement(By.id("src"));
		FromCity_Field.click();
		FromCity_Field.sendKeys("Pune");

		List<WebElement> suggList = driver.findElements(By.cssSelector("div.clearfix.search-wrap>div>div>ul>li"));
		System.out.println("Suggestion count is: " + suggList.size());

		// print one by one all the suggestions
		
		for (int i = 1; i < suggList.size(); i++) {
			//rewrite the path for stale excep
			suggList = driver.findElements(By.cssSelector("div.clearfix.search-wrap>div>div>ul>li"));
			//try{
				String subcity = suggList.get(i).getText();
			System.out.println("Suggcity from:" + subcity);
			//Thread.sleep(3000);

			if (subcity.equals("Swargate, Pune")) {
				suggList.get(i).click();
				break;
			}
			//}catch(Exception e) {

			}
		
		
		/////WebDriverWait wait = new WebDriverWait()
			//Thread.sleep(3000);
		WebElement ToCity_Field = driver.findElement(By.id("dest"));
		ToCity_Field.click();
		ToCity_Field.sendKeys("Goa");

		List<WebElement> suggList1 = driver.findElements(By.cssSelector("#search>div>div:nth-of-type(2)>div>ul>li"));
		System.out.println("Suggestion count is: " + suggList1.size());

		// print one by one all the suggestions
		for (int i1 = 0; i1 < suggList1.size(); i1++) {
			//rewrite the path for stale excep
			suggList1 = driver.findElements(By.cssSelector("#search>div>div:nth-of-type(2)>div>ul>li"));
			String subcity1 = suggList1.get(i1).getText();
			System.out.println("Sugglist1 To :" + subcity1);
			

				if (subcity1.equals("Porvorim, Goa"))
						 						  {
					suggList1.get(i1).click();
					break;
				}
			}

			driver.findElement(By.id("onward_cal")).click();
			driver.findElement(
			By.cssSelector("#rb-calendar_onward_cal>table>tbody>tr:nth-of-type(6)>td:nth-of-type(3)")).click();
			driver.findElement(By.id("search_btn")).click();
			driver.findElement(By.cssSelector("div.search>div:nth-of-type(2)>div>div>div>div>div:nth-of-type(2)>ul:nth-of-type(2)>li:nth-of-type(1)")).click();
			


			// (Exception in thread "main"
			// org.openqa.selenium.ElementClickInterceptedException)
			try {
				driver.findElement(By.cssSelector("div.search>div:nth-of-type(4)>div>div>i")).click();// popup msg

			} catch (Exception e) {

		//	WebElement ResultBus = driver.findElement(By.cssSelector("div>.clearfix.bus-item-details>div>div>div.div>.clearfix.bus-item-details>div>div>div.travels "));
			//System.out.println("Result bus count:"+ResultBus.getText());
			
			}
			
		
	
	

}}