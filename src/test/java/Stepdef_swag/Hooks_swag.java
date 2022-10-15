package Stepdef_swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks_swag {
	
	public static WebDriver driver;
	
	@Before
	public void steup() {
		
		System.getProperty("WebDriver.Chrome.driver","ChromeDriver");
		driver = new ChromeDriver();
		
	}
	
	@After 
	public void Teardown() {
		driver.close();
	}

}
