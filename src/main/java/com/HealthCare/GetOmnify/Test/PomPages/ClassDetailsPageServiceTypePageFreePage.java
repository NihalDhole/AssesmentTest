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
public class ClassDetailsPageServiceTypePageFreePage {

	@FindBy(xpath="")
	private WebElement Freebtn;
	
	public WebElement getFreebtn() {
		return Freebtn;
	}
	
	public ClassDetailsPageServiceTypePageFreePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassDetailsPageServiceTypePageFreePage free(WebDriver driver) {
		Freebtn.click();
		return new ClassDetailsPageServiceTypePageFreePage(driver);
	}
}
