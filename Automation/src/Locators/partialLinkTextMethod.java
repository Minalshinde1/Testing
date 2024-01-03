package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkTextMethod {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Reg")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
