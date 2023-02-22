package day1selenuimprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencromeBrowser {

	public static void main(String[] args) {
		//set required driver executable path using System.setProperty(String key,String value)
				//using absolute path
				//System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\Oct01Selenium\\drivers\\chromedriver.exe");
				
				//or using relative path 
				//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				//or using current working dir
				String exePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				
				//create an instance of required browser class
				ChromeDriver cdriver=new ChromeDriver();
				//To sync automation tool speed with application, we need to use implicit wait to avoid NoSuchElementException
				// after implicit wait, whenever you will use driver instance, you will get 0-30 sec
				cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				// enter the required application url
				cdriver.get("https://demosite.executeautomation.com/Login.html");
				//below driver will get 0-30 sec to identify username input field
				cdriver.findElement(By.name("UserName")).sendKeys("Admin");
				//below driver will get 0-30 sec to identify password input field
				cdriver.findElement(By.name("Password")).sendKeys("admin123");	
				//below driver will get 0-30 sec to identify login button
				cdriver.findElement(By.name("Login")).submit();

	}

}
