/**
 * 
 */
package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Mayami
 *
 */
public class BasePage extends Page {

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	// generic util wrapers

	public void doClick(By Locator) {

		driver.findElement(Locator).click();
	}

	public void doSendKeys(By Locator, String text) {

		driver.findElement(Locator).sendKeys(text);
	}

	public String doGoText(By Locator) {

		return driver.findElement(Locator).getText();
	}

}
