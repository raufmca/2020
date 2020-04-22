package com.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicBrowsers {
	
	public static void main(String args[]) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-info-bars");
		WebDriver driver = new ChromeDriver(ops);
		
		driver.navigate().to("https:\\www.facebook.com");
		
		System.out.println("Tit;le of the page -> " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("raufmca09");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("$0nubaby");
		
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		System.out.println("Tit;le of the page -> " + driver.getTitle());
		
	//	Alert al = driver.switchTo().alert();
	//	al.accept();
		
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
	//	driver.findElement(By.xpath("//*[@id='js_53']/div/div/ul/li[11]/a/span/span")).click();
		
		driver.quit();
	}

}
