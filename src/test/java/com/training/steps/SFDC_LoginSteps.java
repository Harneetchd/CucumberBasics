package com.training.steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDC_LoginSteps
{
	WebDriver driver;
	@Given("User launch the Salesforce Application")
	public void user_launch_the_salesforce_application()
	{
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
	}

	@When("Enter into Username {string}")
	public void enter_into_username(String string)
	{
	    driver.findElement(By.id("username")).sendKeys("harneetkaur@capitalforce.com");
	}

	@Then("Enter into Password {string}")
	public void enter_into_password(String string) 
	{
		By password1= By.id("password");
		driver.findElement(password1).sendKeys("Benihina1018@");
	}

	@Then("Click on Login Button")
	public void click_on_login_button() 
	{
		driver.findElement(By.id("Login")).click();
	}
	@When("User enters username {string}")
	public void user_enters_username(String username) 
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Then("User enters password {string}")
	public void user_enters_password(String password) 
	{
		By password1= By.id("password");
		driver.findElement(password1).sendKeys(password);
	}

	@Then("User clicks on login")
	public void user_clicks_on_login()
	{
		driver.findElement(By.id("Login")).click();
	}
	


}
