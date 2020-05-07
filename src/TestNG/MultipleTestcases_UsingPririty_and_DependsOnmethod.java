package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTestcases_UsingPririty_and_DependsOnmethod {
	public static WebDriver driver;
//test is annotation priority is attribute

//Prioritize test cases
//* test(priority=number)
//* test(DependsOnmethod="before method")

	@Test(priority = 1)
	public void launchbrowser() {
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Acer\\eclipse-workspace\\seleniumJavaframework\\drivers\\gechodriver\\geckodriver.exe");
	}

	@Test(priority = 2)
	public void verifygoogleTitle() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Google", pageTitle);
	}

	@Test(priority = 3)
	public void verifyYahooTitle() {
		driver.manage().window().maximize();
		driver.get("https://www.Yahoo.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Yahoo", pageTitle);
	}

	@Test(priority = 4)
	public void verifyBankofIndiaTitle() {
		driver.manage().window().maximize();
		driver.get("https://www.bankofindia.co.in");
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Bank Of India - Home", pageTitle);
	}

	@Test(priority = 5)
	public void closebrowser() {
		driver.close();
	}
}
