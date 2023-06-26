package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class removePIM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayC\\Desktop\\GIT\\selenium-automation\\AutomationTesting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.name("username"));
		email.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		Thread.sleep(3000);
		
		
		
		// select the PIM in navigation bar
		WebElement linkPIM = driver.findElement(By.linkText("PIM"));
		linkPIM.click();
		Thread.sleep(2000);
		
		
		// find the existing added data 

		String Emp_name = "Ajay";
		String Emp_ID = "112233";
		
		
		WebElement EmpName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		EmpName.sendKeys(Emp_name);
		
		WebElement EmpID = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
		EmpID.sendKeys(Emp_ID);
		
		String table_xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div";
		
		Thread.sleep(2000);
		// Search 
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		Search.click();
		
		
		Thread.sleep(4000);
		List<WebElement> list_name = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]"));
		
		System.out.print(list_name);
		
		
		
		
		
	}

}
