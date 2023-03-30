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
public class ClassColourPage {

	@FindBy(xpath="")
	private WebElement Colourbtn;
	
	public WebElement getColourbtn() {
		return Colourbtn;
	}
	
	public ClassColourPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassColourPage colour(WebDriver driver) {
		Colourbtn.click();
		return new ClassColourPage(driver);
	}
}
