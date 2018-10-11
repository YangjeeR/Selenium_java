package DDT;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sitelogin {
	
	WebDriver driver;
	@Test(dataProvider="sitedata")
	public void sitesetup(String username,String password)
	{
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newpark.graphenecreative.co.uk/admin");
		driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
		Thread.sleep(3000);
		
		Assert.assertTrue("User's credentials are not correct",driver.getTitle().contains("Dashboard"));
		System.out.println("The site is successfully logged in");
		
		}
		
		catch(Exception e)
		{
		 e.printStackTrace();	
		}
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
	@DataProvider(name="sitedata")
	public Object[][] testdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="admin";
		data[1][0]="admin1";
		data[1][1]="admin2";
		data[2][0]="admin1";
		data[2][1]="admin3";
		
		return data;
		
		
	}

}
