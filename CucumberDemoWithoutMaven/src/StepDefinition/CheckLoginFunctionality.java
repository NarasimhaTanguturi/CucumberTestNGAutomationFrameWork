package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckLoginFunctionality {

	

	WebDriver driver;
	String email = "rao.simha@abc.com";
	
	@Given("User launch DemoWebshop page")
	public void user_launch_demo_webshop_page() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Java Project Automation\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login/");
		
		
	}

	@When("User entered credentials")
	public void user_entered_credentials() {
	 
		WebElement Username = driver.findElement(By.id("Email"));
		WebElement Password = driver.findElement(By.id("Password"));
		
		Username.sendKeys(email);
		Password.sendKeys("abc@12345");
		
		
	}

	@When("User click Login button")
	public void user_click_login_button() {
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
		
		loginButton.click();
		
	}

	@Then("User verified Login page")
	public void user_verified_login_page() {
		
		String profilename = "rao.simha@abc.com";
		
		WebElement loginProfileName = driver.findElement(By.xpath("//*[contains(text(),'"+profilename+"')]"));
		
		Assert.assertEquals(email, loginProfileName.getText());
		System.out.println("Login is successful");
		
	}

	
	
	
}
