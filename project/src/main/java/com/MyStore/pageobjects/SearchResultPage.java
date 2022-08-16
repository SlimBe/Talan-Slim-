package com.MyStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.actiondriver.Action;
import com.MyStore.base.BaseClass;

public class SearchResultPage extends BaseClass {
	@FindBy(xpath = "//*[@id=\"center_column\"]//img")
	WebElement productResult;
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public Boolean isProductAvailable() throws Throwable  {
		return Action.isDisplayed(driver, productResult);
	}
	
	public AddToCartePage ClickonProduct() throws Throwable  {
		Action.click(driver, productResult);
		return new AddToCartePage();
	}
}
