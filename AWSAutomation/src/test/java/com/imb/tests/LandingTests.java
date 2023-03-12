package com.imb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(customlisteners.ImbListeners.class)
public class LandingTests {
	@Test
	public void TC_343435355() {
		// https://www.google.com/

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Future");
		driver.findElement(By.name("pass")).sendKeys("Admin5354@");

	}

}
