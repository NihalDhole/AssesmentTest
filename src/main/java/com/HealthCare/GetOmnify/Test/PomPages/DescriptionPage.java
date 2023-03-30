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
public class DescriptionPage {

	@FindBy(xpath="")
	private WebElement Descriptionbtn;
	
	public WebElement getDescriptionbtn() {
		return Descriptionbtn;
	}
	
	public DescriptionPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public DescriptionPage des(WebDriver driver) {
		Descriptionbtn.click();
		return new DescriptionPage(driver);
	}
}
