package frequentlyusedfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceSeneriaoFacebook {

	private static final String ExpectedTitle = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com");
	       String appTitle = driver.getTitle();
	       System.out.println("Application Title:"+appTitle);
	      // System.out.println("Application Length:"+appTitle.length());
	       System.out.println("Application Expected title is:"+driver.getTitle()==ExpectedTitle);
	       String homepageTitle = driver.getTitle();
	      System.out.println("Homepage Title:"+homepageTitle);
	       
	       driver.close();

	}

}
