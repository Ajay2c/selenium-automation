package advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPlaywithHyperText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://commons.wikimedia.org/wiki/Main_Page");
		
		
		
		//1. Click the link to go home page
		
		WebElement goHomePage = driver.findElement(By.linkText("Tweet"));
		goHomePage.click();
		
		driver.navigate().back();  // use to come back the previous page
		
		
		//2.get the Hyperlink  name without click
		
		WebElement comeBack = driver.findElement(By.partialLinkText("Picture of the "));
		String linkName = comeBack.getAttribute("href");
		System.out.println("The HyperLink name is: "+linkName);
		
		//3. find how many tags are in this Web page
		
		List<WebElement> findingAtag = driver.findElements(By.tagName("a"));
		int totalSize = findingAtag.size();
		
		System.out.println("The total <a> on this page: "+totalSize);
		
		//4. check the Title is broken or not
		
		String checkTitleBrokenorNot = driver.getTitle();
		
		if (checkTitleBrokenorNot.contains("404")) {
			System.out.println("This page Title is broken");
			
		}else {
			System.out.println("This page is not Broken");
		}

	}

}
