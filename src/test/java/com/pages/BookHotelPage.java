package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//input[@name='first_name']")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNumber;
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(xpath="//td[contains(text(),'Booking Confirmation ')]")
	private WebElement confirmBook;
	
	
	@FindBy(id="first_name_span")
	private WebElement efirst;
	@FindBy(id="last_name_span")
	private WebElement elast;
	@FindBy(id="address_span")
	private WebElement addressspan;
	@FindBy(id="cc_expiry_span")
	private WebElement ccexpiryspan;
	@FindBy(id="cc_num_span")
	private WebElement ccnumspan;
	@FindBy(id="cc_type_span")
	private WebElement cctypespan;
	@FindBy(id="cc_cvv_span")
	private WebElement cvvspan;
	
	
	public WebElement getEfirst() {
		return efirst;
	}
	public WebElement getElast() {
		return elast;
	}
	public WebElement getAddressspan() {
		return addressspan;
	}
	public WebElement getCcnumspan() {
		return ccnumspan;
	}
	public WebElement getCctypespan() {
		return cctypespan;
	}
	public WebElement getCvvspan() {
		return cvvspan;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	
	public WebElement getCcexpiryspan() {
		return ccexpiryspan;
	}
	public WebElement getConfirmBook() {
		return confirmBook;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNumber() {
		return ccNumber;
	}
	public WebElement getCcType() {
		return ccType;
	}
	
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	public void bookHotel (String firstName,String lastName,String address,String ccType,String ccNumber,String expmonth,String expyear,String cvvNumber ) {
		sendkeys(getFirstName(), firstName);
		sendkeys(getLastName(), lastName);
		sendkeys(getAddress(), address);
		sendkeys(getCcType(), ccType);
		sendkeys(getCcNumber(), ccNumber);
		sendkeys(getExpmonth(), expmonth);
		sendkeys(getExpyear(), expyear);
		sendkeys(getCvvNumber(), cvvNumber);
		
		loginClick(getBooknow());

}
	public void bookHotel () {
		
		loginClick(getBooknow());

}
	
	
}
