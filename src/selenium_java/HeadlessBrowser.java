package selenium_java;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class HeadlessBrowser {

	@Test
	public void verifyTitle()
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new HtmlUnitDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver.get("https://www.facebook.com");
		String facebook_title=driver.getTitle();
		Assert.assertTrue(facebook_title.contains("facebook"));
	}

}
