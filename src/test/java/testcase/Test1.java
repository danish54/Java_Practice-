package testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class Test1 extends baseclass {

	baseclass base = new baseclass();

	@BeforeMethod
	public void setupbrowser() {
		base.setup();
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
