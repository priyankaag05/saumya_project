package Stepdef_swag;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart_swag {
	WebDriver driver = Hooks_swag.driver;
	
		
	@When("I entered correct username as {string} and password as {string}")
	public void i_entered_correct_username_as_and_password_as(String string, String string2) {
	    
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys(string);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(string2);
	}

	@And("I want to select product {string} to add to cart")
	public void i_want_to_select_product_to_add_to_cart(String ProductName)  {
		
		String Xpath = "//div[text()='" +  ProductName + "']//following::button[1]";
		WebElement product = driver.findElement(By.xpath(Xpath));
		product.click();
		
	}

	@Then("Basket item number should be {int}")
	public void basket_item_number_should_be(Integer int1) {
	    
		WebElement cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
		Assert.assertEquals(cart.getText(),"1");
		
	}


}
