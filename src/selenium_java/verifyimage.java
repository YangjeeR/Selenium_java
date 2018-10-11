package selenium_java;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class verifyimage {
	
	
	WebDriver driver;
@Test
public void setup() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	

	
    driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("pluralsight");
	 Actions action = new Actions(driver); 
	   action.sendKeys(Keys.ENTER).build().perform();
	   
	   Thread.sleep(3000);
	
	  WebElement menus = driver.findElement(By.xpath("//div[@id='hdtb-msb']"));
	  List<WebElement> all_menus=menus.findElements(By.tagName("a"));
	  int count=all_menus.size();
	  System.out.println(count);
	  for(WebElement element:all_menus)
	  {
		  String ele=element.getText();
		  System.out.println(ele);
		  if(element.getText().contains("Images")) {
			  element.click();
			  System.out.println("image menus clicked");
             
          }
	  }
       
	  Thread.sleep(7000);
	  WebElement images=driver.findElement(By.xpath("//*[@id=\"isr_mc\"]"));
	  List<WebElement> all_img=images.findElements(By.tagName("img"));
	  int count1=all_img.size();
	  System.out.println(count1);
	  for(int i=0;i<count1;i++)
	  {
		  if(i==0)
		  {
			  all_img.get(i).click();
			  System.out.println("First image has been clicked");
		  }
	  }
}

}
