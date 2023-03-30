package com.HealthCare.GetOmnify.Scripts;

import javax.swing.text.Utilities;

import org.testng.annotations.Test;

import com.HealthCare.GetOmnify.Test.PomPages.ClassDetailsPage;
import com.HealthCare.GetOmnify.Test.PomPages.ClassDetailsPageOfflinePage;
import com.HealthCare.GetOmnify.Test.PomPages.ClassDetailsPageOnlinePage;
import com.HealthCare.GetOmnify.Test.PomPages.ClassDetailsPageServiceTypePage;
import com.HealthCare.GetOmnify.Test.PomPages.ClassDetailsPageServiceTypePageFreePage;
import com.HealthCare.GetOmnify.Test.PomPages.ClassDetailsPageServiceTypePagePaidPage;
import com.HealthCare.GetOmnify.Test.PomPages.ClassDetailsPageTrainerPage;
import com.HealthCare.GetOmnify.Test.genericLib.BaseClass;

public class Testcase_on_ClassDetails_Feature extends BaseClass {


	@Test
	public void testcase5() {
		test=reports.createTest("testcase5");

		ClassDetailsPage cdp=new ClassDetailsPage(driver);

		cdp.getDetailsbtn().click();
		
		cdp.getLocationtn().click();
		
		utilities.switchTabs(driver);
		
		ClassDetailsPageOnlinePage cdpop = new ClassDetailsPageOnlinePage(driver);
		
		cdpop.getOnlinebtn().click();
		
		utilities.switchTabs(driver);
		
		ClassDetailsPageOfflinePage cdpoff=new ClassDetailsPageOfflinePage(driver);
		
		cdpoff.getOfflinebtn().click();
		
		utilities.switchTabs(driver);
		
		ClassDetailsPageTrainerPage cdptp = new ClassDetailsPageTrainerPage(driver);
		
		cdptp.gettrainerbtn().click();
		
		utilities.switchTabs(driver);
		
		ClassDetailsPageServiceTypePage cdpstp = new ClassDetailsPageServiceTypePage(driver);
		
		cdpstp.getServicebtn().click();
		
		utilities.switchTabs(driver);
		
		ClassDetailsPageServiceTypePageFreePage cdpstpfp = new ClassDetailsPageServiceTypePageFreePage(driver);
		
		cdpstpfp.getFreebtn().click();
		
		utilities.switchTabs(driver);
		
		ClassDetailsPageServiceTypePagePaidPage cdpstppp = new ClassDetailsPageServiceTypePagePaidPage(driver);
		
		cdpstppp.getPaidbtn().click();
		
		}
}
