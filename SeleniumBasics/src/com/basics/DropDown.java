package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-infobars");
		ops.addArguments("--disable-notifications");
		
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, null);
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.qtpselenium.com/contact-us");
		
		///html/body/div[6]/div/div/div[1]/div[2]/div/form/div[4]/select
		//body > div.container > div > div > div.col-md-8.col-sm-6.col-xs-12 > div.side8 > div > form > div:nth-child(4) > select

		WebElement ele = driver.findElement(By.xpath("//select[@name='country_id']"));
		
		Select dd = new Select(ele);
		
//		dd.selectByIndex(10);  // selects by index
		
		dd.selectByValue("15");   // select by value which selects as per the value 

//		dd.selectByVisibleText("Finland"); // this options selects the value which visible in dropdown affter selecting 
	
		
		// to print all the options available in dropdown 
		
		List<WebElement> options = dd.getOptions();
		
		for ( int i =0; i < options.size(); i++ ) {
			System.out.println("--> " + options.get(i).getText());
		}
		
		System.out.println("Option which is selected -> " + dd.getFirstSelectedOption().getText());
		
		driver.quit();
	
		
	}

}
