package Assingementof13Jan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;



public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
	SeleniumUtility s1 = new SeleniumUtility();
	WebDriver driver = s1.setUp("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	//String exePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", exePath);
	
	//WebDriverManager.chromedriver().setup();
	//create an instance of required browser class
	//WebDriver driver=new ChromeDriver();//run time poly example
	//driver.get("https://www.google.com");
	
	//login page
	//WebDriver driver = s1.setUp("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		WebDriverWait wait =new WebDriverWait(driver,20);
		
	
		
	
		s1.typeInput(driver.findElement(By.id("username")),"Admin");
		//Thread.sleep(2000);
		s1.typeInput(driver.findElement(By.name("pwd")),"admin123");
	    s1.performClick(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		//PTM create
		driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2)span")).click();
		driver.findElement(By.cssSelector(" bi-plus")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Automation",Keys.TAB,Keys.TAB);
		driver.findElement(By.name("lastname")).sendKeys("Testing",Keys.TAB);
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("oxd-grid-2 input")).sendKeys("1004",Keys.ENTER);
		driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-of-type(2) span")).click();
		
		//search id present or not 1004
		List<WebElement> record=driver.findElements(By.cssSelector(".oxd-table-body div:nth-of-type(2)>div"));
		for(int i=1;i<record.size();i++) {
			driver.findElement(By.cssSelector(".oxd-table-body div:nth-of-type(2)>div"));
			try {
				if(record.get(i).getText().equals(1004)) {
				}
				driver.findElement(By.cssSelector(".oxd-table-body div:nth-of-type(2)>div"));
				
			}
		catch(StaleElementReferenceException e) {
			
		}
			System.out.println("id is present");
			
			break;
			//search empid
			//driver.findElement(By.cssSelector(".oxd-form-row input.oxd-input")).sendKeys("1991");
			//click on search button
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".oxd-button:nth-of-type(2)")));
			driver.findElement(By.cssSelector(".oxd-button:nth-of-type(2)")).click();//search btn
			//update job title
			driver.findElement(By.cssSelector(".oxd-table-card .bi-check")).click();//click on checkbox
			driver.findElement(By.cssSelector(".bi-pencil-fill")).click();//click on pencil to update 
			driver.findElement(By.cssSelector(".orangehrm-tabs>div:nth-of-type(6)>a")).click();
			
			//check box click
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("")));
			driver.findElement(By.cssSelector(".oxd-button:nth-of-type(2)")).click();//search btn
			//update job title
			driver.findElement(By.cssSelector(".oxd-table-card .bi-check")).click();//click on checkbox
			driver.findElement(By.cssSelector(".bi-pencil-fill")).click();//click on pencil to update 
			driver.findElement(By.cssSelector(".orangehrm-tabs>div:nth-of-type(6)>a")).click();
			
			
				
		}}}
			

