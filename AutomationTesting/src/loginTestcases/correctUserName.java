package loginTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class correctUserName {
	
	@Test
	@Parameters({"username","password"})
	public void loginWithCorrectUserName(String uName, String pword) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AjayChandru\\Desktop\\All Files\\SeliniumTest\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ajaychandru-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		driver.quit();
	
	}
	
}
