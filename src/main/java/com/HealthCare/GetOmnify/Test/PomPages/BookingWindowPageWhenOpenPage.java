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
public class BookingWindowPageWhenOpenPage {

	@FindBy(xpath="")
	private WebElement Openbtn;
	
	public WebElement getOpenbtn() {
		return Openbtn;
	}
	
	public BookingWindowPageWhenOpenPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public BookingWindowPageWhenOpenPage Open(WebDriver driver) {
		Openbtn.click();
		return new BookingWindowPageWhenOpenPage(driver);
	}

}
