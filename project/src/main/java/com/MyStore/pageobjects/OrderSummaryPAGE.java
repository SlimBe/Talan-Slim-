package com.MyStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actiondriver.Action;
import com.MyStore.base.BaseClass;

public class OrderSummaryPAGE extends BaseClass {
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement confirmOrderBtn; 
	
	public OrderSummaryPAGE() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickonConfirmOrderBtn() throws Throwable {
		Action.click(driver, confirmOrderBtn);
		return new OrderConfirmationPage();
		
	}

}
