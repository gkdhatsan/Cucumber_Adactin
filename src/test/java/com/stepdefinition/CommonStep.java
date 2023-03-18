package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass{
	PageObjectManager pom = new PageObjectManager();

	@Then("User Should Verify Welcome Message After Login {string}")
	public void userShouldVerifyWelcomeMessageAfterLogin(String welcomeMsg) {
		
		Assert.assertEquals("verify after login",welcomeMsg,getAttribute(pom.getSearchHotelPage().getWelcomeMsg()));
		
		
	}

}
