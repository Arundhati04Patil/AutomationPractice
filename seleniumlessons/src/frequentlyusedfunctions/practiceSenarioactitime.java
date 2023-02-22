package frequentlyusedfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiceSenarioactitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.actitime.com");
       String appTitle = driver.getTitle();
       System.out.println("Application Title:"+appTitle);
       System.out.println("Application Length:"+appTitle.length());
       System.out.println("Current page url is:"+driver.getCurrentUrl());
       System.out.println("Current Url page length:"+driver.getCurrentUrl().length());
       //System.out.println("Current page source code lenght: "+driver.getPageSource());
       System.out.println("Current page source code lenght: "+driver.getPageSource().length());
       //driver.close();
     //required conditional wait as Home page takes sometime to update its title
     		WebDriverWait wait=new WebDriverWait(driver,20);
     		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
     		String actualHomePageTitle=driver.getTitle();
     		String expectedHomePageTitle="actiTIME - Enter Time-Track";
     		System.out.println("Actaul Home page title: "+actualHomePageTitle);
     		System.out.println("Home page validation status is: "+actualHomePageTitle.equals(expectedHomePageTitle));
	}

}
