package OpenCart;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTableSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayC\\Desktop\\GIT\\selenium-automation\\AutomationTesting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");
		
		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("input-username"));
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("demo");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement close_alert = driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button"));
		close_alert.click();
		
		Thread.sleep(3000);
		
		WebElement catalog_link = driver.findElement(By.linkText("Catalog"));
		catalog_link.click();
		
		WebElement categories_link = driver.findElement(By.linkText("Categories"));
		categories_link.click();
		
		
		
		// need to get the table row data, for this need to use tagname
		
		List<WebElement> table_row = driver.findElements(By.tagName("tr"));
		int total_row = table_row.size();
		System.out.print("Total number of rows" + total_row);
		
		List<WebElement> table_row_data = driver.findElements(By.tagName("td"));
		int total_data = table_row_data.size();
		System.out.print("Total number of data " + total_data);
		
		
		
	}

}
