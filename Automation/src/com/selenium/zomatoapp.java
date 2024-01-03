package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomatoapp {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
	  String title = driver.getTitle();
	  System.out.println("title of the current page :"+ title);
	  
	   String url= driver.getCurrentUrl();
	   System.out.println("the current url:"+url);
	   
	 
	   
	   
	   driver.close();
	  
	}
}
