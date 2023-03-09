package window_handel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class WindowHand extends baseclass {

	baseclass base = new baseclass();
	
	@Test
	public void GetWindowHand() throws InterruptedException {
	base.chromesetup();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	Thread.sleep(2000);
	
	String ParentWinddow = driver.getWindowHandle();
	System.out.println("ParentWinddow ID "+ParentWinddow);
	Set<String> AllHandles = driver.getWindowHandles();
	
	Iterator<String> WIterator = AllHandles.iterator();
	WIterator.next();
	String Childwindoow = WIterator.next();
	System.out.println("Child Window HAndel ID2 "+Childwindoow);
	driver.switchTo().window(Childwindoow);
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(ParentWinddow);
	Thread.sleep(2000);
	driver.close();
	System.out.println("End of Program");
	}
}

