package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static WebDriver setBrowser()
	{
				
		System.setProperty("webdriver.chrome.driver", "C:\\Java Project Automation\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	

}
