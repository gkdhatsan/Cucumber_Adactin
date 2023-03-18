package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass{
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement bookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement orderIdText;

	@FindBy(id = "search_hotel_id")
	private WebElement goButton;

	@FindBy(id = "btn_id_654597")
	private WebElement cancel;
    @FindBy(id="search_result_error")
    private WebElement cancelMsg;
    
    
    @FindBy(xpath="//input[contains(@name,'btn_id')]")
    private WebElement ClickCancelId;
    
	public WebElement getClickCancelId() {
		return ClickCancelId;
	}

	public WebElement getOrderIdText() {
		return orderIdText;
	}

	public WebElement getCancelMsg() {
		return cancelMsg;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getOrderText() {
		return orderIdText;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void cancelOrderId(String orderId) {
		loginClick(getBookedItinerary());
		sendkeys(getOrderText(), orderId);
		loginClick(getGoButton());
		loginClick(getClickCancelId());
		confirmAlert();
	
		
		
	}
	
	
}
