package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UserPage;

public class LoginTest1 {
	WebDriver driver;
	LoginPage lp = null;
	DashboardPage dp = null;
	UserPage up = null;
	@BeforeSuite
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
	    "file:///C:/Users/DELL/Desktop/java/Selenium/docs/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		 lp = new LoginPage(driver);
	}
	
	@Test
	public void verifyDPHeader() {
		   dp = lp.validLogin();
		  boolean b = dp.verifyHeader();
		 Assert.assertTrue(b);
	}
    
	@Test
	public void verifyUserPage() {
		up=dp.clickUser();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | user");
	}
}