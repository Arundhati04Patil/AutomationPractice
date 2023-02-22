package Scrrenshortoperation;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;
import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Scrrenshort2 {

	public static void main(String[] args) {
		SeleniumUtility m1=new SeleniumUtility();	
		WebDriver driver=m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		//type cast WebDriver instance into TakesScreenshot interface
		String fileLocation=".\\screenshots\\vtiger_"+System.currentTimeMillis()+".jpg";
		m1.takeScreenshot(fileLocation);

	}

}
