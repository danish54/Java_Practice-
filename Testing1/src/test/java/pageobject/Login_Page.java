package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_Page {

	public static WebDriver driver;


	@FindBy(id = "button")
	public static WebElement Button;
	
	
    //Constructor
	public Login_Page(WebDriver driver) {
		Login_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}
//Click Method
	public void clickonButton() {
		Button.click();
	}
}

 class Login_Test extends Login_Page {

    public Login_Test(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
    public void testLogin() {
        Login_Page loginPage = new Login_Page(driver);
        loginPage.clickonButton();
        
        
        // Add assertions or further actions as needed
    }
}
