package advancedSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");
		
		//we are going to store the parent window on this name 
		
		String oldWindow = driver.getWindowHandle();
		
		//1.Click button on open home page in New window
		
		WebElement openHomePage = driver.findElement(By.id("home"));
		openHomePage.click();
		
		
		Set<String> handles = driver.getWindowHandles();//when it comes to multiple windows we must use set-string to store all the windows 
		//using loop concept by switching the Old to New windows
			for(String newWindow:handles) {
				driver.switchTo().window(newWindow);
				}
		//selecting edit after switch it new windows 
		WebElement clickEdit = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		clickEdit.click();
		driver.close();
		driver.switchTo().window(oldWindow); //switch it to old window
		
		//2. Find the number of opened Windows
		
		WebElement totalWindows = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		totalWindows.click();
		//using size() to get the count for open windows as interger
		int countWindows = driver.getWindowHandles().size(); 
		System.out.println("The total open windows are: " + countWindows);
		driver.switchTo().window(oldWindow); // again switch it to parent window
		
		//3. Close all window except this old window
		
		WebElement keepOldwindows = driver.findElement(By.id("color"));
		keepOldwindows.click();
		//
		Set<String> colorAllWindows = driver.getWindowHandles();
		//condition for checking the new all window is != old windows : TRUE it will run
		for (String allWindows : colorAllWindows) {
			if (!allWindows.equals(oldWindow) ) {
				driver.switchTo().window(allWindows);
				driver.close();
				
			}
			
			//FALSE 
		}
		driver.quit();
	}

}