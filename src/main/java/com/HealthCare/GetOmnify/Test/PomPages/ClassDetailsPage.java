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
public class ClassDetailsPage {
	@FindBy(xpath="")
	private WebElement Detailsbtn;
	

	@FindBy(xpath="")
	private WebElement Locationbtn;
	
	public WebElement getDetailsbtn() {
		return Detailsbtn;
	}
	
	public WebElement getLocationtn() {
		return Locationbtn;
	}
	
	public ClassDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassDetailsPage details(WebDriver driver) {
		Detailsbtn.click();
		Locationbtn.click();
		return new ClassDetailsPage(driver);
	}
}
