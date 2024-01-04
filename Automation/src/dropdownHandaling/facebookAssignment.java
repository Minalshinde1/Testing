package dropdownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("prachi");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("baravkar");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9876543212");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Prachi@9687");
		
		 WebElement d = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		 Select s = new Select(d);
		 
		 
		 s.selectByValue("18");
		 
		 WebElement m = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select s1 = new Select(m);
		 s1.selectByVisibleText("Mar");
		 
		 WebElement y = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select s2 = new Select(y);
		 s2.selectByValue("2000");
		 
		 driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		 
		 driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		 
		 
		 
		 
		
	}
}
