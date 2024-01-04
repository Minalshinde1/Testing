package Locators;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cSS {
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.className("username")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.className("password")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.className("oxd-button")).click();

}
}
