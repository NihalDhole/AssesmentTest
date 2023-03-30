package com.HealthCare.GetOmnify.Scripts;

import org.testng.annotations.Test;

import com.HealthCare.GetOmnify.Test.PomPages.ClassColourPage;
import com.HealthCare.GetOmnify.Test.genericLib.BaseClass;


public class Testcase_on_ClassColour_Feature extends BaseClass{

	@Test
	public void testcase3() {
		test=reports.createTest("testcase3");
		
	ClassColourPage cc=new ClassColourPage(driver);

	cc.getColourbtn().click();
	
	utilities.switchTabs(driver);
	
	}
}
