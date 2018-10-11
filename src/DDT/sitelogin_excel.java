package DDT;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sitelogin_excel {
	
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
		exceldata obj=new exceldata("C:\\Users\\Acer\\eclipse-workspace\\Selenium_java\\Testdata\\testexcel.xlsx");
		int rows=obj.getRowCount(0);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows;i++) 
		{
			
			data[i][0]=obj.getData(0, i, 0);
			data[i][1]=obj.getData(0, i, 1);
			
		}
		
		return data;
		
		
	}

}
