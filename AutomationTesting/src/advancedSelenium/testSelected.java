package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selected.html");
		
		
		WebElement selected = driver.findElement(By.xpath(null));
		
		int listSize = selected.size();
		System.out.println(listSize);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selected.get(0))
		.click(selected.get(1))
		.click(selected.get(2)).build().perform();
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(selected.get(0));
		actions.clickAndHold(selected.get(1));
		actions.clickAndHold(selected.get(2));
		actions.build().perform();
		
		
		
		
		
		
		
	}

}
