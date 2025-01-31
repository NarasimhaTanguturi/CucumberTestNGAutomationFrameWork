package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPageObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.BaseTest;

public class ValidateLogin extends BaseTest{

	WebDriver driver;
	
	String email = "rao.simha@abc.com";
	
	//LoginPageObjects loginPageObj = PageFactory.initElements(driver, LoginPageObjects.class);
	
	@Before
	public void launchBrowser()
	{
		driver = BaseTest.setBrowser();
	}
	
	
	@Given("User launch DemoWebshop page")
	public void user_launch_demowebshop_page() {
	  
	
		driver.get("https://demowebshop.tricentis.com/login/");
		
		
	}

	@When("User entered credentials")
	public void user_entered_credentials() {
		
		LoginPageObjects loginPageObj = PageFactory.initElements(driver, LoginPageObjects.class);
		loginPageObj.emailID.sendKeys(email);
		loginPageObj.userPassword.sendKeys("abc@1234");
	 
		
		/*
		WebElement Username = driver.findElement(By.id("Email"));
		WebElement Password = driver.findElement(By.id("Password"));
		
		Username.sendKeys(email);
		Password.sendKeys("abc@12345");
		*/
		
	}

	@And("User click Login button")
	public void user_click_login_button() {
		LoginPageObjects loginPageObj = PageFactory.initElements(driver, LoginPageObjects.class);
		loginPageObj.loginButton.click();
		
		/*
		WebElement loginButton = driver.findElement(By.xpath("//*[@class='button-1 login-button']"));		
		loginButton.click();
		*/
		
	}

	@Then("User verified Login page")
	public void user_verified_login_page() {
		
		String profilename = "rao.simha@abc.com";
		
		WebElement loginProfileName = driver.findElement(By.xpath("//*[contains(text(),'"+profilename+"')]"));		
		Assert.assertEquals(email, loginProfileName.getText());
		System.out.println("Login is successful");
		
	}

	
	
	 @After
	    public void captureScreenshot(Scenario scenario) {
	        if (scenario.isFailed()) {
	            System.out.println("Scenario failed. Taking screenshot...");
	            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName() );
	        }
	    }
	
}
