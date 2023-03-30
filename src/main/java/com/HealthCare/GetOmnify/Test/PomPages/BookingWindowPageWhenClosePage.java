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
public class BookingWindowPageWhenClosePage {

	@FindBy(xpath="")
	private WebElement Closebtn;
	
	public WebElement getClosebtn() {
		return Closebtn;
	}
	
	public BookingWindowPageWhenClosePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public BookingWindowPageWhenClosePage close(WebDriver driver) {
		Closebtn.click();
		return new BookingWindowPageWhenClosePage(driver);
	}
}
