package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testFile {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjayC\\Desktop\\GIT\\selenium-automation\\AutomationTesting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Scenario- To login to a page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		email.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		// sleep for 3 seconds (implicit & explicit wait)
		Thread.sleep(3000);
		
		/*
		// Scenario- To compare actual and expected
		
		WebElement actualmsg = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']/a"));
		String actual=actualmsg.getText();
		System.out.println("Actual message:"+actual);
		
		String expected="Forgot your password?";
		
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		*/
		
		/*
		// Scenario-Actions- To perform various actions on elements
		WebElement perf = driver.findElement(By.xpath("//a[@id='menu__Performance']/b"));
		
		Actions act=new Actions(driver);
		act.moveToElement(perf).click().perform();
		
		WebElement empTrack = driver.findElement(By.xpath("//a[@id='menu_performance_viewEmployeePerformanceTrackerList']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(empTrack).click().perform();
		*/
		
		
		// Scenario-Select- Selecting from a drop down menu
		WebElement admin = driver.findElement(By.linkText("Admin"));
		admin.click();
		
		
		
		
		System.out.println("Clicked on Admin menu ");
	    Thread.sleep(5000);

	    //job title selection
	    Actions action = new Actions (driver);
	    WebElement sAdminMenuJob = driver.findElement(By.xpath("//span[normalize-space()='Job']"));
	    action.moveToElement(sAdminMenuJob).build().perform();
	    Thread.sleep(5000);

	    WebElement sAdminMenuJobTitle = driver.findElement(By.xpath("(//a[normalize-space()='Job Titles'])[1]"));
	    action.moveToElement(sAdminMenuJobTitle).click().build().perform();
	    Thread.sleep(5000);
	    
		driver.close();
	}

}
