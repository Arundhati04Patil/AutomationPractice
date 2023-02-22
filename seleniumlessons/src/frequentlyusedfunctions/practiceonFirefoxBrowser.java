package frequentlyusedfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class practiceonFirefoxBrowser {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");

		//create an instance of required browser class
		 FirefoxDriver fdriver = new FirefoxDriver();
		//enter the required application url
		fdriver.get("https://demosite.executeautomation.com/");
		//print current page title name
		//System.out.println("Application title: "+fdriver.getTitle());
				//or 
		String appTitle=fdriver.getTitle();
		
		System.out.println("page URL:"+fdriver.getCurrentUrl());
		
		
		System.out.println("Application title: "+appTitle);
		

		System.out.println("Application title lenght: "+appTitle.length());
		

		System.out.println("Current page URL is: "+fdriver.getCurrentUrl());
		

		WebElement usernameInputField=fdriver.findElement(By.id("username"));
		
		
		usernameInputField.clear();
		
	
		usernameInputField.sendKeys("execution");
		
		
		WebElement passwordInputField=fdriver.findElement(By.id("password"));
		
		passwordInputField.clear();
	
		passwordInputField.sendKeys("admin");
		
		WebElement signinBtn=fdriver.findElement(By.className("buttonBlue"));
		
		WebElement submitInputField=fdriver.findElement(By.xpath("//input[@type='submit]"));
		signinBtn.click();
		 submitInputField.click();
		 
		
		
		
		
	}

}
