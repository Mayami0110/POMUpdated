package com.qa.hubspot.tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hubspot.pages.Page;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	public String strAbsolutepath = new File("").getAbsolutePath();

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",strAbsolutepath + "\\Resources\\chromedriver2.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// create the object of page class : Instantiate Page Class
		page = new Page(driver, wait);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
