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
public class ClassDetailsPageTrainerPage {

	@FindBy(xpath="")
	private WebElement Trainerbtn;
	
	public WebElement gettrainerbtn() {
		return Trainerbtn;
	}
	
	public ClassDetailsPageTrainerPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ClassDetailsPageTrainerPage trainer(WebDriver driver) {
		Trainerbtn.click();
		return new ClassDetailsPageTrainerPage(driver);
	}
}
