package advancedSelenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toyWithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AjayChandru\\\\Desktop\\\\SeliniumTest\\\\chrome-driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/WebTable/");
		
		
		//1.Count the table Columns
		
		List<WebElement> countColumn = driver.findElements(By.tagName("th"));
		int totalColumn = countColumn.size();
		System.out.println("The total number of Column is:" + totalColumn);

		
		//2.Count the table Rows
		List<WebElement> countRows = driver.findElements(By.tagName("tr"));
		int totalRows = countRows.size();
		System.out.println("The total number of Rows is:" + totalRows);
		
		//3. Getting the name in table
		
		WebElement gettingName = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[1]"));
		String name = gettingName.getText();
		System.out.println("The name: "+name);
		
		//4. Getting age with help of name(Left to right)
		WebElement gettingAge = driver.findElement(
				By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[1]/following::td[2]"));
		String age = gettingAge.getText();
		System.out.println("The Age of "+ name + "is:" + age);
		
		//5.Getting all the age in List of array
		
		List<WebElement> totalAges = driver.findElements(By.xpath("//td[3]")); // all the ages are in toatlAges field, so we going to use ForEach
		
		List<Integer> numberList = new ArrayList<Integer>();// step-1 we need to add all the each age taken by loop as list of array
		
		for (WebElement pickingEachAge : totalAges) {
			
			String individualValues = pickingEachAge.getText();
			
			numberList.add(Integer.parseInt(individualValues)); // step-2 for that need to change String --> Int and with help of this we are adding in Array
			
			
		}
		
		
		System.out.println("Final List:" + numberList);
		
		// we are going to take small value in the List of array
		
		int smallValue = Collections.min(numberList);
		System.out.println("The small value on this is: " + smallValue);
		
		
		String convertString = Integer.toString(smallValue);
		System.out.println(convertString);
		
		
		////html/body/div[1]/table/tbody/tr["+ convertString +"]/td[3]/following::td[3]
		
		String finalXpath = "/html/body/div[1]/table/tbody/tr["+ convertString +"]/td[3]/following::td[3]";
		System.out.println(finalXpath);
		
		
		WebElement check= driver.findElement(By.xpath(finalXpath));
		System.out.println(check);

	}

}
