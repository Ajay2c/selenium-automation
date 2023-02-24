package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AjayChandru\\Desktop\\SeliniumTest\\chrome-driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		//1.Choosing dropdown using index
		WebElement dropDown1 =  driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByIndex(1);
		
		//2.Choosing dropdown using Text
		WebElement dropDown2 =  driver.findElement(By.name("dropdown2"));
		Select boxTwo = new Select(dropDown2);
		boxTwo.selectByVisibleText("Selenium");
		
		//3.Choosing dropdown using Value
		WebElement dropDown3 =  driver.findElement(By.id("dropdown3"));
		Select boxThree = new Select(dropDown3);		
		boxThree.selectByValue("2");
		
		//4.getting how many option in dropdown
		WebElement dropDown4 =  driver.findElement(By.className("dropdown"));
		Select boxFour = new Select(dropDown4);
		
		List <WebElement> listOfOptions =boxFour.getOptions();
		int size = listOfOptions.size();
		System.out.println(size);
		
		//5.Choosing option using sendkey
		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		dropdown5.sendKeys("UFT/QT");
		
		//6.Choosing multiple options
		WebElement dropDown6 =  driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiSelect = new Select(dropDown6);
		multiSelect.selectByIndex(1);
		multiSelect.selectByIndex(2);
		multiSelect.selectByIndex(3);
	}

}
