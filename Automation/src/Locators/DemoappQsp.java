package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappQsp {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		String title = driver.getTitle();
		System.out.println("title of web page"+title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("url of current web page : "+url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("prachibarvkar");
		
		driver.findElement(By.id("email")).sendKeys("prachibaravkar9687@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Prachi@2000");
		Thread.sleep(2000);
		
	    driver.quit();
	    
		
		
		
		
	}

}
