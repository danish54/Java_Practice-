package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class Test_Dropdown extends baseclass {

	baseclass base = new baseclass();

	@Test(enabled = false)
	public void test1() {

		base.chromesetup();
		driver.get("https://www.amazon.in");
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select dd = new Select(drop);
		dd.selectByVisibleText("Furniture");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}

	@Test(enabled=false)
	public void test2() {
		base.chromesetup();
		driver.get("https://www.amazon.in");
		List<WebElement> drop = driver.findElements(By.xpath("//select[@id='searchDropdownBox']//option"));
		System.out.println(drop.size());
		for (WebElement e : drop) {

			System.out.println(e.getText());
			if (e.getText().equalsIgnoreCase("Furniture"))
				e.click();
		}

	}

	@Test
	public void test3() throws InterruptedException {
		base.chromesetup();
		driver.get("https://www.amazon.in");
		List<WebElement> drop = driver.findElements(By.xpath("//select[@id='searchDropdownBox']//option"));
		System.out.println(drop.size());
		for (WebElement e : drop) {
			System.out.println(e.getText());
			e.click();
			Thread.sleep(100);
		}

	}
	
	@AfterMethod
	public void Close() {
		driver.close();
	}

}
