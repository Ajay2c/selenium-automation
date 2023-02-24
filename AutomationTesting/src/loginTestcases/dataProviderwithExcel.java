package loginTestcases;

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

public class dataProviderwithExcel {

	String[][] data = null;

	@DataProvider(name = "loginDatas")
	public String[][] loginDataProvider() throws BiffException, IOException {
		
		data = getExcelFile();

		return data;
	}

	// Start -->
	public String[][] getExcelFile() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\AjayChandru\\Desktop\\All Files\\Testdata.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);

		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		// <-- End "Only we select the File

		// Start --> now we selecting each data by using foreach loop
		String [][] testData = new String[rowCount - 1][columnCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {

				testData[i - 1][j] = sheet.getCell(j, i).getContents();

			}

		}

		return testData;
	}

	@Test(dataProvider = "loginDatas")
	public void bothCorrect(String uName, String pword) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AjayChandru\\Desktop\\All Files\\SeliniumTest\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ajaychandru-osondemand.orangehrm.com/symfony/web/index.php/auth/login");

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);

		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		driver.quit();
	}
}
