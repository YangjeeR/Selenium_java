package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lib.ClickElement;

public class notclickable_element {
	

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://login.yahoo.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	/*driver.findElement(By.xpath("//*[@id=\"persistent\"]']")).click();*/
	ClickElement.clickById(driver, "persistent");

	//driver.close();
	}
	

}
