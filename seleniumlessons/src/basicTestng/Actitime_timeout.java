package basicTestng;

import org.testng.annotations.Test;

public class Actitime_timeout {
	@Test(enabled=true,timeOut=200)
	public void openBrowserAndAppURL() throws InterruptedException {
		Thread.sleep(300);
		System.out.println("Open browser and enter app url");
	}
}