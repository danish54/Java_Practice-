package window_handel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class HandelWindow extends baseclass {

	@Test
	public static void Switch1() throws InterruptedException {
		baseclass.chromesetup();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
		Thread.sleep(2000);

		Set<String> allhandels = driver.getWindowHandles();

	Iterator<String> itre = allhandels.iterator();
	if(itre.hasNext()) {
	itre.next();
	System.out.println(itre);
	}
	}
	
	
	
	@Test(enabled = false)
	public static void Switch12() throws InterruptedException {
		baseclass.chromesetup();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
		Thread.sleep(2000);

		Set<String> allhandels = driver.getWindowHandles();

		for (String h : allhandels) {

			driver.switchTo().window(h);
			String title = "AlertsDemo, H Y R Tutorials";
			if (h.equalsIgnoreCase(title)) {
				break;

			}
		}

	}

}
