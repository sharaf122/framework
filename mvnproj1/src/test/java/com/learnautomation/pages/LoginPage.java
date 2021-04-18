package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		
		
	}
	@FindBy(name="email")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="login")WebElement loginbtn;
	
	public void logintoCRM(String uname,String pass) {
		username.sendKeys("uname");
		password.sendKeys("pass");
		loginbtn.click();
	}

}
