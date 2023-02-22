package waitStandradProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teclisticprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.techlistic.com/");
	       
	       driver.manage().getCookies();
	       System.out.println(driver.getTitle());
	       //for Mazimum
	       driver.manage().window().maximize();
	       
	       //for minimize
	       driver.manage().window().setSize(new Dimension(500,600));
	       driver.manage().window().maximize();
	     driver.findElement(By.id("ez-accept-all"));
	       driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/java.html']")).click();
	       System.out.println("page Title is :"+driver.getTitle());
	       driver.navigate().back();
	       
	       driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/selenium-tutorials.html']")).click();
	       System.out.println("page Title is :"+driver.getTitle());
	       driver.navigate().back();
	       
	       
	       

	}}
