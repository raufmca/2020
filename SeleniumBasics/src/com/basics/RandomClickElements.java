package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class RandomClickElements {

	public static void main(String[] args) {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "c:\\testing\\logs.logs");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.americangolf.co.uk/");
		
		WebElement mainElement = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mainElement).build().perform();
		
		WebElement box = driver.findElement(By.id("CLUBS_1"));
		
		List<WebElement> links = box.findElements(By.tagName("a"));
		
		System.out.println("Number of links -> " + links.size());
		
		driver.quit();
	}

}
