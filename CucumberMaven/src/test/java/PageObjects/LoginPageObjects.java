package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	public WebElement emailID;
	
	@FindBy(id="Password")
	public WebElement userPassword;
	
	@FindBy(xpath="//*[@class='button-1 login-button']")
	public WebElement loginButton;

}
