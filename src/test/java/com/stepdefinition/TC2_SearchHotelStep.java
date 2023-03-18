package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC2_SearchHotelStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * Description:User should search hotel
	 * Author:Ganesh
	 * Date:21-08-2022
	 * @param Location
	 * @param Hotel
	 * @param Roomtype
	 * @param NumberofRooms
	 * @param CheckInDate
	 * @param CheckOutDate
	 * @param AdultsperRoom
	 * @param ChildrenperRoom
	 * 
	 */


	@Then("User Should Fill & Submit All Fields In Search Hotel Page {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldFillSubmitAllFieldsInSearchHotelPageAnd(String Location, String Hotels, String RoomType,
			String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		
		pom.getSearchHotelPage().searchHotels(Location, Hotels, RoomType, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom, ChildrenperRoom);
		
	}
/**
 * Description:User Should Verify Message After Search
 * Author:Ganesh
 * Date:21-08-2022
 * @param selectHotel
 */
	@Then("User Should Verify Message After Search {string}")
	public void userShouldVerifyMessageAfterSearch(String selectHotel) {
		
		Assert.assertEquals("verifySuccesMsg  ", selectHotel, getText(pom.getSearchHotelPage().getSelectHotel()));
	}
/**
 * Description:User Should Verify Message After Search
 * Author:Ganesh
 * Date:21-08-2022
 * @param Location
 * @param NumberofRooms
 * @param CheckInDate
 * @param CheckOutDate
 * @param AdultsperRoom
 */
	@Then("User Should Fill & Submit Only Mandatry Fields In Search Hotel Page {string},{string},{string},{string} and {string}")
	public void userShouldFillSubmitOnlyMandatryFieldsInSearchHotelPageAnd(String Location, String NumberofRooms,
			String CheckInDate, String CheckOutDate, String AdultsperRoom) {
		pom.getSearchHotelPage().searchHotels(Location, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom);
	}

	@Then("User should verify Invalid Date Error Message After Search {string},{string}")
	public void userShouldVerifyInvalidDateErrorMessageAfterSearch(String string, String string2) {
		
		WebElement getBeforethanCheckOutDate = pom.getSearchHotelPage().getBeforethanCheckOutDate();
		Assert.assertTrue(getBeforethanCheckOutDate.getText().contains(string));
		
		WebElement getAfterthanCheckInDate = pom.getSearchHotelPage().getAfterthanCheckInDate();
		Assert.assertTrue(getAfterthanCheckInDate.getText().contains(string2));
		
		
	}

	@Then("User Should Submit Search Hotel Page Without Filling Any Field")
	public void userShouldSubmitSearchHotelPageWithoutFillingAnyField() {
		pom.getSearchHotelPage().searchHotels();

	}

	@Then("User Should Verify Error Message After Search {string}")
	public void userShouldVerifyErrorMessageAfterSearch(String plseaseselHotel) {
		
		WebElement pleaseSelectHotel = pom.getSearchHotelPage().getPleaseSelectHotel();
		Assert.assertTrue(pleaseSelectHotel.getText().contains(plseaseselHotel));
		
	/*	String error = getText(pom.getSearchHotelPage().getPleaseSelectHotel());
		boolean contains = error.contains("Location");
		Assert.assertTrue("errorMsgDirectSearch", contains);*/

	}

}
