package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class certificateIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		WebDriver driver=new ChromeDriver(cap);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver.get("");

	}

}
