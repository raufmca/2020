package com.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManagement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https:\\www.facebook.com");
	//	driver.findElement(By.name("q")).sendKeys("Software Testing");
		
		Set<Cookie> cookie = driver.manage().getCookies();
		
		Iterator<Cookie> c = cookie.iterator();
		
		while (c.hasNext()) {
			Cookie cookie2 = (Cookie) c.next();
			System.out.println(cookie2.getName() + " ------ " + cookie2.getValue());
		}
		
		driver.quit();

	}

}
