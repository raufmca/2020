package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenNewTab {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		
		ops.addArguments("--disable-infobars");
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "C:\\Testing\\logs.log");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https:\\www.google.com");
		
		String newTab = Keys.chord(Keys.CONTROL,"t");
		
		String txt = driver.findElement(By.xpath("//body[@class='hp vasq big']")).getAttribute("class");
		
		System.out.println("----" + txt);
		
		String txt1 = driver.findElement(By.tagName("body")).getTagName();
	
		System.out.println("----"+txt1);
		
		System.out.println("Done");

	}

}
