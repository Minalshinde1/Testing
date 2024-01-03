package Locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Minal ");
		
		driver.findElement(By.id("LastName")).sendKeys("shinde");
		
		driver.findElement(By.id("Email")).sendKeys("minal@123gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Minal@123");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Minal@123");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		

		
		
	}
}
