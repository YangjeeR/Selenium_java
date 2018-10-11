package com.no1fit.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.no1fit.pages.LoginPage;

public class VerifyLogin {
	
	
	@Test 
	public void LoginTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newpark.graphenecreative.co.uk/admin");
	
		
		LoginPage Login=new LoginPage(driver);
		/*Login.typUsername("admin");
		Login.password("admin");
		Login.clickbtn();*/
		
		Login.LoginToadmin("admin", "admin");
		

		
	}

}
