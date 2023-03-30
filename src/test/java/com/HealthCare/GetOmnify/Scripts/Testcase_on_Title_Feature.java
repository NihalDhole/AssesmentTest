package com.HealthCare.GetOmnify.Scripts;

import org.testng.annotations.Test;

import com.HealthCare.GetOmnify.Test.PomPages.TitlePage;
import com.HealthCare.GetOmnify.Test.genericLib.BaseClass;


public class Testcase_on_Title_Feature extends BaseClass {

	@Test
	public void testcase1() {
		test=reports.createTest("testcase1");

		TitlePage t=new TitlePage(driver);

		t.getTitlebtn().click();
		
		utilities.switchTabs(driver);
		
		}
}
