package webTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		
		//1.Click the Alert Box display alert
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Thread.sleep(3000);
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();
		
		//2.Click the Conform Box to accept the display alert
		
		WebElement ConfirmBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmBox.click();
		Thread.sleep(3000);
		Alert acceptAlert = driver.switchTo().alert();
		acceptAlert.accept();
		
		//3.Click the Conform box to dismiss
		
		WebElement ConfirmBox2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmBox2.click();
		Thread.sleep(3000);
		Alert dismissAlert = driver.switchTo().alert();
		dismissAlert.dismiss();
		
		//4.Send the Text for the Alert Prompet
		
		WebElement Prompetbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		Prompetbox.click();
		Alert prompet = driver.switchTo().alert();
		Thread.sleep(3000);
		prompet.sendKeys("RaiseTech");
		prompet.accept();
		
		
		
		
		
		

	}

}
