package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Ornageloginpage;
import sharedutilities.baseclass;

public class SimpleTest extends baseclass {
	baseclass base = new baseclass();
	Ornageloginpage obj1;

	@BeforeMethod
	public void setup() throws InterruptedException {
		base.chromesetup();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}

	@Test
	public void dropdown() throws InterruptedException {
		obj1 = new Ornageloginpage(driver);
		obj1.orangelogin();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory");
		driver.findElement(By.xpath("//div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div[3]/div/div[2]"))
				.click();
		List<WebElement> dropdown = driver.findElements(By.xpath("//div[@class=\"oxd-select-option\"]"));
		for (WebElement e : dropdown) {

			System.out.println(e.getText());
		}
	}

	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
