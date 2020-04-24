package com.basics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-infobars");
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximize");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "c:\\Testing\\Log.log");
		
		driver = new ChromeDriver(ops);
		
		driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
		
		takeScreent();
	

	}
	
	public static void takeScreent() {
	
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"radio.jpg"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
