package com.imb.tests;

import org.testng.annotations.DataProvider;

public class AppDataProvider {
	@DataProvider(name = "loginDataProvider")
	public Object[][] loginData() {

		Object[][] values = { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" } };
		return values;
	}

}
