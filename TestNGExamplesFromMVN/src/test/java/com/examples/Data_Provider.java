package com.examples;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	
	@DataProvider(name="userDetails")
	public static Object[][] getUserDetails(){
		Object[][] obj = new Object[3][3];
	
		obj[0][0] = "Alhaam";
		obj[0][1] = 5;
		obj[0][2] = 18;
		
		obj[1][0] = "Aqdas";
		obj[1][1] = 11;
		obj[1][2] = 8;
		
		obj[2][0] = "Shamsunnisa";
		obj[2][1] = 32;
		obj[2][2] = 62;
		
		return obj;
		
	}
	
	
}
