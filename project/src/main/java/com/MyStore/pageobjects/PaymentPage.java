package com.MyStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actiondriver.Action;
import com.MyStore.base.BaseClass;

public class PaymentPage extends BaseClass {
	
	@FindBy(xpath ="//a[contains(text(),'Pay by bank wire')]")
	WebElement PayByBankWire;

	@FindBy(xpath ="//a[contains(text(),'Pay by check')]")
	WebElement PayByCheck;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummaryPAGE clickOnPayByBankwire () throws Throwable {
		Action.click(driver, PayByBankWire);
		return new OrderSummaryPAGE();
	}
	
	public void clickOnpayByCheck () throws Throwable {
		Action.click(driver, PayByCheck);
	}
	
	
	
	
}
