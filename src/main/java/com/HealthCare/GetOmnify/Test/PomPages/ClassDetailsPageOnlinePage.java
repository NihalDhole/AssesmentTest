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
public class ClassDetailsPageOnlinePage {

	@FindBy(xpath="")
	private WebElement Onlinebtn;
	
	public WebElement getOnlinebtn() {
		return Onlinebtn;
	}
	
	public ClassDetailsPageOnlinePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassDetailsPageOnlinePage online(WebDriver driver) {
		Onlinebtn.click();
		return new ClassDetailsPageOnlinePage(driver);
	}
}
