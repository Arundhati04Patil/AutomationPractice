package xpathwitselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeselenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://demo.actitime.com");
		//driver.findElements(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table/tbody/tr[1]/td/table/tbody/tr[1]"));
		driver.findElement(By.xpath("/html/body/ table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr/td/a[@id='loginButton']")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td/table/tbody/tr[1]")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]")).click();

	}

}
///html/body/ table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr/td/a[@id='loginButton']
//for login


///html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td/input[@name='pwd']   password