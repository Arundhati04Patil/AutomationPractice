package Assingementof13Jan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assigmentjqueryuicom {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://jqueryui.com/");
		//SeleniumUtility util = new SeleniumUtility();
		
		Actions act= new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		//driver.findElement(By.cssSelector(".widget>ul>li:nth-of-type(5)>a")).click();
		//taking control inside the frame from main page using index
		driver.switchTo().frame(frame);
				//or
		List<WebElement>sort=driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement target=driver.findElement(By.xpath("//ul[@id='sortable']//li"));
		for(int i=sort.size()-1;i>0; i--) {
			act.dragAndDrop(sort.get(i), target).build().perform();
			Thread.sleep(1500);
		}
		
		
		
	   


	}

}
