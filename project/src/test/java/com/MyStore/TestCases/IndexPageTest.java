package com.MyStore.TestCases;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.base.BaseClass;
import com.MyStore.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass {
	IndexPage indexPage;
	
	
	@BeforeMethod
	public void setup() {
		launchApp();
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	@Test
	public void VerifyLogo() throws Throwable{
		indexPage= new IndexPage();
		boolean result=indexPage.ValidateLogo();
		Assert.assertTrue(result);
		
	}
	
	
	
	

}
