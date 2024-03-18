package feb2023;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class Iframe {
	WebDriver driver;
	
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	public void ClickOnButton() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Button = driver.findElement(By.xpath("//input[@value=\"radio1\"]"));
		Boolean Display = Button.isDisplayed();
		System.out.println("Element displayed is :"+ Display);
		Assert.assertTrue(Display);
		Button.click();
		Thread.sleep(2000);
	}
	
	public void Dropdown() {
		WebElement dropdonw = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Select slct = new Select(dropdonw);
		slct.selectByIndex(2);
		List<WebElement> dropdown =  slct.getOptions();
		
		for (WebElement webElement : dropdown) {
			int i =1;
			i++;
			System.out.println("Option "+i+" " +webElement.getText());
			
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void switchframe() throws InterruptedException {
		
		login();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"courses-iframe\"]"));
		
		//js scroll
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", frame);
		
		Thread.sleep(2000);
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		String win = driver.getWindowHandle();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for (WebElement webElement : link) {
			if(webElement.getText().equalsIgnoreCase("All Access Plan")) {
				webElement.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//a[@id=\"opentab\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		Thread.sleep(3000);
		button.click();
		Thread.sleep(3000);
		
		driver.switchTo().window(win);
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
	@Test
	public void scroll() throws InterruptedException {
		
		login();
		Actions act = new Actions(driver);
	driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).click();
	act.sendKeys("ind").perform();
	
	WebElement dynamicdrop =  driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]"));
	
	act.moveToElement(dynamicdrop);
	
	List <WebElement> List = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]//li"));
	
	for (WebElement webElement : List) {
		System.out.println(webElement.getText());
		
		if(webElement.getText().equalsIgnoreCase("India")) {
			webElement.click();
			break;
		}
	}
	
		Thread.sleep(3000);
		driver.close();
	}

}
