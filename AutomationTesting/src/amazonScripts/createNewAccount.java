package amazonScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class createNewAccount {
	// data member to store the user details from Excel file
	Object[][] data = null;
	
	// data provider method to read the user details from Excel file
	@DataProvider(name = "creationDetails")
	public Object[][] basicDetails() throws BiffException, IOException{
		
		data = getExcelFile();
		
		return data;
		
	}
	
	// method to read the user details from Excel file
	public Object[][] getExcelFile() throws BiffException, IOException{
		// open the Excel file
		FileInputStream excel = new FileInputStream("C:\\Users\\AjayC\\Desktop\\Automation codes\\Excelfiles\\createAccount.xls"); 
		// get the workbook and sheet
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		
		// get the number of rows and columns in the sheet
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		
		// create a 2D array to store the user details
		Object [][] testData= new Object[rowCount - 1][columnCount];
		
		// loop through the rows and columns to read the user details
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				
				testData[i - 1][j] = sheet.getCell(j, i).getContents();
				
			}
			
		}
		// close the workbook and return the user details
		workbook.close();
        excel.close();
		return testData;
		
	}
	
	 // test method to create a new account using the user details
	@Test(dataProvider = "creationDetails")
	public void searchBar(String uName, String mNumber, String pWord) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\AjayC\\Desktop\\Automation codes\\SeliniumTest\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
	// create a new instance of ChromeDriver
	WebDriver driver = new ChromeDriver();
	// navigate to Amazon website
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=17429149962795757676&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9298676&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=CjwKCAiA2rOeBhAsEiwA2Pl7QwCoO37Or23cJ6DlNjPYd3arBieIotPQ_lHUjH4mf8jyxm_nlC_XIBoCxocQAvD_BwE");
	
	 WebElement searchbar = driver.findElement(By.className("nav-line-1-container"));
	 searchbar.click();
	 
	 WebElement createAccount = driver.findElement(By.id("createAccountSubmit"));
	 createAccount.click();
	 
	 WebElement enterName = driver.findElement(By.id("ap_customer_name"));
	 enterName.sendKeys(uName);
	 
	 WebElement enterPhonenumber = driver.findElement(By.id("ap_phone_number"));
	 enterPhonenumber.sendKeys(mNumber);
	 
	 WebElement enterPassword = driver.findElement(By.id("ap_password"));
	 enterPassword.sendKeys(pWord);
	 
	 WebElement enterContinue = driver.findElement(By.id("auth-continue"));
	 enterContinue.click();
	 driver.quit();
	 
	 
	 // pushing after changes 
	 
	
	
	}
}
