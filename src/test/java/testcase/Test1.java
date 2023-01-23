package testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class Test1 extends baseclass {

	baseclass base = new baseclass();

	@BeforeMethod
	@Parameters("browser")
	public void setupbrowser(String broswer) {
		if(broswer.equalsIgnoreCase("chrome"))
		base.chromesetup();
		driver.get("https://www.google.com/");
	}
	@Test
	public void takeSS() throws IOException {
		base.captureSnapShot();
	}
	
	@Test(enabled = false)
	public void test1() {
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		//danish
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
