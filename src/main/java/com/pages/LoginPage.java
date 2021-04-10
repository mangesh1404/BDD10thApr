package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement lgnBtn;
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUname(String text) {
		uname.sendKeys(text);
	}
	public void enterPass(String text) {
		password.sendKeys(text);
	}
	public void clickBtn() {
		lgnBtn.click();
	}
	
	
	public void validLogin() {
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickBtn();
	}
}
