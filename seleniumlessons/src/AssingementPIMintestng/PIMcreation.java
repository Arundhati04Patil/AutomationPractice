package AssingementPIMintestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class PIMcreation extends SeleniumUtility {
	WebDriver driver;
	Actions act;
	List<WebElement>emp;
	
  @Test
  public void testPIMCreate() throws InterruptedException {
	  driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  act = new Actions(driver);
	  String[] u = driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText().split(": ");
	  String[] p = driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText().split(": ");
	  driver.findElement(By.name("username")).sendKeys(u[1],Keys.TAB);
	  driver.findElement(By.name("password")).sendKeys(p[1],Keys.ENTER);
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.urlContains("addEmployee"));
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ovi");
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patil");
	  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  driver.findElement(By.cssSelector("div.oxd-topbar-body>nav >ul>li:nth-of-type(2)")).click();
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  driver.findElement(By.xpath("//[@id=app]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("ovi");
	  driver.findElement(By.xpath("//[@id=app]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
  
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
  }}}
  
