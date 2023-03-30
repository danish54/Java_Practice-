package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_exe {
	
	public static WebDriver Driver;

	@BeforeMethod
	public void setup() throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver(option);
		
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

	}

	@Test
	public void TypeJS() throws InterruptedException {

		WebElement name = Driver.findElement(By.name("username"));
		WebElement password = Driver.findElement(By.name("password"));
		WebElement Loginbutton = Driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor jse = (JavascriptExecutor) Driver;
		
		jse.executeScript("arguments[0].value='admin'", name);
		jse.executeScript("arguments[0].value='admin123'", password);
		
		Loginbutton.click();
		System.out.println("Success");
		Driver.quit();
	}
}
