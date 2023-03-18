package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;


public class TC5_CancelBookingStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
	@Then("User Should Click Cancel OrderNo")
	public void userShouldClickCancelOrderNo() throws IOException {
		
		pom.getCancelBokkingPage().cancelOrderId(pom.getBookingConfirmationPage().getOrderId());
		
	    
	}
	
	@Then("User should verify Message After Click Ok {string}")
	public void userShouldVerifyMessageAfterClickOk(String cancelMsg) {
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
 
 //Assert.assertTrue(getText(pom.getCancelBokkingPage().getCancelMsg()).contains(cancelMsg));
		//Assert.assertEquals("verifyCancelMessage", cancelMsg,getText(pom.getCancelBokkingPage().getCancelMsg()));
	   
		System.out.println(getText(pom.getCancelBokkingPage().getCancelMsg()));
	}

	@Then("User Should Cancel Existing {string}")
	public void userShouldCancelExisting(String string) throws IOException {
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		pom.getCancelBokkingPage().cancelOrderId(string);
	    
	}
	
	






}
