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
public class TitlePage {

	@FindBy(xpath="")
	private WebElement Titlebtn;
	
	public WebElement getTitlebtn() {
		return Titlebtn;
	}
	
	public TitlePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public TitlePage title(WebDriver driver) {
		Titlebtn.click();
		return new TitlePage(driver);
	}
}
