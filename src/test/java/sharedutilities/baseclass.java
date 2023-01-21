package sharedutilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	public static WebDriver driver;

	public void setup() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	public void captureSnapShot() throws IOException {
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

		File ssFile = ((TakesScreenshot) (driver)).getScreenshotAs(org.openqa.selenium.OutputType.FILE);

		FileUtils.copyFile(ssFile, new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + sdf.format(d) + ".jpg"));

	}
}
