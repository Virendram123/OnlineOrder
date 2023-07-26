package com.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Online_Order_Locators {
	
	WebDriver dr;
	
	public Online_Order_Locators(WebDriver dr)
	{
		this.dr=dr;
	}
	
	@FindBy(how=How.LINK_TEXT,using="ONLINE ORDER")
	@CacheLookup
	WebElement online_order_link;
	
	@FindBy(how=How.LINK_TEXT,using="ORDER LIST")
	@CacheLookup
	WebElement order_list_link;
	
	@FindBy(how=How.LINK_TEXT,using="FAQS")
	@CacheLookup
	WebElement faqs_link;
	
	@FindBy(how=How.LINK_TEXT,using="CATALOGUE")
	@CacheLookup
	WebElement catalogue_link;
	
	public void online_order() throws Throwable
	{
		online_order_link.click();
		Thread.sleep(800);
		order_list_link.click();
		Thread.sleep(2000);
		faqs_link.click();
		Thread.sleep(2000);
		catalogue_link.click();
		Thread.sleep(2000);
		
	}

	

}
