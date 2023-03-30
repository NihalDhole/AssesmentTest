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
public class ClassDetailsPageServiceTypePagePaidPage {

	@FindBy(xpath="")
	private WebElement Paidbtn;
	
	public WebElement getPaidbtn() {
		return Paidbtn;
	}
	
	public ClassDetailsPageServiceTypePagePaidPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassDetailsPageServiceTypePagePaidPage paid(WebDriver driver) {
		Paidbtn.click();
		return new ClassDetailsPageServiceTypePagePaidPage(driver);
	}
}
