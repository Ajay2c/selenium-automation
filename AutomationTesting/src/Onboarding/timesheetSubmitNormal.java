package Onboarding;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class timesheetSubmitNormal {

WebDriver driver = new ChromeDriver();
//String uuid = UUID.randomUUID().toString();

@Test(priority = 0)
public void openChrome() {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AjayChandru\\Desktop\\All Files\\SeliniumTest\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");

	driver.navigate().to("https://platform-beta.raisetech.io//auth/login");

}

@Test(priority = 1)
public void loginUser() throws InterruptedException {

	WebElement userEmail = driver.findElement(By.id("auth_login_email"));
	userEmail.sendKeys("migration.testing2022+paymentassistant1@gmail.com");

	WebElement userPassword = driver.findElement(By.id("auth_login_password"));
	userPassword.sendKeys("Platform.1");

	WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/div/div/form/button/span"));
	clickLogin.click();

	Thread.sleep(8000);
	
}


@Test(priority = 2)
public void clickTransaction() throws InterruptedException{
	  
	  WebElement selectTransaction =driver.findElement(
			  By.id("Transactions"));
	  selectTransaction.click();
	  
}

@Test(priority = 3)
public void clickTimesheet() throws InterruptedException{

	  
	  WebElement selectTimesheet =driver.findElement(
			  By.id("Timesheets"));
	  selectTimesheet.click();
	  
	  Thread.sleep(5000);
	 
}

@Test(priority = 4)
public void clickDraftStatus() {
	
	WebElement selectDraft = driver.findElement(By.id("react-select-5-placeholder"));
	selectDraft.click();
	
	//driver.close();
}


}

