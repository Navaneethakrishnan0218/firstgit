package org.def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition {
	WebDriver driver;
	@Given("User is a Facebook Login page")
	public void user_is_a_Facebook_Login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	    
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String email, String pass) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		 }
	   
	

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement element = driver.findElement(By.name("login"));
		element.click();
	    
	}

	@Then("Error is displayed")
	public void error_is_displayed() {
		System.out.println(" Error Displayed ");
	   
	}


	
}
