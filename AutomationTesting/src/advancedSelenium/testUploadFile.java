package advancedSelenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testUploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement clickUpload = driver.findElement(By.name("filename"));
		
		clickUpload.click();
		
		//window dialoge box open
		
		String file = "C:\\Users\\AjayChandru\\Downloads\\MicrosoftTeams-image (10).png"; // Strong in a location in temparory file
		
		StringSelection goingtoSelect = new StringSelection(file); // Changing String file to Plain Text 
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(goingtoSelect, null /* Owner  */ ); // using sentContent for paste the text file in window based dialouge box
		
		
		
		
		// We going to use ROBOT function to do action the Window based dialouge box.
		
		Robot paste = new Robot(); // Creating Class Object 
		
		paste.keyPress(KeyEvent.VK_CONTROL);
		paste.keyPress(KeyEvent.VK_V);
		paste.keyRelease(KeyEvent.VK_V);
		paste.keyRelease(KeyEvent.VK_CONTROL);
		paste.keyPress(KeyEvent.VK_ENTER);
		paste.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
