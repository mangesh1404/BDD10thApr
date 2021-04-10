package com.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddUserStepDef {
	WebDriver driver;
	
	@Given("^user should be on add user page$")
	public void user_should_be_on_add_user_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
	    driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.xpath("//button")).click();
	    driver.findElement(By.xpath("//span[text()='Users']")).click();
	    driver.findElement(By.xpath("//span[text()='Add User']")).click();
	    
	}

	@When("^user enters all details$")
	public void user_enters_all_details() throws Throwable {
	    
	}

	@Then("^alert message should display$")
	public void alert_message_should_display() throws Throwable {
	    
	}
}
