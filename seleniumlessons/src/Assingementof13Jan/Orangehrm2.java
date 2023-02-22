package Assingementof13Jan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		driver.findElement(By.name("username")).sendKeys("Admin");//,Keys.TAB);
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");//,Keys.ENTER);
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/aside/nav/div/ul/li[2]")).click();
		driver.findElement(By.xpath("html/body/div/div/div[2]/div[2]/div/div[2]/div/buttton")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aaanya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".orangehrm-employee-from>div>div:nth-of-type(2)>div>div>>div:nth-of-type(2)>input")).sendKeys(" ");
		for(int i=0;i<4;i++) {
			driver.findElement(By.cssSelector(".orangehrm-employee-from>div>div:nth-of-type(2)>div>div>>div:nth-of-type(2)>input")).sendKeys("2004");
		}
		driver.findElement(By.cssSelector(".orangehrm-employee-from>div>div:nth-of-type(2)>div>div>>div:nth-of-type(2)>input")).sendKeys("2004");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[6]/a")).click();
		driver.findElement(By.cssSelector("//div[6]/a")).click();
		driver.findElement(By.cssSelector(".orangehrm-edit-employee-content>div>form>div:nth-of-type(1)>div>div:nth-of-type(2)>div>div>div")).click();
        Actions act=new Actions(driver);
        for (int i=0;i<100;i++) {
        	WebElement one=driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)"));
        	act.moveToElement(one).click().sendKeys(Keys.ARROW_DOWN).build().perform();
        	Thread.sleep(1000);
        	if(driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div")) != null);//.()!= null).getText() != null;//equals();
        	break;
        
        }
	
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//click on PIM
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).click();
	driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("2004");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.cssSelector(".orangehrm-container>div>div:nth-of-type(2)  span>i")).click();
	driver.findElement(By.cssSelector(".orangehrm-container>div>div:nth-of-type(2)>div>div>div:nyh-of-type(9)>div button:nth-of-type(1)"));
	driver.findElement(By.xpath("//button[text()='Yes, Delete']")).click();
	driver.findElement(By.cssSelector(".oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).click();
	driver.findElement(By.cssSelector(".orangehrm-employee-from>div>div:nth-of-type(2)>div>div>>div:nth-of-type(2)>input")).sendKeys("2004");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//System.out.println("The PIM is deleted");
}}
