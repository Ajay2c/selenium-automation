package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {


	@Test(priority = 0) //it will help order of execution
	public void startTheCar() {
		System.out.println("Start the Car");
	}
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority = 2, enabled = false) // by using boolean value we skip this test case
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority = 4)
	public void pressBreak() {
		System.out.println("Break");
	}
}

