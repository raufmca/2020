package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		
		//driver.findElement(By.xpath("//*[@id='g-mainbar']/div[1]/div/div/div/div/div/div[2]/p[12]/a")).click();
		
		System.out.println("Table page -> " + driver.getTitle());
		
		List<WebElement> names = driver.findElements(By.cssSelector(".dataTable>tbody>tr>td:nth-child(1)"));
		List<WebElement> currentPrice = driver.findElements(By.cssSelector(".dataTable>tbody>tr>td:nth-child(4)"));
		
		System.out.println("Number of elemensts -> " + names.size());
		System.out.println("Number of currentPrices -> " + currentPrice.size());
		
		for(int i=0; i < names.size(); i++)
			System.out.println(names.get(i).getText()+" ------ " + currentPrice.get(i).getText());
		
		
		driver.quit();
		
		

	}

}
