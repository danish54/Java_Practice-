package feb2023;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {

	WebDriver driver;
	
	@Test
	public void Login() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");	
		
		
		  Thread.sleep(2000); String file =
		  "C:\\Users\\danish2545\\Downloads\\Asset1.png";
		  
		  StringSelection selection = new StringSelection(file);
		  
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
		  null);
		  
		  WebElement fileInput =
		  driver.findElement(By.xpath("//input[@name=\"userfile\"]"));
		  
		  fileInput.click();
		  
		  fileInput.sendKeys(Keys.CONTROL + "v");
		 
        
        driver.quit();
	}
	
	
}
