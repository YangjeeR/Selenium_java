package com.no1fit.Testcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.no1fit.pages.LoginPagenew;

import Utility.BrowserFactory;

public class VerifyLoginNew {
	
	@Test
	public void LoginValidTest()
	{
	WebDriver driver=BrowserFactory.Browser("chrome","http://newpark.graphenecreative.co.uk/admin/");
	//Create Page Object using Page Factory
	LoginPagenew login_page=PageFactory.initElements(driver, LoginPagenew.class);
	login_page.loginPage("admin","admin");
	}

}
