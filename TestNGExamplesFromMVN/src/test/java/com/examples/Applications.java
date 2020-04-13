package com.examples;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Applications {
	
	@Test
	public void doLogin() {
		System.out.println("Inside Test Annotation doLogin");
	}
	
	@Test
	public void doPasswordChange() {
		System.out.println("Inside Test Annotation doPassword");
		String actual = "Alhaam";
		String expected = "Alhaam1";
		Assert.assertEquals(actual, expected, "Passed");
		System.out.println("Next line");
	}
	
	@Test
	public void doLogout() {
		System.out.println("Inside The Test Annotation doLogout() ");
		Assert.assertTrue(15 > 2 , "Error Message");
		System.out.println("Next statement ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("--Before Method --");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("-- After Method --");
		System.out.println();
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@@@@@@@ Before Suite @@@@@@");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@@@@@@@ After Suite @@@@@");
	}

}
