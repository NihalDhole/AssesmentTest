package com.HealthCare.GetOmnify.Scripts;

import org.testng.annotations.Test;

import com.HealthCare.GetOmnify.Test.PomPages.ClassSchedulePage;
import com.HealthCare.GetOmnify.Test.PomPages.ClassSchedulePageTimePage;
import com.HealthCare.GetOmnify.Test.genericLib.BaseClass;


public class Testcase_on_ClassSchedule_Feature extends BaseClass{

	@Test
	public void testcase6() {
		test=reports.createTest("testcase6");

		ClassSchedulePage csp=new ClassSchedulePage(driver);

		csp.getScheduletn().click();
		
		utilities.switchTabs(driver);
		
		ClassSchedulePageTimePage csptp = new ClassSchedulePageTimePage(driver);
		
		csptp.getDaybtn().click();
		
		csptp.getStartDatebtn().click();
		
		csptp.getEndDatebtn().click();
				
	}
}
