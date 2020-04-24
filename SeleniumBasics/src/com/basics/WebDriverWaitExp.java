package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExp {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--diable-notificaitons");
		ops.addArguments("--disable-infobars");
		ops.addArguments("--start-maximized");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "C:\\testing\\logs.log");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("testtest2020");
		driver.findElement(By.id("password")).sendKeys("System@2020");
		//driver.findElement(By.xpath("//*[@id='remember']")).clear();
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
	
		WebElement ele = driver.findElement(By.name("remember"));
		
		wait.until(ExpectedConditions.visibilityOf(ele)); 
		
		ele.click();
		System.out.println("checked value -> "+ ele.getAttribute("checked"));
		System.out.println("value attribute -> " + ele.getAttribute("value"));
		driver.quit();
		

	}

}
