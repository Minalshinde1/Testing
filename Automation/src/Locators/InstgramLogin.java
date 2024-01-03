package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstgramLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("prachibarvkar9687@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Prachi9687");
		
		driver.findElement(By.className("_acap")).click();
		   
		
		String title =driver.getTitle();
		
		System.out.println("title of current web page"+title);
		
		
	}

	
	}

	
	

	
	


