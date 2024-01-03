package searchContaxtInterface;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearOnActitime {
	public static void main(String[] args) throws InterruptedException {
		
		
		Random r = new Random();
		 int no=r.nextInt(5000);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://pn/login.do");
		
		 String title =driver.getTitle();
		 System.out.println(title);
		 
		 
		  String url=driver.getCurrentUrl();
		  System.out.println(url);
		  
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		//by using " x-path by contains attribute"
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Micrsoft"+no);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Actitime user");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		
		  String title2=driver.getTitle();
		  System.out.println(title2);
		  
		  String url2= driver.getCurrentUrl();
		  System.out.println(url2);
		
		driver.quit();
		
		
		
		
		
		  
		
		
	}

}
