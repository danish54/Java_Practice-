package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ornageloginpage {
	
	WebDriver driver;
	
	public Ornageloginpage(WebDriver driver){
		
		this.driver = driver;
	}
	
	By emailbox = By.xpath("//input[@name='username']");
	By passwordbox = By.xpath("//input[@name='password']");
	By loginbutton = By.xpath("//button[@type='submit']");
	
	
	public void orangelogin() {
		driver.findElement(emailbox).sendKeys("Admin");
		driver.findElement(passwordbox).sendKeys("admin123");
		driver.findElement(loginbutton).click();
		
	}
}
