package loginTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderexp {
	
	String [][] data = {
			{"Admin","K38eXty@@@DJ"},
			{"Admin1","dummy"},
			{"Admin","dummy"},
			{"Admin1","K38eXty@@@DJ"}
	};
	
	
	@DataProvider(name="loginDatas")
		public String[][] loginDataProvider(){
		
		return data;
	}
	
	
	@Test(dataProvider = "loginDatas")
	public void bothCorrect(String uName, String pword) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\All Files\\\\SeliniumTest\\\\Chrome_Driver\\\\chromedriver_win32\\\\chromedriver.exe");
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
