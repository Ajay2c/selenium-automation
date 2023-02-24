package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AjayChandru\\Desktop\\SeliniumTest\\chrome-driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com");
		
		//driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
		driver.findElement(By.linkText("Edit")).click();
		
		
		
		
		//driver.quit();
		
		
	}

}
