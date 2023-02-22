package Multipleelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfoMultielement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://www.cricinfo.com/");

		//popup window should close
		driver.findElement(By.id("_2doB4z")).click();
		List<WebElement>suggList=driver.findElements(By.cssSelector("div._2tvxW>div>div>div"));
		System.out.println("Suggestion count is:"+suggList.size());
        for(int i=0;i<suggList.size();i++) {
       	 System.out.println("suggetition name is :"+suggList.get(i).getText());
        }
        
        //loops for opening page of the required sugg.
        for(int i=0;i<suggList.size();i++) {
       	 String suggName1=suggList.get(i).getText();
       	 if (suggName1.equals("Electronics")) {
       		 suggList.get(i).click();
       		 break;

	}

}}}
