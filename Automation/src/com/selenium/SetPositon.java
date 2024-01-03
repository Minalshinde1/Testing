package com.selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositon {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		Point p = new Point(200,400);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		Dimension d = new Dimension(300, 300);
		driver.manage().window().setSize(d);
	}

}
