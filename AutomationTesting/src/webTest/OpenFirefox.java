package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AjayChandru\\Desktop\\SeliniumTest\\FireFox_Driver\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	    capabilities.setCapability("marionette",true);  
	    WebDriver driver= new FirefoxDriver(capabilities);  
	          
	         // Launch Website  
	    driver.navigate().to("http://www.javatpoint.com/");  
	          
	        // Click on the Custom Search text box and send value  
	    driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
	          
	        // Click on the Search button  
	driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();   

	}

}
