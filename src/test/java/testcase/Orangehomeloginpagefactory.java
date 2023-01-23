package testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Orangehomepagefactory;
import sharedutilities.baseclass;

public class Orangehomeloginpagefactory extends baseclass {

	baseclass base = new baseclass();
	Orangehomepagefactory orgpagefactory;

	@BeforeMethod
	public void setup() throws InterruptedException {
		base.chromesetup();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}

	@Test
	public void login() throws InterruptedException, IOException {
		orgpagefactory = new Orangehomepagefactory(driver);
		orgpagefactory.orangelogin();
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
