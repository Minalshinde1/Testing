package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=a.next();
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver = new EdgeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		else
		{
			System.out.println("noting");
			
		}

	}

}
