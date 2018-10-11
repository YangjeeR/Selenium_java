package TestRunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TestNG runner = new TestNG();
	List<String> list=new ArrayList<String>();
	list.add("C:\\Users\\Acer\\eclipse-workspace\\Selenium_java\\test-output\\Smoke_Test\\testng-failed.xml");
	runner.setTestSuites(list);
	runner.run();
	}

}
