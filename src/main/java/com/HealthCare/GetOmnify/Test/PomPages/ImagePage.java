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
public class ImagePage {

	@FindBy(xpath="")
	private WebElement Imagebtn;
	
	public WebElement getImagebtn() {
		return Imagebtn;
	}
	
	public ImagePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public ImagePage img(WebDriver driver) {
		Imagebtn.click();
		return new ImagePage(driver);
	}
}
