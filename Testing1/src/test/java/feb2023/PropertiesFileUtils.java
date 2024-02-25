package feb2023;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PropertiesFileUtils {
	Logger log = LogManager.getLogger(PropertiesFileUtils.class);
	ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@Test
	public void logg() {
		
		driver.set(new ChromeDriver());
		log.error("Danish");
		log.info("redirected to doc page successfully.");
		//System.err.println(driver.get());
	}
	
}
