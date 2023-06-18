package OrangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addPIM {

	private static final String Keyevent = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
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
		
		Thread.sleep(2000);
		
		
		
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
		
		
		
		
		
		

		
	}

}
