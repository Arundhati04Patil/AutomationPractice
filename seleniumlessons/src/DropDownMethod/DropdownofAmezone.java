package DropDownMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class DropdownofAmezone {

	public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
		//set required driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		// ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();	
		
		//driver.findElement(By.cssSelector(""));  //#idvalue, HTMLTag#idvalue, HTMLTag[id='value']
		
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Thread.sleep(5000);
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		//classname ref_variable = new classname();
		
		Select select = new Select(dropdown);
		
		//select.selectByVisibleText("Books"); 
		
		//select.selectByIndex(4);    //Amazon Fresh    //index value start from 0
		
		select.selectByValue("search-alias=electronics");   //Electronics
		
		//Assignment for Drop Down
		//https://www.globalsqa.com/samplepagetest/
		
	}

}
