package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;


public class TC3_SelectHotelStep extends BaseClass{
	

	
	PageObjectManager pom = new PageObjectManager();
	
	
	

	@Then("User should Select Hotel")
	public void userShouldSelectHotel() {
		pom.getSelectHotelPage().selectHotel();
	   
	}
	@Then("User Should Verify  Message After Select Hotel {string}")
	public void userShouldVerifyMessageAfterSelectHotel(String bookAHotel) {
		String text = getText(pom.getSelectHotelPage().getBookAHotel());
		
		Assert.assertEquals("verifyBookHotel", bookAHotel, text);
	    
	}

	@Then("User Should Click Continue Without Select Hotel")
	public void userShouldClickContinueWithoutSelectHotel() {
		
		pom.getSelectHotelPage().clickContinue();
	   
	}
	@Then("User Should Verify Error Message After Continue {string}")
	public void userShouldVerifyErrorMessageAfterContinue(String string) {
		
		
		WebElement getPlsSelectHotel = pom.getSelectHotelPage().getPlsSelectHotel();
		Assert.assertTrue(getPlsSelectHotel.getText().contains(string));
	    
	}




	

}
