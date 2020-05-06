package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifytitle {
@Test
public void verifyTitle() {
	WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\eclipse-workspace\\seleniumJavaframework\\drivers\\gechodriver\\geckodriver.exe");
	driver.get("https://www.google.com");
	String pageTitle = driver.getTitle();
	
	Assert.assertEquals("Google", pageTitle);
	driver.close();
}
}
