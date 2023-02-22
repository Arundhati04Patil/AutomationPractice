package waitStandradProgram;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minandmaxbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in");
       //for Mazimum
       driver.manage().window().maximize();
       
       //for minimize
       driver.manage().window().setSize(new Dimension(500,600));
       driver.manage().window().maximize();
       
       //page title and print it 
       String appTitle = driver.getTitle();
       System.out.println("page Title:"+appTitle);
       //click on another link amezone pay 
       
       
       //page source title
       driver.findElement(By.cssSelector("a[href='/gp/sva/dashboard?ref_=nav_cs_apay']")).click();
       
       
       //Navigate back to home page
       String pageTitle=driver.getPageSource();
       System.out.println("page Title:"+driver.getTitle());
       driver.navigate().back();
       System.out.println("page Title is:"+driver.getTitle());
       System.out.println("page Title is validation:"+driver.getTitle().equals(appTitle));
       //driver.close();
       
	}

}
