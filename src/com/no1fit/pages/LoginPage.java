package com.no1fit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username=By.xpath("/html/body/div/div/form/div[1]/input");
	By password=By.xpath("/html/body/div/div/form/div[2]/input");
	By submit=By.xpath("/html/body/div/div/form/button");
	
//constructor
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LoginToadmin(String user,String pwd)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		clickbtn();
	}
	
	public void typUsername(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	public void password(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickbtn()
	{
		driver.findElement(submit).click();
	}
	
	

}
