package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {

	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBokkingPage;
	
	
	public LoginPage getLoginPage() {
		
		
		return (loginPage == null)?loginPage=new LoginPage():loginPage;//ternary opertor
		
	}
	public SearchHotelPage getSearchHotelPage() {
	
		
		return (searchHotelPage == null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	
	public SelectHotelPage getSelectHotelPage() {
		
		
		return (selectHotelPage == null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	
	
	public BookHotelPage getBookHotelPage() {
		
		return (bookHotelPage == null)?bookHotelPage=new BookHotelPage():bookHotelPage;	
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		 
		
		return (bookingConfirmationPage==null)? bookingConfirmationPage=new BookingConfirmationPage():bookingConfirmationPage;
	}
	
public CancelBookingPage getCancelBokkingPage() {
		
		
		return (cancelBokkingPage == null)?cancelBokkingPage=new CancelBookingPage():cancelBokkingPage;
	}
	
	
	
}
