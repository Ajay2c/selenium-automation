package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		//1.Select the language in check box
		WebElement selectLanguage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]"));
		selectLanguage.click();
		
		//2.Check the checkbox is select or not
		WebElement confirmCheckbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean checkthebox = confirmCheckbox.isEnabled();
		System.out.println(checkthebox);
		
		//3.Check the checkbox is select or deselect
		
		
		WebElement deselectCheckbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		
		boolean deselect = deselectCheckbox.isEnabled(); // True
		
		if (deselect) { //True va erutha itha panu
			
			deselectCheckbox.click();
			
			
		}
		

	}

}
