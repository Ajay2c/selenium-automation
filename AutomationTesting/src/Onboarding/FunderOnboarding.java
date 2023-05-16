package Onboarding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import java.util.UUID;
import org.openqa.selenium.support.ui.Select;



public class FunderOnboarding {

	WebDriver driver = new ChromeDriver();
	//String uuid = UUID.randomUUID().toString();
	
	@Test(priority = 0)
	public void openChrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AjayChandru\\Desktop\\SeliniumTest\\chrome-driver\\chromedriver.exe");

		driver.navigate().to("https://platform-staging2.raisetech.io/auth/login");

	}

	@Test(priority = 1)
	public void loginUser() throws InterruptedException {

		WebElement userEmail = driver.findElement(By.id("auth_login_email"));
		userEmail.sendKeys("staging2.raise.testing+OA1@gmail.com");

		WebElement userPassword = driver.findElement(By.id("auth_login_password"));
		userPassword.sendKeys("Platform.1");

		WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/div/div/form/button/span"));
		clickLogin.click();

		Thread.sleep(8000);

	}

	@Test(priority = 2)
	public void clickTransaction() throws InterruptedException {

		WebElement selectSlideBar = driver.findElement(
				By.xpath("//*[@id=\'Entities\']/button"));
		selectSlideBar.click();
			
	}
	@Test(priority = 3)
	public void clickFunder() throws InterruptedException{
		
		  //Thread.sleep(2000);
		  
		  WebElement selectFunder =driver.findElement(
				  By.linkText("Funders"));
		  selectFunder.click();
		  
		  Thread.sleep(5000);
		  
	
	}
	@Test(priority = 4)
	public void createFunder() {
		
		WebElement createFun = driver.findElement(
				By.xpath(
				"//*[@id=\'__next\']/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/header/div/div[2]/div[2]/button[3]"));
		createFun.click();
		
	}
	
	@Test(dependsOnMethods = "createFunder")
	public void enterFunderName() {
		
		WebElement enterCompanyName = driver.findElement(
				By.id("company.name"));
		enterCompanyName.sendKeys("Automation test");
		
	}
	@Test(dependsOnMethods = "enterFunderName")
	public void enterCompanyRegNumber() {
		WebElement enterComRegnumber = driver.findElement(
				By.id("company.brn"));
		enterComRegnumber.sendKeys("TEST334455"); 
		
	}
	
	//Selecting Country 
	/*
	@Test(dependsOnMethods = "enterCompanyRegNumber")
	public void selectCountry() {
		WebElement selectCon = driver.findElement(By.xpath("//*[@id=\'company.country_id\']/div/div[1]/div[2]"));
		selectCon.click();
		Select boxOne = new Select(selectCon);
		boxOne.selectByVisibleText("India");
	}
	*/

	@Test(dependsOnMethods = "enterCompanyRegNumber")
	public void enterTaxRegNumber() {
		WebElement TaxRegNumber = driver.findElement(
				By.id("company.vat_registration_no"));
		TaxRegNumber.sendKeys("TAX12345");
	}
	
	@Test(dependsOnMethods = "enterTaxRegNumber")
	public void enterEmailAddress() {
		WebElement EmailAddress = driver.findElement(
				By.id("company.office_email"));
		EmailAddress.sendKeys("automationtest1223@gmail.com");
	}
	
	@Test(dependsOnMethods = "enterEmailAddress")
	public void enterPhoneNumber() {
		WebElement PhoneNumber = driver.findElement(
				By.className("form-control "));
		PhoneNumber.sendKeys("9988998898");
	}
	
	@Test(dependsOnMethods = "enterPhoneNumber")
	public void enterIncorporatedDate() {
		WebElement IncorporatedDate = driver.findElement(
				By.id("company.incorporated_date"));
		IncorporatedDate.sendKeys("20/12/2000");
	}
	
	@Test(dependsOnMethods = "enterIncorporatedDate")
	public void enterTradingCommencedDate() {
		WebElement TradingCommencedDate = driver.findElement(
				By.id("company.trading_commenced_date"));
		TradingCommencedDate.sendKeys("20/12/2000");
	}
	
	@Test(dependsOnMethods = "enterTradingCommencedDate")
	public void enterURL() {
		WebElement WebsiteURL = driver.findElement(
				By.id("company.website_url"));
		WebsiteURL.sendKeys("www.google.co");
	}
	
	
	
	
}
