package randomstuff;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class Screenshot {

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

	@Test(enabled = false)
	public void TakeScreenGrab() throws IOException, InterruptedException {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File source = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\name" + timeStamp + ".jpg"));
	}

	@Test(enabled = false)
	public void TakeSS() throws WebDriverException, IOException {
		FileUtils.copyFile(((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE),
				new File("C:Driver//Image.jpg"));

	}

	@Test
	public void TypeJS() throws InterruptedException {

		WebElement name = Driver.findElement(By.name("username"));
		WebElement password = Driver.findElement(By.name("password"));
		WebElement Loginbutton = Driver.findElement(By.xpath("//button[@type='submit']"));
		//JavascriptExecutor jse = (JavascriptExecutor) Driver;
		
		//jse.executeScript("arguments[0].value='admin'", name);
		//jse.executeScript("arguments[0].value='admin123'", password);
		Thread.sleep(2000);
		name.sendKeys("admin");
		password.sendKeys("admin123");
		Loginbutton.click();
		//jse.executeScript("arguments[0].click()", Loginbutton);
		System.out.println("Success");
		//Driver.quit();
	}

}
