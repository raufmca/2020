package com.testListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomeListners extends TestListenerAdapter{
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("---Skipped----> " + tr.getName());
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("-- Pass -- > " + tr.getName());
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("--- Failed --- > " +tr.getName() );
	}

}
