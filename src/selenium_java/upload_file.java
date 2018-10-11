package selenium_java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Acer/Desktop/fileupload.html");
		
    driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
    Runtime.getRuntime().exec("C:\\Users\\Acer\\Desktop\\AutoIT\\fileupload.exe");

	}

}
