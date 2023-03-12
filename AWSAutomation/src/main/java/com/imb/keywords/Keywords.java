/*
 *Project Name : BigDataWorking
 *Author : Ashish Jaiswal for Future Automation
 *Client : ICICI Bank
 *Organization : ICICI Bank
 */

package com.imb.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.imb.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	/**
	 * It Launches Different Browser Using Driver instance
	 * 
	 * @param browserName {@code String}
	 * @return void
	 * @author Ashish Jaiswal
	 *
	 */
	public static void launchBrowser(String browserName) {
//in your project there might be situation - you need to test your application with multiple browsers

		switch (browserName) {

		case "Chrome":

			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
		default:
			System.out.println("Invalid Browser Name :" + browserName);
		}

	}

	public static void launchURL(String url) {

		Constants.driver.get(url);
	}

	public static void customizedWait(long Time) {
		Constants.driver.manage().timeouts().implicitlyWait(Time, TimeUnit.MILLISECONDS);
	}

	public static void maximizeWindow() {
		Constants.driver.manage().window().maximize();
	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element = null;
		switch (locatorType) {

		case "XPATH":
			element = Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "ID":
			element = Constants.driver.findElement(By.id(locatorValue));
			break;
		case "CSS":
			element = Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "LINKTEXT":
			element = Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIALLINKTEXT":
			element = Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "NAME":
			element = Constants.driver.findElement(By.name(locatorValue));
			break;
		case "CLASSNAME":
			element = Constants.driver.findElement(By.className(locatorValue));
			break;
		case "TAGNAME":
			element = Constants.driver.findElement(By.tagName(locatorValue));
			break;

		default:
			System.err.println("Invalid Locator Type :" + locatorType);
		}
		return element;

	}

	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);

	}

	public static void clickOnBtn(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}

	public static void selectValueFromDropdown(String locatorType, String locatorValue, String textToSelect) {
		WebElement element = getWebElement(locatorType, locatorValue);
		Select select = new Select(element);
		select.selectByVisibleText(textToSelect);
	}

	public static void clickOnLinkInsideFrame(String locatorType, String locatorValue, String frameName) {
		Constants.driver.switchTo().frame(frameName);
		getWebElement(locatorType, locatorValue).click();
	}

	public static void windowHandling(String locatorType, String locatorValue) {

	}
}
