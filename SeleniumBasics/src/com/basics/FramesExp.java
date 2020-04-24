package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://paytm.com/");
		
		//    //*[@id="app"]/div/div[2]/div[2]/div[3]/div[4]/div
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[4]/div")).click();
		
		//   //*[@id="wallet-container-new qr-bg-white"]/qr-code-login/div[2]/div[1]/qrcode/canvas
		
		int tot = driver.findElements(By.tagName("iframe")).size();

		System.out.println("Number of frames -> " + tot);
		
		driver.switchTo().frame(0);
		
		
		
		//*[@id='wallet-container-new qr-bg-white']/qr-code-login/div[2]/div[2]/div[2]/a
		
		driver.findElement(By.linkText("Learn More")).click();
		
		System.out.println("Title of the learn more page -> " + driver.getTitle());
		
		driver.quit();

	}

}
