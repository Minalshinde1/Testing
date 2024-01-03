package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		 
		driver.navigate().to("https://www.swiggy.com/");
		
		Thread.sleep(2000);
		
		 String title1 = getTitle();
		 System.out.println(title1);
		 
		
		//to back
		driver.navigate().back();
		Thread.sleep(2000);
		 //to forword
		driver.navigate().forward();
		Thread.sleep(2000);
		//to refresh
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

	private static String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
