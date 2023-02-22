package day1selenuimprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefoxBrowser2 {

	public static void main(String[] args) {
		// set required driver executable path using System.setProperty(String key,String value)
				// using absolute path
				// System.setProperty("webdriver.gecko.driver","F:\\JavaWorkspace\\Oct01Selenium\\drivers\\geckodriver.exe");

				// or using relative path
				 System.setProperty("Webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");

				// or using current working dir
				//String exePath = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
				//System.setProperty("webdriver.gecko.driver", exePath);

				// create an instance of required browser class
				WebDriver fdriver = new FirefoxDriver();

	}

}
