package OrangeHRM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addAdmin {
	@SuppressWarnings("deprecation")
	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayC\\Desktop\\GIT\\selenium-automation\\AutomationTesting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		email.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		Thread.sleep(3000);
		WebElement admin = driver.findElement(By.linkText("Admin"));
		admin.click();
		
		Thread.sleep(2000);
		WebElement addbutton = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		addbutton.click();
		
		Thread.sleep(2000);
		// Locate the dropdown element using its class attribute
		WebElement dropdown = driver.findElement(By.className("oxd-select-text"));

		// Click on the dropdown to open the options
		dropdown.click();

		Thread.sleep(2000);
		// Locate the "Admin" option within the dropdown using its text
		WebElement adminOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]"));

		// Click on the "Admin" option to select it
		adminOption.click();
		
		//enter Employee Name
		WebElement enterName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
		enterName.sendKeys("Joe Root");
		
		Thread.sleep(2000);
		WebElement joeRootSelect = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div/span"));
		joeRootSelect.click();
		
		//enter User Name
		WebElement enterUserName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
		enterUserName.sendKeys("ajay_c_20");
		
		Thread.sleep(2000);
		// Click on the Status to "Enable"
		WebElement statusDropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
		statusDropDown.click();
		
		Thread.sleep(2000);
		// select enable in the dropdown
		WebElement selectEnable = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]"));
		selectEnable.click();
		
		//enter Password
		WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
		enterPassword.sendKeys("ajay_c_20");
		
		//enter Confirm Password
		WebElement enterConformPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
		enterConformPassword.sendKeys("ajay_c_20");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
		submit.click();
		
		
		Thread.sleep(7000);
		
		
		driver.quit();


		
		
	}
	
}