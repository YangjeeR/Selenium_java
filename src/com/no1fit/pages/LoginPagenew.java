package com.no1fit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagenew {
	
	WebDriver driver;
	
	public LoginPagenew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="/html/body/div/div/form/div[1]/input") @CacheLookup WebElement username;
	@FindBy(how=How.XPATH,using="/html/body/div/div/form/div[2]/input")  @CacheLookup WebElement password;
	@FindBy(how=How.XPATH,using="/html/body/div/div/form/button") @CacheLookup WebElement  button;
	@FindBy(how=How.LINK_TEXT,using="Forgot password?") 
	@CacheLookup
	WebElement link;
	
	public void loginPage(String user,String pwd)
	{
		username.sendKeys(user);
		password.sendKeys(pwd);
		button.click();
		//link.click();
		String text=driver.getTitle();
		if(text.equalsIgnoreCase("Dashboard"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	}
	
}
