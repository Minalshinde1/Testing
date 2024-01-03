package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newPopupWindow {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		driver.findElement(By.xpath("//a[text()='Open a popup window])")).click();
		
		driver.close();
	}

}
