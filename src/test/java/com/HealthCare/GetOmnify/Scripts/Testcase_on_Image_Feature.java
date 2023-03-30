package com.HealthCare.GetOmnify.Scripts;

import org.testng.annotations.Test;


import com.HealthCare.GetOmnify.Test.PomPages.ImagePage;
import com.HealthCare.GetOmnify.Test.genericLib.BaseClass;


public class Testcase_on_Image_Feature extends BaseClass {


	@Test
	public void testcase4() {
		test=reports.createTest("testcase4");

		ImagePage img=new ImagePage(driver);

		img.getImagebtn().click();
		
		utilities.switchTabs(driver);

	}
}	
