package com.MyStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actiondriver.Action;
import com.MyStore.base.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath = "//span[text()='My wishlists']")
	WebElement MyWishList;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	WebElement OrderHistory;
public HomePage() {
	PageFactory.initElements(driver, this);
	}
 
	public boolean ValidateMyWishList() throws Throwable {
		return Action.isDisplayed(driver, MyWishList);	
			}
	public boolean ValidateOrderHistory() throws Throwable {
		return Action.isDisplayed(driver, OrderHistory);	
			}


	
	
	
	
	
	
	
	
	
	
}
