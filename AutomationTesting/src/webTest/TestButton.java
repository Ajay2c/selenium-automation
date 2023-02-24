package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AjayChandru\\Desktop\\SeliniumTest\\chrome-driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		//1. Getting XY position
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point xyposition = getPositionButton.getLocation();
		int xValue = xyposition.getX();
		int yValue = xyposition.getY();
		System.out.println("X Value is: "+xValue+"Y Value is: "+yValue );
		
		//2. Finding the button color
		WebElement findColor = driver.findElement(By.id("color"));
		String color = findColor.getCssValue("background-color");
		System.out.println("The button color is: " + color);
		
		//3.Finding Size of button
		WebElement findSize = driver.findElement(By.id("size"));
		int height = findSize.getSize().getHeight();
		int width = findSize.getSize().getWidth();
		System.out.println("The Height of the button is: "+height );

		System.out.println("The Width of the button is: "+ width);

	}

}
