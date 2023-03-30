package window_handel;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class Switch_To_Tabs extends baseclass {

	@BeforeMethod
	public void Setup() throws InterruptedException {
		sharedutilities.baseclass.chromesetup();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		Thread.sleep(2000);
	}

	@Test
	public void MultiTab() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
		Thread.sleep(2000);
		String Parentwindow = driver.getWindowHandle();
		Set<String> Allwindow = driver.getWindowHandles();

		for (String e : Allwindow) {

			if (!e.equalsIgnoreCase(Parentwindow)) {
				Thread.sleep(2000);
				driver.switchTo().window(e);
				Thread.sleep(2000);
			}
		}
	}
}
