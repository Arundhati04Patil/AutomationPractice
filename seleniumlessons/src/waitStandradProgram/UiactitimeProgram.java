package waitStandradProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiactitimeProgram {

	private static WebElement loginBtn;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.get("https://demo.actitime.com");
	       WebElement userNameInputField=driver.findElement(By.className("textField"));
	       
	       //UserName Field
			System.out.println("User name input field visible or not? "+userNameInputField.isDisplayed());
			System.out.println("User name input field editable or not? "+userNameInputField.isEnabled());
			String userNameInputFieldValue=userNameInputField.getAttribute("placeholder");
			System.out.println("Default value validation status: "+userNameInputFieldValue.equals("userName"));
			
			//Password field
			 WebElement passwordInputField=driver.findElement(By.className("textField"));
		       
		       
				System.out.println("Password input field visible or not? "+passwordInputField.isDisplayed());
				System.out.println("Password input field editable or not? "+passwordInputField.isEnabled());
				String passwordInputFieldValue=passwordInputField.getAttribute("placeholder");
				System.out.println("Default value validation status: "+passwordInputFieldValue.equals("password"));
			
				//Checkbox Field
				
				WebElement checkboxBtn=driver.findElement(By.name("remember"));
			       
			       
				System.out.println("check box Button is visible or not? "+checkboxBtn.isDisplayed());
				System.out.println(" check box Button is editable or not? "+checkboxBtn.isEnabled());
				System.out.println("check box button default selection status? "+checkboxBtn.isSelected());	
				checkboxBtn.click();
				System.out.println("After selection, check box button selection status? "+checkboxBtn.isSelected());	
				
				
				
				//login button field
			       
				WebElement loginBtn=driver.findElement(By.id("loginButtonContainer"));
				System.out.println("login Button is visible or not? "+loginBtn.isDisplayed());
				System.out.println(" login Button is editable or not? "+loginBtn.isEnabled());
				System.out.println("login button default selection status? "+loginBtn.isSelected());	
				loginBtn.click();
				System.out.println("After selection, login button selection status? "+loginBtn.isSelected());	
				
				
				
	}

}
