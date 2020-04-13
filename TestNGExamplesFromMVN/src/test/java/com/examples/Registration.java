package com.examples;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Registration {
	
	SoftAssert sf = new SoftAssert();

	
	@AfterSuite
	public void afterS() {
		System.out.println("After Suite in Registration ");
		System.out.println();
		sf.assertAll();
	}
	
	@BeforeSuite
	public void beforeS() {
		System.out.println("Before Suite in Registration ");
	}
	
	@Test(priority = 1)
	public void signUp() {
		System.out.println("Test annotation in signUp ()");
		System.out.println("First Line");
		sf.assertEquals("Alhaam", "Aqdas");
		System.out.println("Second Line");
	}
	
	@Test(priority = 2)
	public void register() {
		System.out.println("Test annotation in register ()");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before group ");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("After groups ");
	}
}
