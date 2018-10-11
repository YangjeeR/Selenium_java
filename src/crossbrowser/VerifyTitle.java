package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void VerifyPageTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Desktop\\selenium\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
				driver=new ChromeDriver();
			}


	driver.manage().window().maximize();
	driver.get("http://newpark.graphenecreative.co.uk/");
	System.out.println(driver.getTitle());
	driver.quit();

}
}
