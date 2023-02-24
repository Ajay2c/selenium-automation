package Onboarding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testSample {

	WebDriver driver = new ChromeDriver();

	@Test(priority = 0)
	public void openChrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AjayChandru\\Desktop\\SeliniumTest\\chrome-driver\\chromedriver.exe");

		driver.navigate().to("https://platform-staging2.raisetech.io/auth/login");

	}

	@Test(priority = 1)
	public void loginUser() throws InterruptedException {

		WebElement userEmail = driver.findElement(By.id("auth_login_email"));
		userEmail.sendKeys("staging2.nfm+OA1@gmail.com");

		WebElement userPassword = driver.findElement(By.id("auth_login_password"));
		userPassword.sendKeys("Platform.1");

		WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/div/div/form/button/span"));
		clickLogin.click();

		
		Thread.sleep(3000);

	}
	
	@Test(priority = 2)
	public void urlFunderList() throws InterruptedException{

		driver.navigate().to("https://platform-staging2.raisetech.io/fundo/funder/list");	
		Thread.sleep(6000);
	}
	
	@Test(priority = 3)
	public void createFunder(){

		WebElement createFun = driver.findElement(By.xpath("//*[@id=\'__next\']/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/header/div/div[2]/div[2]/button[3]"));
		System.out.println(createFun);						
		createFun.click();
		
	}

}
