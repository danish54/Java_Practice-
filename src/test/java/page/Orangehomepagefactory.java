package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehomepagefactory {

	WebDriver driver;

	public Orangehomepagefactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement emailbox;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordbox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;

	public void orangelogin() {
		emailbox.sendKeys("Admin");
		passwordbox.sendKeys("admin123");
		loginbutton.click();
	}
}
