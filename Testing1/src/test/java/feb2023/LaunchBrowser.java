package feb2023;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	WebDriver driver;
	
	@Test
	public void launchbrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//div[@class=\"oxd-select-wrapper\"]")).click();
				WebElement el = driver.findElement(By.xpath("//div[@role=\"listbox\"]"));
		
				List <WebElement> ellist = el.findElements(By.xpath("//div[@role=\"listbox\"]//div[@role=\"option\"]"));
				for (WebElement webElement : ellist) {
					
					System.out.println(webElement.getText());
					
					if(webElement.getText().equals("ESS")) {
						
						webElement.click();
					
					}
				}
				
				//driver.quit();
	}

}
