package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationFromBack {

	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-infobars");
		ops.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.navigate().to("https://edition.cnn.com/");
		
		String part1 = "//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String part2 = "]/article/div/div/h3/a/span[1]";
		
			
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li"));
		
		System.out.println("Number of Elements -> " + elements.size());
		
		for( int i =1 ; i < elements.size(); i++) {
			String txt = driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(txt);
			driver.findElement(By.xpath(part1+i+part2)).click();
			System.out.println("---> " + driver.getTitle());
			System.out.println("------------------------------------------");
			driver.navigate().back();
		}
		
		driver.quit();

	}

}
