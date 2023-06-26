package OrangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addPIM {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayC\\Desktop\\GIT\\selenium-automation\\AutomationTesting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		email.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		Thread.sleep(3000);
		
		
		
		// select the PIM in navigation bar
		WebElement linkPIM = driver.findElement(By.linkText("PIM"));
		linkPIM.click();
		Thread.sleep(2000);
		
		WebElement addButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		addButton.click();
		
		// upload file
		Thread.sleep(2000);
		
		WebElement addImage = driver.findElement
				(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button"));
		addImage.click();
		
		// 
		
		Thread.sleep(2000);
		String file = "C:\\Users\\AjayC\\Desktop\\Selenium Images\\1098550.jpg";
		
		StringSelection goingtoselect = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(goingtoselect, null);
		
		Robot paste = new Robot();
		paste.keyPress(KeyEvent.VK_CONTROL);
		paste.keyPress(KeyEvent.VK_V);
		paste.keyRelease(KeyEvent.VK_V);
		paste.keyRelease(KeyEvent.VK_CONTROL);
		paste.keyPress(KeyEvent.VK_ENTER);
		paste.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Ajay");
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("C");
		
		Thread.sleep(3000);
		// Employee ID
		WebElement ClearEmpID = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
		
		String s = Keys.chord(Keys.CONTROL, "a");
		ClearEmpID.sendKeys(s);
		
		ClearEmpID.sendKeys(Keys.DELETE);
		
		
		WebElement EmpID = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
		EmpID.sendKeys("112233");

		// check the create login details 
		WebElement createButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));

		createButton.click();
		
		//Status: Enabled 
		boolean status1 = createButton.isEnabled();
		
		// Status: Disabled
		boolean status2 = createButton.isSelected();
		
		System.out.print(status1); // exp: True
		System.out.print(status2); // exp: False
		
		// add user name and password
		WebElement UserName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
		UserName.sendKeys("ajay_20");
		
		String Password = "aja20@199";
		WebElement GenPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));
		GenPassword.sendKeys(Password);
		
		WebElement ConPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
		ConPassword.sendKeys(Password);
		
		WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		SubmitButton.click();
		
		Thread.sleep(4000);
		
		// getting the final action status 
		WebElement status = driver.findElement(By.id("oxd-toaster_1"));
		String statusName = status.getText();
		System.out.print(statusName);
		
		// going to find the 
		
		
		
		
		
		// Get values - Assertions checks
		
		
		
		
		
		
		
		
		

		
	}

}
