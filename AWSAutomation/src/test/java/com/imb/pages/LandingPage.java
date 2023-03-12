package com.imb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.imb.constants.Constants;

public class LandingPage {

	// WebElement >> Locator Type and Locator Value will appear here
	// WebElement Specific Methods>>
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;

	@FindBy(how = How.ID, using = "pass")
	WebElement passwd;

	public void enterEmail(String email1) {
		email.sendKeys(email1);
	}

	public void enterPasswd(String passwd1) {
		passwd.sendKeys(passwd1);
	}

	@Test
	public void enterEmail2() {
		email.sendKeys(null);
	}
}
