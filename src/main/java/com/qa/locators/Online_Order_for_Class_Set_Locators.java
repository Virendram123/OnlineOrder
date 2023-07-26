package com.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Online_Order_for_Class_Set_Locators {
	WebDriver d;

	public Online_Order_for_Class_Set_Locators(WebDriver d) {
		this.d = d;
	}

	@FindBy(how = How.XPATH, using = "//h6[text()='More Details']")
	@CacheLookup
	WebElement more_details;

	@FindBy(how = How.XPATH, using = "//button[text()='Add To Cart']")
	@CacheLookup
	WebElement add_to_cart;

	public void generate_online_order() throws Throwable {

		if (more_details.isDisplayed()) {
			more_details.click();
			Thread.sleep(2000);
		} else {
			System.out.println("Pl, create contract for the session and then try...!");
		}
	}
}
