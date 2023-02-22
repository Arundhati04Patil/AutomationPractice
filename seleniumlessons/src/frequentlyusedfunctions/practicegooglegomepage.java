package frequentlyusedfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicegooglegomepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		//enter the required application url
		driver.get("https://www.google.com");
		
		System.out.println("Application title: "+driver.getTitle());
		//Featch current url of currentweb page		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Application URL Name: "+currentUrl);
		
		
	
		
		//Fetch print page source of current web page
		//System.out.println("Current page source : "+driver.getPageSource());
		//close current browser
		//driver.close();

	}

}
