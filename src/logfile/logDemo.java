package logfile;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Logger log=	Logger.getLogger("logDemo");
	PropertyConfigurator.configure("Log4j.properties");
	WebDriver driver;
	
	// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Desktop\\selenium\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	log.info("Firefox browser opened");
	driver.navigate().to("http://no1fitedu.graphenecreative.co.uk/");
	log.info("No1 site is opened");
	driver.manage().window().maximize();
	
	List<WebElement> anchor=driver.findElements(By.tagName("a"));
	
	System.out.println("Total number of links : " + anchor.size());
	
	for(int i=0;i<anchor.size();i++)
	{
		WebElement anchor_count=anchor.get(i);
		String anchor_name=anchor_count.getAttribute("href");
		log.info("Capture the anchor tag");
		verifylinks(anchor_name);
		
		
	  
}
}


	public static void verifylinks(String linkurl)	
	{
	try 
	{
		URL anchor_name=new URL(linkurl);
		HttpURLConnection httpconnect=(HttpURLConnection)anchor_name.openConnection();
		httpconnect.setConnectTimeout(3000);
		httpconnect.connect();
		
		if(httpconnect.getResponseCode()==200)
		{
			System.out.println(linkurl + "-" + httpconnect.getResponseMessage());
		
	}
		if(httpconnect.getResponseCode()==httpconnect.HTTP_NOT_FOUND)
		{
			System.out.println(linkurl + "-" + httpconnect.getResponseMessage() + "-" +httpconnect.HTTP_NOT_FOUND);
			
		}
	}
	catch( Exception e)
	{
		
	}
}
	

	}


