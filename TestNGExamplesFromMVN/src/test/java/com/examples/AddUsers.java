package com.examples;

import org.testng.annotations.Test;

public class AddUsers {
	
	@Test(dataProviderClass = Data_Provider.class, dataProvider = "userDetails")
	public void addUserDetails(String name, int age, int wt) {
		
	}
	
	@Test
	public void addPersonalDetails() {
		
	}

}
