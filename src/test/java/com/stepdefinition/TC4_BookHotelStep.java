package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends BaseClass{
	
	

	PageObjectManager pom = new PageObjectManager();
/**
 * 
 * @param FirstName
 * @param LastName
 * @param BillingAddress
 * @param dataTable
 */

	
	@Then("User Should Enter {string},{string},{string}")
	public void userShouldEnter(String FirstName, String LastName, String BillingAddress, io.cucumber.datatable.DataTable dataTable) {
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String cCType = map.get("CreditCardType");
		String cCNum = map.get("CreditCardNo");
		String expMonth = map.get("ExpMonth");
		String expYear = map.get("ExpYear");
		String cVVNum = map.get("CVVNummber");
		pom.getBookHotelPage().bookHotel(FirstName, LastName, BillingAddress,cCType,cCNum,expMonth,expYear,cVVNum);
		
		

	}
/**
 * 
 * @param bookConfirm
 */
	@Then("User Should Verify Message After BookNow {string}")
	public void userShouldVerifyMessageAfterBookNow(String bookConfirm) {
	  
		String text = getText(pom.getBookHotelPage().getConfirmBook());
		Assert.assertEquals("bookConfirm", bookConfirm, text);
			
	}
/**
 * 
 */
	@Then("User Should Click BookNow Without Filling Any Field")
	public void userShouldClickBookNowWithoutFillingAnyField() {
		
		pom.getBookHotelPage().bookHotel();
	   
	}
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param ccNum
	 * @param ccType
	 * @param expMonth
	 * @param CVV
	 */
	@Then("User Should Verify Error Message After BookNow {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMessageAfterBookNowAnd(String firstName, String lastName, String address, String ccNum, String ccType, String expMonth, String CVV) {
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		
		Assert.assertTrue(getText(pom.getBookHotelPage().getEfirst()).contains(firstName));
		Assert.assertTrue(getText(pom.getBookHotelPage().getElast()).contains(lastName));
		Assert.assertTrue(getText(pom.getBookHotelPage().getAddressspan()).contains(address));
		Assert.assertTrue(getText(pom.getBookHotelPage().getCcnumspan()).contains(ccNum));
		Assert.assertTrue(getText(pom.getBookHotelPage().getCctypespan()).contains(ccType));
		Assert.assertTrue(getText(pom.getBookHotelPage().getCcexpiryspan()).contains(expMonth));
		Assert.assertTrue(getText(pom.getBookHotelPage().getCvvspan()).contains(CVV));
		
		
		
		
	}



	}
