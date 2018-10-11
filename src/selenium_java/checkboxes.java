package selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkboxes obj=new checkboxes();
		obj.setup();
		

	}

WebDriver driver;

public void setup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
	/*
	for(WebElement ele:radio)
	{
		String radio_list=ele.getAttribute("value");
		System.out.println("List of radio buttons:  " + radio_list);
		
		
	}
	*/
	
	for(int i=0;i<radio.size();i++)
	{
		WebElement radio_list=radio.get(i);
		String radio_value=radio_list.getAttribute("value");
		System.out.println("List of radio buttons2:  " + radio_value);
		
		if(radio_value.equalsIgnoreCase("RUBY"))
		{
			radio_list.click();
			
		}
		
		
	}
	
	
	//checkbox
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	int box_size=checkbox.size();
	
	for(int i = 0;i<box_size;i++)
	{
		WebElement box_list=checkbox.get(i);
		String box_value=box_list.getAttribute("id");
		System.out.println("List of checkbox value:  " + box_value);
		
		if(box_value.equalsIgnoreCase("sing"))
		{
			box_list.click();
			break;
		}
	}
	
	driver.close();
}

}
