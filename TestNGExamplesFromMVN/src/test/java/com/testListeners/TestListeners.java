package com.testListeners;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestListeners {
	
	SoftAssert sf = new SoftAssert();
	
	@Test
	public void testLogin() {
		System.out.println("Inside Test Login");
		
		try {
			Assert.assertEquals("Alhaam", "Aqdas");
		}catch(Exception e) {
			System.out.println("Error -> "+ e.getMessage());
		}
		System.out.println("Test Login Ends");
	}
	
	@Test(groups = {"logout"})
	public void testLogout() {
		System.out.println("Inside Test Logout");
	}
	
	@Test(priority = 1, groups = {"verify"})
	public void testCheck() {
		System.out.println("Line 1");
	//	Assert.assertEquals(true, false);
		System.out.println("Line 2");
	}
	
	@Test(priority = 1, groups = {"verify"})
	public void testVerify() {
		
		System.out.println("First");
		sf.assertEquals("Alhaam", "Aqdas");
		System.out.println("Second");
		sf.assertAll();
	}

	
}
