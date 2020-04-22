package com.basics;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpeningBrowser {

	public static void main(String[] args) {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"null");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--disable-logging");
		ops.addArguments("incognito");
		ops.addArguments("disable-infobars");
		ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
		ChromeDriver cd = new ChromeDriver(ops);
		cd.navigate().to("https://www.google.com");
		
		cd.quit();
		/*
		System.setProperty("webdriver.ie.driver", "C:\\Testing\\Softwares\\chromedriver_win32\\IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		ie.quit();
		*/
	}

}
