package com.qa.test;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.BaseClass;
import com.qa.locators.Diary_Sale_Locators;
import com.qa.locators.Login_Locators;
import com.qa.locators.Online_Order_Locators;
import com.qa.locators.Online_Order_for_Class_Set_Locators;

public class Parent_Online_Order extends BaseClass {
	
	@Test(priority=0)
	public void intiate_browser() throws Throwable
	{
		BaseClass b = new BaseClass();
		b.launchApp();
	}

	@Test(priority=1)
	public void u_login() throws Throwable
	{
		Login_Locators l = PageFactory.initElements(dr, Login_Locators.class);
		l.parent_login();
		Assert.assertEquals("Home Page", "Home Page");
		
	}
	@Test(priority=2)
	public void generate_online_order() throws Throwable
	{
		Online_Order_Locators o1 = PageFactory.initElements(dr, Online_Order_Locators.class);
		o1.online_order();
	}
	@Test(priority=3)
	/*public void generate_diary_sale() throws Throwable
	{
		Diary_Sale_Locators ds = PageFactory.initElements(dr, Diary_Sale_Locators.class);
		ds.diary_sale();
		
	}*/
	public void generate_online_order_for_set() throws Throwable
	{
		Online_Order_for_Class_Set_Locators o2=PageFactory.initElements(dr, Online_Order_for_Class_Set_Locators.class);
		o2.generate_online_order();	
		
		
		
	}
}
