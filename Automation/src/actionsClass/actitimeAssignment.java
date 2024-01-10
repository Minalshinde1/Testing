package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import searchContaxtInterface.findElement;

public class actitimeAssignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		driver.get("http://pn/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		
		driver.findElement(By.name("username")).sendKeys("minal shinde");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("minal@123");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("minal@123");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='active']"));
		Select sc = new Select(dropdown1);
		sc.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("minal");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("shinde");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("min");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("minalshinde123@gmail.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543223");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8765435690");
		WebElement dropdown2 = driver.findElement(By.id("timeZoneName"));
		Select s = new Select(dropdown2);
		s.selectByIndex(3);
		
		driver.findElement(By.id("overtimeTracking_Enable")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
