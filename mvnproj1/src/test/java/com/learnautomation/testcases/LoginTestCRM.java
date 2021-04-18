package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utilities.BrowserFactory;

public class LoginTestCRM extends BaseClass{

	
	@Test
	public void loginapp() {
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.logintoCRM("anjumju@gmail.com", "@anjumju123");

		}
	

}
