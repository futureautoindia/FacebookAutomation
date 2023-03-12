package com.imb.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.imb.basepackage.BaseClass;
import com.imb.keywords.Keywords;
import com.imb.utility.PropertyReadUtils;

public class LoginTests {

	@Test
	public void TC_001() throws Exception {
		BaseClass.launchBaseClass();
		Keywords.enterText(
				PropertyReadUtils.getProperty("email", "LocatorsObjectRepository/ObjectRepository.properties")[0],
				PropertyReadUtils.getProperty("email", "LocatorsObjectRepository/ObjectRepository.properties")[1],
				"futureautoall@gmail.com");
		Keywords.enterText(
				PropertyReadUtils.getProperty("password", "LocatorsObjectRepository/ObjectRepository.properties")[0],
				PropertyReadUtils.getProperty("password", "LocatorsObjectRepository/ObjectRepository.properties")[1],
				"Test@321");
		Keywords.clickOnBtn(
				PropertyReadUtils.getProperty("loginbtn", "LocatorsObjectRepository/ObjectRepository.properties")[0],
				PropertyReadUtils.getProperty("loginbtn", "LocatorsObjectRepository/ObjectRepository.properties")[1]);
		// Enter Email/Phone Number
		// Enter Password
		// Click on Login Btn
	}

}
