package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webtable_static {
	

@Test	
public void DatePicker() throws InterruptedException
{
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Desktop\\selenium\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to("https://www.redbus.in/");
	driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[4]/td[7]")).click();
}


}

