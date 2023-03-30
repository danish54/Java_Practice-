package sharedutilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void chromesetup() {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

	public void captureSnapShot() throws IOException {
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

		File sourceSFile = ((TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE);
        File destfile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + sdf.format(d) + ".jpg");
		FileUtils.copyFile(sourceSFile,destfile );

	}
	
	public void Ewait(String xpath) {
		wait = new WebDriverWait(driver,Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
}
