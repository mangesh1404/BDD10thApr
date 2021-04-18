package com.stepDefs;

import java.io.FileInputStream;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.Sheet;
import jxl.Workbook;

public class LoginWithExcel {
	WebDriver driver;
	
	public String getData(int row , int col) {
		FileInputStream fis=null;
		Workbook wb=null;
		Sheet sh=null;
		try {
			fis = new FileInputStream("TestData.xls");
			wb= Workbook.getWorkbook(fis);
			sh = wb.getSheet("login");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sh.getCell(col, row).getContents();
	}
	
	
	
	
	@Given("^user should be on login page for Excel login$")
	public void user_should_be_on_login_page_for_Excel_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
	}

	@When("^user enters uname and pass from Excelsheet$")
	public void user_enters_uname_and_pass_from_Excelsheet() throws Throwable {
		for(int i=1;i<=3;i++) {
			if(driver.getTitle().contains("Dashboard"))
				driver.findElement(By.linkText("LOGOUT")).click();
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(getData(i, 0));
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(getData(i, 1));
			driver.findElement(By.xpath("//button")).click();
			
			Assert.assertEquals(getData(i,2), driver.getTitle());
		}	
	}
}
