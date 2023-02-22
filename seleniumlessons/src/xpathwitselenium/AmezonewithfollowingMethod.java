package xpathwitselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonewithfollowingMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//div[div[div[text()='APPLE iPhone 14 (Starlight, 128 GB)']]]/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("//span[text()='Anniversary']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Amazon Payments, Inc.']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Greeting Card']//preceding-sibling::div")).click();
		                       //or
		//driver.findElement(By.xpath("//span[text()='Anniversary']//preceding-sibling::div")).click();
	}


	}


