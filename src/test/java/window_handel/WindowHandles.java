package window_handel;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import sharedutilities.baseclass;

public class WindowHandles extends baseclass {
	
baseclass base = new baseclass();
	
	@Test
	public void Windowhandelprogram() throws InterruptedException {
		
		base.chromesetup();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		Thread.sleep(2000);
		
		String Parentwindow = driver.getWindowHandle();
		Set<String> Allwindows = driver.getWindowHandles();
		
		for(String e: Allwindows) {
			
			if(!e.equalsIgnoreCase(Parentwindow)) {
				
				driver.switchTo().window(e);
				System.out.println("Child Window name "+e);
				driver.close();
			}
			
			if(e.equalsIgnoreCase(Parentwindow)) {
				System.out.println("This is parent window");
			}
			else {
	  			  System.out.println("There are no child windows");
			
		}
			}
		
		driver.switchTo().window(Parentwindow);
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
