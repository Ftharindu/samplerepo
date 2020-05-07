package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTestcases_UsingdependsonMethods {
	public static WebDriver driver;
	//test is annotation priority is attribute

	//Prioritize test cases
	//* test(priority=number)
	//* test(DependsOnmethod="before method")
	
	//If we use"dependsOnMethods" attribute then it will skip the test case execution whenever dependsonmethods test case fails.
	//if you want to execute a test case forcedly then use "alwaysRun" attribute

	@Test  
	public void launchbrowser()
	{
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\eclipse-workspace\\seleniumJavaframework\\drivers\\gechodriver\\geckodriver.exe");
	}
	@Test(dependsOnMethods = "launchbrowser")
	public void verifygoogleTitle()
	{
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String pageTitle = driver.getTitle();
	Assert.assertEquals("Googleq", pageTitle);
	}						
	@Test(dependsOnMethods = "verifygoogleTitle", alwaysRun = true)// using alwaysRun command we can execute all test cases without interruption if any test case is failed.
	public void verifyYahooTitle()
	{
	driver.manage().window().maximize();
	driver.get("https://www.Yahoo.com"); 
	String pageTitle = driver.getTitle();
	Assert.assertEquals("Yahoo", pageTitle);
	}
	@Test(dependsOnMethods = "verifyYahooTitle")
	public void closebrowser(){
		driver.close();
	}
}