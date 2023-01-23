package testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Ornageloginpage;
import sharedutilities.baseclass;

public class OrangeLogin extends baseclass {

	baseclass base = new baseclass();
	Ornageloginpage obj;

	@BeforeMethod
	public void setup() {
		base.chromesetup();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test
	public void login() throws IOException, InterruptedException {

		obj = new Ornageloginpage(driver);
		obj.orangelogin();
		Thread.sleep(2000);
		base.captureSnapShot();
		String url = driver.getCurrentUrl();
		assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", url);
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
