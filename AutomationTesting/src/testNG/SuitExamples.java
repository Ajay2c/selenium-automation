package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExamples {
	
	WebDriver driver;
	long startTime;
	long endTime;
	//1.Aim: open chrome and go to
	//1. google.co.in 2.bing.com and 3.yahoo.com and then close the browser
	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\AjayChandru\\\\\\\\Desktop\\\\\\\\SeliniumTest\\\\\\\\chrome-driver\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void openChrome() {
		driver.get("http://www.google.com");
	}
	@Test
	public void openBingo() {
		driver.get("http://www.bing.com");
	}
	@Test
	public void openYahoo() {
		driver.get("http://www.yahoo.com");
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("The total time is :" + totalTime);
		
	}
	
}
