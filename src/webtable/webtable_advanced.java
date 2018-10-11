package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class webtable_advanced {
	
	@Test	
	public void DatePicker() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	    Thread.sleep(3000);
	    List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table//td"));
	    int dates_count=dates.size();
	    System.out.print(dates_count);
	    for(int i=0;i<dates_count;i++)
	    {
	    String date_check=dates.get(i).getText();
	    Thread.sleep(3000);
	    if(date_check.equalsIgnoreCase("30"))
	    {
	    	dates.get(i).click();
	    	break;
	    }
	    	
	    }
	    }
}
	
