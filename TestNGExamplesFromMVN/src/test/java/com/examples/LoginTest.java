package com.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProvider = "getData")
	public void testDifferent(String name, int age, char m, int sal) {
		
		System.out.println("Name -> "+name+" Age -> "+age+" Sex -> "+m+" Salary -> "+sal);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] obj = new Object[3][4];
		
		// Row 1
		obj[0][0] = "Alhaam";
		obj[0][1] = 5;
		obj[0][2] = 'F';
		obj[0][3] = 345069;
		
		// Row 2
		obj[1][0] = "Aqdas";
		obj[1][1] = 1;
		obj[1][2] = 'F';
		obj[1][3] = 3069;
		
		// Row 3
		obj[2][0] = "Rounk";
		obj[2][1] = 2;
		obj[2][2] = 'M';
		obj[2][3] = 35069;
		
		return obj;
	}

}
