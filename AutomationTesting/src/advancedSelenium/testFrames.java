package advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/frame.html");
		
		//1. check the frame name
		
		driver.switchTo().frame(0);
		WebElement firstBox = driver.findElement(By.id("Click"));
		firstBox.click();
		
		String getText = driver.findElement(By.id("Click")).getText();
		System.out.println(getText);
		driver.switchTo().defaultContent();
		//2. get the text inside of the nested frame
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement secondBox = driver.findElement(By.id("Click1"));
		secondBox.click();
		driver.switchTo().defaultContent();
		
		//3.find the total number of frames
		
		List<WebElement> findTags =driver.findElements(By.tagName("iframe"));
		int count =findTags.size();
		System.out.println(count);
		
		
		

	}

}
