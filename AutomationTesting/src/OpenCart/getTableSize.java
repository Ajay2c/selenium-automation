package OpenCart;

import java.util.ArrayList;
import java.util.Collections;
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
		System.out.print("Total number of rows" + total_row + "");
		
		List<WebElement> table_row_data = driver.findElements(By.tagName("td"));
		int total_data = table_row_data.size();
		System.out.print("Total number of data " + total_data + "");
		
		
		// select the checkbox in the categories table by using customize xpath
		
		WebElement check_Camera = driver.findElement(By.xpath("//td[normalize-space()='Cameras']//preceding-sibling::td"));
		Boolean verify_check = check_Camera.isSelected();
		if(verify_check) {
			System.out.print("the check box is already selected");
			
		}else {
			check_Camera.click();
		}
		
		// select the least value in the dyanamic table 
		
		// 1. getting all the number as string 
		List<WebElement> string_number = driver.findElements(By.xpath("//*[@id=\"form-category\"]/div[1]/table/tbody/tr//td[3]"));
		
		List<Integer> integer_number = new ArrayList<Integer>();
		// 2. need to convert each item in the string list
		for(WebElement loop_number : string_number) {
			
			// 3.getting the looped digit and convert it as integer 
			String individual_number = loop_number.getText();
			integer_number.add(Integer.parseInt(individual_number)); // 4.after convert, stored in 'integer_number'
		}
		// 5. printing the integer in the array list
		System.out.print(integer_number);
		
		
		int smallest_value = Collections.min(integer_number);
		
		WebElement selecthe_smallvalue_check = driver.findElement(By.xpath("//td[normalize-space()='"+smallest_value+"']//preceding-sibling::td[2]"));
		boolean final_check = selecthe_smallvalue_check.isSelected();
		if(!final_check) {
			System.out.print("the least value checkbox is already selected");
		}else {
			selecthe_smallvalue_check.click();
		}
	}

}
