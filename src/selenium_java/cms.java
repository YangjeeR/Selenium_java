package selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cms {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		cms obj1 = new cms();
		obj1.setup("admin@admin.com", "password");

	}

	public void setup(String userid, String password0) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://showcase.graphenecreative.co.uk/");

		driver.findElement(By.id("identity")).sendKeys(userid);
		driver.findElement(By.id("password")).sendKeys(password0);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[3]/div/button")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[1]/a")).click(); // admin click
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[1]/ul/li[2]/div/div[1]/a")).click(); // admin
     
		driver.get("http://showcase.graphenecreative.co.uk/");
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"products\"]/div[2]"));
		List<WebElement> iimages = element.findElements(By.tagName("a"));
		int count = iimages.size();

		for (int o = 0; o <=count; o++) {
			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"products\"]/div[2]"));
			List<WebElement> iimages1 = element1.findElements(By.tagName("a"));
			
			if(o==0)
			{
			WebElement img=iimages1.get(o);
			System.out.println(img.getAttribute("href"));
			iimages.get(o).click();
			System.out.println("The Kon$truct has been clicked");
			}
		}
		
	
	}

}
