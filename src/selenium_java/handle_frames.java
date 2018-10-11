package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     handle_frames obj=new handle_frames();
     obj.testFrame();
	}
	
	public void testFrame()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("C:\\Users\\Acer\\Desktop\\frametest.html");
		driver.switchTo().frame("test");
		driver.findElement(By.id("q")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    driver.switchTo().defaultContent();
	    
	int total_frames=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total frames in application is " + total_frames);
	}

}
