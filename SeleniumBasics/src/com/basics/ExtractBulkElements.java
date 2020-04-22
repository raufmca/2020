package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtractBulkElements {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--diable-infobars");
		ops.addArguments("--disable-notifcations");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://edition.cnn.com/");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of elements found -> " + elements.size());
		
		for ( int i = 0; i < elements.size(); i++) {
			System.out.println(" -> " + elements.get(i).getText()+"---> "+ elements.get(i).isDisplayed()); 
		}
		
		driver.close();
		
		
	}

}
