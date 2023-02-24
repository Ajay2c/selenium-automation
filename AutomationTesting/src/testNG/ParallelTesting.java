package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	WebDriver driver = new ChromeDriver();
	@Test(priority = 0)
	public void openChrome() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		driver.get("http://www.google.com");
		
	}
	@Test(priority = 1)
	public void openBing() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		driver.get("http://www.bing.com");
		
	}
	@Test(priority = 2)
	public void openFireFox() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		driver.get("http://www.firefox.com");
		
	}
}
