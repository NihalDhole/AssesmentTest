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
public class ClassSchedulePageTimePage {

	@FindBy(xpath="")
	private WebElement Daybtn;
	
	@FindBy(xpath="")
	private WebElement StartDatebtn;
	
	@FindBy(xpath="")
	private WebElement EndDatebtn;
	
	public WebElement getDaybtn() {
		return Daybtn;
	}
	
	public WebElement getStartDatebtn() {
		return StartDatebtn;
	}
	
	public WebElement getEndDatebtn() {
		return EndDatebtn;
	}
	
	public ClassSchedulePageTimePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassSchedulePageTimePage time(WebDriver driver) {
		Daybtn.click();
		StartDatebtn.click();
		EndDatebtn.click();
		return new ClassSchedulePageTimePage(driver);
	}
}
