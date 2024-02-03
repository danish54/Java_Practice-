package feb2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	
	WebDriver driver;
	
	@Test
	public void Launch_Browser() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}
