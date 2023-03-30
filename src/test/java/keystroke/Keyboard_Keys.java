package keystroke;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class Keyboard_Keys extends baseclass {

	@BeforeMethod
	public void Setup() throws InterruptedException {
		sharedutilities.baseclass.chromesetup();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
	}

	@Test
	public void Keyss() throws InterruptedException {
		
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
		Actions act = new Actions(driver);
		act.moveToElement(name).sendKeys(Keys.TAB).sendKeys("danish").perform();
		Thread.sleep(2000);
	}
	
	@Test(enabled = false)
	public void tabswitch() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}