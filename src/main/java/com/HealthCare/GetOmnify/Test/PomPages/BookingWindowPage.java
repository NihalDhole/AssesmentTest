package com.HealthCare.GetOmnify.Test.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Nihal Dhole
 *
 */
public class BookingWindowPage {

	@FindBy(xpath="")
	private WebElement Bookbtn;
	
	public WebElement getBookbtn() {
		return Bookbtn;
	}
	
	public BookingWindowPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public BookingWindowPage book(WebDriver driver) {
		Bookbtn.click();
		return new BookingWindowPage(driver);
	}
}	