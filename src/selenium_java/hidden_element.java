package selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import lib.ClickElement;


public class hidden_element  extends ClickElement{

	
	public void hidden1() throws InterruptedException
	{
		setup("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
        
        int x=driver.findElement(By.id("male")).getLocation().getX();
        int y=driver.findElement(By.id("male")).getLocation().getY();
        
        System.out.println("X cord " + x);
        System.out.println("Y cord " + y);
	}
	
	public void hidden() throws InterruptedException
	{
		setup("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
        
		List<WebElement> hidden_ele=driver.findElements(By.id("male"));
		
		int count=hidden_ele.size();
				
		System.out.println("The list of elements :" + count);
		
		for(int i=0;i<count;i++)
			
		{
			WebElement ele=hidden_ele.get(i);
			int x=ele.getLocation().getX();
			
			if(x!=0)
			{
				hidden_ele.get(i).click();
				break;
			}
			
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		hidden_element obj=new hidden_element();
		obj.hidden();
	}

}
