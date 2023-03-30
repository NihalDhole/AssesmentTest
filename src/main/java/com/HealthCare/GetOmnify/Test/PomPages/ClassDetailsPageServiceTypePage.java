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
public class ClassDetailsPageServiceTypePage {

	@FindBy(xpath="")
	private WebElement ServiceTypebtn;
	
	public WebElement getServicebtn() {
		return ServiceTypebtn;
	}
	
	public ClassDetailsPageServiceTypePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassDetailsPageServiceTypePage service(WebDriver driver) {
		ServiceTypebtn.click();
		return new ClassDetailsPageServiceTypePage(driver);
	}
}
