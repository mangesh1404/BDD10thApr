package com.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;//hooks

public class LoginStepDef {
	WebDriver driver;
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
	}
	@When("^user enters uname and pass and click login button$")
	public void user_enters_uname_and_pass_and_click_login_button() throws Throwable {
	    LoginPage lp= new LoginPage(driver);
	    lp.validLogin();
	}
	@Then("^user will be on home page$")
	public void user_will_be_on_home_page() throws Throwable {
	    Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}
	@Given("^user should be on login page for logo$")
	public void user_should_be_on_login_page_for_logo() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
	}
	@Then("^user should see JBK logo$")
	public void user_should_see_JBK_logo() throws Throwable {
	    WebElement logo = driver.findElement(By.tagName("img"));
	    Assert.assertTrue(logo.isDisplayed());
	}
	
}
