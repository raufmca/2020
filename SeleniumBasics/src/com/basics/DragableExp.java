package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragableExp {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--disable-infobars");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "C:\\testing\\logs.log");

		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://jqueryui.com/draggable/");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total frames -> " + size);
		
		System.out.println("Title of the page -> " + driver.getTitle());
		
		driver.switchTo().frame(0);
		
		System.out.println("Title of the page -> " + driver.getTitle());
		
		
		WebElement ele = driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(ele, 100, 150).build().perform();
		
		driver.switchTo().defaultContent();
		
		System.out.println("Title of the page -> " + driver.getTitle());
		
		driver.quit();
		
		
		

	}

}
