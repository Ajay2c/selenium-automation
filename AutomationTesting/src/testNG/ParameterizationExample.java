package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	@Test
	@Parameters("Name")
	public void Printname(String name) {
		
		System.out.println("The animal is:" + name);
	}
	
}
