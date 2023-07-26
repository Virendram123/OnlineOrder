package com.qa.locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.base.BaseClass;


public class Login_Locators extends BaseClass {

	WebDriver dr;
	
	public Login_Locators(WebDriver dr)
	{
		this.dr=dr;
	}
	
	@FindBy(how=How.NAME,using="userId")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.NAME,using="userPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID,using="select2-select-campus-login-container")
	@CacheLookup
	WebElement campus_list;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Search Campus']")
	@CacheLookup
	WebElement campus;
	
	@FindBy(how=How.XPATH,using="//input[@ng-click='submitLogin(loginForm)']")
	@CacheLookup
	WebElement click_login;
	
	public void parent_login() throws Throwable
	{
		username.sendKeys(p.getProperty("username"));
		Thread.sleep(500);
		password.sendKeys(p.getProperty("password"));
		Thread.sleep(500);
		campus_list.click();
		Thread.sleep(500);
		campus.sendKeys("PG-SmartCampus",Keys.ENTER);
		Thread.sleep(500);
		click_login.click();
		Thread.sleep(1000);
	}
	
	
}
