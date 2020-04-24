package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtons {

	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-infobars");
		ops.addArguments("--disable-notifications");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "C:\\Testing\\Logs.log");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
		
		List<WebElement> radiobtn = driver.findElements(By.name("citizenship"));
		
		radiobtn.get(0).click();
		
		System.out.println("Selected radio Button -> " + radiobtn.get(0).getAttribute("selected"));
		
	//	System.out.println(radiobtn.get(0).getText());

		driver.quit();
	}

}
