package keys;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Keyborad_Keys {
	WebDriver driver;
	@Test
	public void KeyboardShot() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		WebElement Footer = driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Footer);
		
		 WebElement leftfooter = driver.findElement(By.xpath("(//div[@id=\"gf-BIG\"]//td)[1]"));
		 List<WebElement> LinkList = leftfooter.findElements(By.tagName("a"));
		 System.out.println("This the URL count "+LinkList.size());
		 
		 for (WebElement e : LinkList) {
			e.sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		}
		 
		 Thread.sleep(5000);
		Set<String> tabs =  driver.getWindowHandles();
		//Iterator<String> it = tabs.iterator();
		
		for (String string : tabs) {
			String windowtitle = driver.switchTo().window(string).getTitle();
			System.out.println(windowtitle);
		}
		 Thread.sleep(2000);
		 driver.quit();	 
		 
	}
	
	@Test
	public void EnterTextJs() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		WebElement inputbox = driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'may june';", inputbox);
	}
	
	@Test
	public void SeleWait() {
		
		WebDriverWait wait;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		
		WebElement Footer = driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]"));
		WebElement Foter2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"gf-BIG\"]")));
		
		
		
	}

}
