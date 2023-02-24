package testNG;

import org.testng.annotations.Test;

public class DependencyManagement {

	@Test(enabled=false)
	public void kinderGarden() {
		System.out.println("Kinder Garden");
	}
	
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("Engineering");
	}
	
	
	
	
}
