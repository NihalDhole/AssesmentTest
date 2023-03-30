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
public class ClassDetailsPageOfflinePage {

	@FindBy(xpath="")
	private WebElement Offlinebtn;
	
	public WebElement getOfflinebtn() {
		return Offlinebtn;
	}
	
	public ClassDetailsPageOfflinePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassDetailsPageOfflinePage offline(WebDriver driver) {
		Offlinebtn.click();
		return new ClassDetailsPageOfflinePage(driver);
	}
}
