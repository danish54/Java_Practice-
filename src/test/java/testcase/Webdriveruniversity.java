package testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriveruniversity {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	}

	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		 driver.quit();
	}

	@Test(enabled =false)
	public void dropdown() {
		WebElement Drop = driver.findElement(By.xpath("//select[@id=\"dropdowm-menu-1\"]"));
		Select dpwn = new Select(Drop);
		// dpwn.selectByIndex(2);
		List<WebElement> drooption = dpwn.getOptions();
		System.out.println(drooption.size());

		for(WebElement e : drooption) {
			System.out.println(e.getText());
		}
	}
	
	@Test (enabled =false)
	public void dropWSelect() throws InterruptedException {
		List <WebElement> Drop = driver.findElements(By.xpath("//select[@id=\"dropdowm-menu-1\"]//option"));
		
		System.out.println(Drop.size());
		for(WebElement e : Drop) {
			
			if(e.getText().equalsIgnoreCase("Python"))
			e.click();
			else
			Thread.sleep(3000);
			System.out.println(e.getText());
		}
	}
	
	@Test
	public void dropdown2() {
		
		WebElement Element = driver.findElement(By.xpath("//select[@id=\"dropdowm-menu-1\"]"));
		Select slct = new Select(Element);
		System.out.println(slct.getOptions().size());
		slct.selectByIndex(2);
	}
	
	@Test
	public void checkbox() throws InterruptedException {
		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"option-3\"]"));
		System.out.println("Checked or not? :"+ checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000);
		System.out.println("Checked or not? :"+ checkbox.isSelected());
		checkbox.click();
	}
	
	@Test
	public void Radio() throws InterruptedException {
		List <WebElement> RadioB = driver.findElements(By.xpath("//form[@id=\"radio-buttons\"]//input"));
		for(WebElement e :RadioB ) {
			e.click();
			Thread.sleep(2000);
		}
	}
}
