package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Login Pag Titile is : " + title);
		Assert.assertEquals(title, "HubSpot Login");

	}

}
