package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utilities.BrowserFactory;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=BrowserFactory.startapplication(driver, "Chrome", "https://www.freecrm.com/index.html");
		
	}
	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}

}
