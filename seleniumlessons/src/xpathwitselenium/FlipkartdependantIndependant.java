package xpathwitselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartdependantIndependant {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//div[div[div[text()='APPLE iPhone 14 (Starlight, 128 GB)']]]/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("//div[div[div[text()='OPPO F19 Pro+ 5G (Fluid Black, 128 GB)']]]/div[2]/div/div/div")).click();
	}

}
