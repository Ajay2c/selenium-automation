package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	/* 
	 - Scenarious: A big basket is having a different kind of mobiles.
	 Let us say there are apple phones, Moto , Vivo and lenavo
	 I want to run tests only for Vivo and Moto phones. Write a program for that.
	 */
	
	@Test(groups="apple")
	public void apple1() {
		System.out.println("Apple One Runned");
	}
	@Test(groups="apple")
	public void apple2() {
		System.out.println("Apple Two Runned");
	}
	@Test(groups="lenavo")
	public void Lenavo1() {
		System.out.println("Lenavo One Runned");
	}
	@Test(groups="lenavo")
	public void Lenavo2() {
		System.out.println("Lenavo Two Runned");
	}
	@Test(groups="moto")
	public void moto1() {
		System.out.println("Moto One Runned");
	}
	@Test(groups="moto")
	public void moto2() {
		System.out.println("Moto Two Runned");
	}
	@Test(groups="vivo")
	public void vivo1() {
		System.out.println("Vivo One Runned");
	}
	
	@Test(groups="vivo")
	public void vivo2() {
		System.out.println("Vivo Two Runned");
	}
	
}
