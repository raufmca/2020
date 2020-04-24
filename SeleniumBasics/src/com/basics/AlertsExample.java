package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println("Main page -> " + driver.getTitle());
		
		driver.findElement(By.name("login")).sendKeys("testtest2020");
		
		driver.findElement(By.name("proceed")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert al = driver.switchTo().alert();
		
		System.out.println("Text on alert -> " + al.getText());
		
		al.accept();
		
		driver.switchTo().defaultContent();
		
		System.out.println("Main page -> " + driver.getTitle());
		
		driver.quit();

	}

}
