package Assingementof13Jan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class dramejqueryuicom {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility util = new SeleniumUtility();
		driver=util.setUp("chrome","https://jqueryui.com/");
		Actions act= new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		//taking control inside the frame from main page using index
		driver.switchTo().frame(0);
				//or
		//taking control inside the frame from main page using WebElement
//		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);		
		
		//WebElement src=driver.findElement(By.id("draggable"));
		//WebElement target=driver.findElement(By.id("droppable"));
		List<WebElement>sort=driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement target=driver.findElement(By.xpath("//ul[@id='sortable']//li"));
		for(int i=sort.size()-1;i>0; i--) {
			act.dragAndDrop(sort.get(i), target).build().perform();
			Thread.sleep(1500);
		//util.performDranAndDrop(src, target);
		//util.setSleepTime(1500);
		//coming back to main page from the frame
		//driver.switchTo().defaultContent();
		//driver.findElement(By.cssSelector(".logo")).click();
	    //util.cleanUp();

	}}}


