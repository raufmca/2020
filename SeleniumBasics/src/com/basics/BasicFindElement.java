package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicFindElement {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("raufmca09@rediffemail.com");
		
		String txt = driver.findElement(By.cssSelector("#login1")).getAttribute("value");
		
		System.out.println("Attribute Value = > " + txt);
		
		driver.quit();
		
		

	}

}
