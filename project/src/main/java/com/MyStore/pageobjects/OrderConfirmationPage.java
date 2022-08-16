package com.MyStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.MyStore.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {
	
	@FindBy(xpath ="//p//strong[contains(text(),'Your order on My Store is complete.')]")
	WebElement ConfirmMessage;
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateCofirmMessage() {
		String confmess=ConfirmMessage.getText();
		return confmess;
	}

}
