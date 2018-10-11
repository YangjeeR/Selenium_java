package selenium_java;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class verify_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		verify_dropdown obj=new verify_dropdown();
		obj.setup();
		obj.dropdown1();

	}
	WebDriver driver;
	
	
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();
		
	}
	
	public void dropdown()
	{
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		
		WebElement month_selected=month_dd.getFirstSelectedOption();
		System.out.println("Month before selecting  "+ month_selected.getText());
		
		month_dd.selectByVisibleText("May");
		
		WebElement month_selected1=month_dd.getFirstSelectedOption();
		System.out.println("Month after selection "+ month_selected1.getText());
		driver.close();
	}
	

	public void dropdown1()
	{
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		List<WebElement> month_list=month_dd.getOptions();
		
		int count_month=month_list.size();
		//Assert.assertEquals(count_month,14);
		System.out.println("Total no of months is " + count_month);
		
		for(WebElement web:month_list)
		{
			String month_name=web.getText();
			System.out.println("Name of Month is " + month_name);
		}
	}

}
