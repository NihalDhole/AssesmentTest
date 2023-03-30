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
public class ClassSchedulePage {

	@FindBy(xpath="")
	private WebElement Schedulebtn;
	
	public WebElement getScheduletn() {
		return Schedulebtn;
	}
	
	public ClassSchedulePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassSchedulePage schedule(WebDriver driver) {
		Schedulebtn.click();
		return new ClassSchedulePage(driver);
	}
}
