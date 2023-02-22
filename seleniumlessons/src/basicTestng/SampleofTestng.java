package basicTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleofTestng {


	WebDriver driver;
	
	@BeforeTest
	
public void launchbrowser(){
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.id("username")).sendKeys("admin");
		
	}
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		System.out.println("Title of current page:"+title);
	}
	@AfterTest
	public void closebrowser() {
		
		driver.close();
		
	}
	

}
