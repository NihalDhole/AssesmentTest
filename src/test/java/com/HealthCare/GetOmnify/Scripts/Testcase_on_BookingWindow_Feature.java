package com.HealthCare.GetOmnify.Scripts;

import org.testng.annotations.Test;

import com.HealthCare.GetOmnify.Test.PomPages.BookingWindowPage;
import com.HealthCare.GetOmnify.Test.PomPages.BookingWindowPageWhenClosePage;
import com.HealthCare.GetOmnify.Test.PomPages.BookingWindowPageWhenOpenPage;
import com.HealthCare.GetOmnify.Test.PomPages.TitlePage;
import com.HealthCare.GetOmnify.Test.genericLib.BaseClass;

public class Testcase_on_BookingWindow_Feature extends BaseClass{

	@Test
	public void testcase7() {
		test=reports.createTest("testcase7");

		BookingWindowPage bwp=new BookingWindowPage(driver);

		bwp.getBookbtn().click();
		
		utilities.switchTabs(driver);
		
		BookingWindowPageWhenOpenPage bwpwop = new BookingWindowPageWhenOpenPage(driver);
		
		bwpwop.getOpenbtn().click();
		
		utilities.switchTabs(driver);
		
		BookingWindowPageWhenClosePage bwpwcp = new BookingWindowPageWhenClosePage(driver);
		
		bwpwcp.getClosebtn().click();
	}
}
