package com.MyStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actiondriver.Action;
import com.MyStore.base.BaseClass;

public class ShipingPage extends BaseClass {
	
	@FindBy(id ="cgv")
	WebElement terms;
	
	@FindBy(xpath ="//button//span[contains(text(),'Proceed to checkout')]")
	WebElement Proceedtocheckoutbtn;
	
	public ShipingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonetheTerms() throws Throwable {
		Action.click(driver, terms);
	}
	
	
	public PaymentPage clickonProceedTocheckOut() throws Throwable {
		Action.click(driver, Proceedtocheckoutbtn);
		return new PaymentPage();
	}
	

	
	
	
	
	
	
}
