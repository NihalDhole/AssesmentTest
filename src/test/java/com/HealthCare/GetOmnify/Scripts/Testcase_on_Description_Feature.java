package com.HealthCare.GetOmnify.Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.HealthCare.GetOmnify.Test.PomPages.DescriptionPage;

import com.HealthCare.GetOmnify.Test.genericLib.BaseClass;


public class Testcase_on_Description_Feature extends BaseClass {

	@Test
	public void testcase2() {
		test=reports.createTest("testcase2");
		
	
		DescriptionPage d=new DescriptionPage(driver);

		d.getDescriptionbtn().click();
		
		utilities.switchTabs(driver);
		
		
	}
}
