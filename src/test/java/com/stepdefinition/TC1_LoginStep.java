 package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	//LoginPage login = new LoginPage();
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	@Given("User is on Adactin Home Page")
	public void userIsOnAdactinHomePage() throws FileNotFoundException, IOException {
		System.out.println("*****@given******");
		//getBrowser(getPropertyFileValue("browserName"));
		
		//getUrl(getPropertyFileValue("url"));
		
		System.out.println("*****@given******");
		
	}

	@When("User Should Perform Login {string},{string}")
	public void userShouldPerformLogin(String UserName, String Password) {
		System.out.println("*****@when1*******");
		pom.getLoginPage().login(UserName, Password);
		
		//login.login(UserName, Password);
		System.out.println("*****@when1*******");
	}

	@When("User Should Perform Login {string},{string} Click Enter")
	public void userShouldPerformLoginClickEnter(String UserName, String Password) throws AWTException {
		System.out.println("*****@when2*******");
		pom.getLoginPage().loginWithEnter(UserName, Password);
		
		//login.loginWithEnter(username, password);
		System.out.println("*****@when2*******");
	}

	@Then("User Should Verify Error Message After Login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expectedErrorMessage) {
		System.out.println("*****@when3*******");
		WebElement loginErrorMsg = pom.getLoginPage().getLoginErrorMsg();
		
        Assert.assertTrue(loginErrorMsg.getText().contains(expectedErrorMessage));
    	System.out.println("*****@when3*******");
	}

}
