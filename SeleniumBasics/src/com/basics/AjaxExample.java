package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxExample {

	public static void main(String[] args) {
		
		//*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/ul
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("Software Testing");
		
		List<WebElement> lst = driver.findElements(By.xpath("//*[@class='erkvQe']/li"));
		
		System.out.println("Size of Ajax -> " + lst.size());
		
		for(int i=0; i<lst.size();i++) {
			System.out.println("---> " + lst.get(i).getText());
		}
	}

}
