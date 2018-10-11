import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.helper;

public class highlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 WebDriver driver;
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		   driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com/"); 
			WebElement username= driver.findElement(By.id("email"));
	        helper.highLightElement(driver, username);
	        username.sendKeys("yrai");
	        WebElement password= driver.findElement(By.id("pass"));
	        helper.highLightElement(driver, password);
	        password.sendKeys("123");
	        WebElement loginbtn= driver.findElement(By.id("u_0_5"));
	        helper.highLightElement(driver, loginbtn);
	        loginbtn.click();
	 
	 
	}


}
