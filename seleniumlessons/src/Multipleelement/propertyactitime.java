package Multipleelement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyactitime {
	

	public static void main(String[] args) throws IOException {
		FileInputStream fis2= new FileInputStream("./addpro2/file1.properties");
		Properties pop=new Properties();
		pop.load(fis2);
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(pop.getProperty("url"));
		//driver.findElement(By.cssSelector("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div>div>input")).sendKeys(pop.getProperty("Firstname"));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div>div:nth-of-type(2)>input")).sendKeys(pop.getProperty("Lastname"));
		driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-of-type(2)>div>textarea"));
		//driver.findElement(By.cssSelector(""));
	}

}
