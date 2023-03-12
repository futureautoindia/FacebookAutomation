package com.imb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {

	@Test(dataProvider = "loginDataProvider", dataProviderClass = AppDataProvider.class)
	public void TC_001(String uname, String passwd) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(passwd);
	}

}
