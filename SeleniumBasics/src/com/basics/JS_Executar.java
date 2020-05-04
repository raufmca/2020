package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executar {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://stackoverflow.com/questions/15995124/getelementbyname-returns-type-error'");
		
		// to find whether page is loaded successful 
		
		String state = (String)js.executeScript("return document.readyState");
		
		
		System.out.println(" State of the page -> "+ state);
		
	//	js.executeScript("document.getElementsByName('q').value='Software Testing';");
	//	System.out.println("---");
		
		js.executeScript("window.scrollTo(0,250)");
		
		driver.quit();
		
	}

}
