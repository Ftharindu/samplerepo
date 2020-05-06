package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_BeforeClass_AfterClass_Priority {
	public static WebDriver driver;
	

	@BeforeClass
	public void launchbrowser() {
		driver = new FirefoxDriver();
	}

	@Test (priority = 1)
	public void verifygoogleTitle() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Google", pageTitle);
	if(pageTitle.equals("Google")) {
		System.out.println("Google : Passed");
	}
	}

	@Test (priority = 2)
	public void verifyYahooTitle() {
		driver.get("https://www.Yahoo.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Yahoo", pageTitle);
		if(pageTitle.equals("Yahoo")) {
			System.out.println("Yahoo : Passed");
		}
	}

	@Test (priority = 3)
	public void verifyBankofIndiaTitle() {
		driver.get("https://www.bankofindia.co.in");
		String pageTitle = driver.getTitle();
		Assert.assertEquals("BOI | Bank of India", pageTitle);
		if(pageTitle.equals("BOI | Bank of India")) {
			System.out.println("BOI | Bank of India :Passed");
		}
	}

	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
