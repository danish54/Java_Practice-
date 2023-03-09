package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class Explicit_Wait extends baseclass {

	baseclass base = new baseclass();

	@BeforeMethod
	public void setup() {
		base.chromesetup();
	}

	@Test
	public void test2() {
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ali.danish.hcl@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		base.Ewait("");
		driver.findElement(By.xpath("")).click();
	}

	@AfterMethod
	public void Close() {
		//driver.close();
	}

}
