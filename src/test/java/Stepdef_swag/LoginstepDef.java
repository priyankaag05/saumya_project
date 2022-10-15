package Stepdef_swag;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginstepDef {
	
	WebDriver driver = Hooks_swag.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	   
	}

	@When("I entered correct username and password")
	public void i_entered_correct_username_and_password() {
	    
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
	   
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
	}
	@Then("I should land home page with title {string}")
	public void i_should_land_home_page_with_title(String string) {
	   
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(string, Title);
		//Assert.assertEquals(Title, string);
	}
	
	@Given("I entered incorrect username and password")
	public void i_entered_incorrect_username_and_password() {
		
		 
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys("locked_out_user");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
	    
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String string) {
	    
		String error = driver.findElement(By.xpath("//div[@class='error-message-container error']/h3")).getText();
		Assert.assertEquals(string, error);
	}

	@When("I entered correct {string} and {string}")
	public void i_entered_correct_and(String username, String password) {
		
		 
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys(username);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(password);
		
	    
	}



}
