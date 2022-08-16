package com.MyStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actiondriver.Action;
import com.MyStore.base.BaseClass;

public class AddToCartePage extends BaseClass {
	@FindBy(id = "quantity_wanted")
	WebElement quantity;
	
	@FindBy(id = "group_1")
	WebElement size;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement AddToCartBtn;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]//h2/i")
	WebElement AddToCartMesage;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	WebElement procedToCheckOutBtn;
	
	
	public AddToCartePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterQuantity (String quantity1) throws Throwable {
		Action.type(quantity, quantity1);
		}
	
	public void selectSize (String size1) {
		Action.selectByVisibleText(size1, size); 
	}
	
	public void clickOnAddToCartBtn () throws Throwable  {
		Action.click(driver, AddToCartBtn); 
	}
	
	public Boolean ValidateAddtoCart () throws Throwable  {
		return Action.isDisplayed(driver, AddToCartMesage); 
	}
	 
	public OrderPage clickOnCheckOut () throws Throwable  {
		 Action.JSClick(driver, procedToCheckOutBtn); 
		 return new OrderPage();
		
	}

	

}
