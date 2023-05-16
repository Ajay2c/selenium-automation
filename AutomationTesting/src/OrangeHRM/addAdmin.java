package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addAdmin {
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayC\\Desktop\\GIT\\selenium-automation\\AutomationTesting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		email.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
	}
	
}