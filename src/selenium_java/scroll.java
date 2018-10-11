package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class scroll {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		scroll obj=new scroll();
		//obj.scrollview();
		//obj.scrollDown();
		obj.mousehover();
		
		
	}
	
	
	public void scrollDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	//((JavascriptExecutor)driver).executeScript("scroll(0,1000)");//vertical
	((JavascriptExecutor)driver).executeScript("scroll(1000,0)");//Horizontal
		
	}

	public void scrollview() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[2]/section/div[1]/div/div[1]/p[13]"));
		
		je.executeScript("arguments[0].scrollIntoView(true);", element1);
		
       System.out.print(element1.getText());
		
	}
	
	public void mousehover() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"post-body-4229879368008023176\"]/div[1]/div[2]/button"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		List<WebElement> anchor_list=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int anchor_count=anchor_list.size();
		
		for(int i=0;i<anchor_count;i++)
		{
			WebElement anchor = anchor_list.get(i);
			String anchor_name=anchor.getAttribute("innerHTML");
			
			System.out.println("The name of links are: " +anchor_name);
			//builder.click(anchor_name).build().perform();
			if(anchor_name.equalsIgnoreCase("Appium"))
			{
				anchor.click();
			}
		}
	}
	
}
