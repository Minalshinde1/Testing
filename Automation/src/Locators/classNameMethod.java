package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
	
		driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}