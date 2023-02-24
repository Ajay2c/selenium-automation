package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenchromeEdittextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AjayChandru\\Desktop\\SeliniumTest\\chrome-driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("test@duck.com");
		
		
		WebElement AppendBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		AppendBox.sendKeys("Test");
		
		WebElement DefaultText = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input"));
		String value = DefaultText.getAttribute("value");
		System.out.println(value);
		
		WebElement ClearText = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		ClearText.clear();
		
		WebElement CheckingDisabledBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean enabled = CheckingDisabledBox.isEnabled();
		System.out.println(enabled);
		

	}

}
