package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {
	
	public WebDriver driver;
	public static void clickById(WebDriver driver,String id)
	{
	
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.id(id))).click().build().perform();
	}
	public void setup(String url) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

}
