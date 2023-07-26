package com.qa.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Diary_Sale_Locators {
	
	WebDriver dr;
	
	public Diary_Sale_Locators(WebDriver dr)
	{
		this.dr=dr;
	}
	
	@FindBy(how=How.XPATH,using="//h6[text()='Add To Cart']")
	@CacheLookup
	WebElement more_details;
	
	@FindBy(how=How.XPATH,using="//button[@type='button'][text()='Ok']")
	@CacheLookup
	WebElement ok_click;
	
	@FindBy(how=How.XPATH,using="//span[@class ='glyphicon glyphicon-shopping-cart cartSymbol']")
	@CacheLookup
	WebElement view_cart;
	
	@FindBy(how=How.XPATH,using="//button[@type='button'][text()='Proceed']")
	@CacheLookup
	WebElement proceed;
	
	
	public void diary_sale() throws Throwable
	{
		more_details.click();
		Thread.sleep(1000);
		ok_click.click();
		Thread.sleep(1000);
		view_cart.click();
		Thread.sleep(1000);
		proceed.click();
	}

}
