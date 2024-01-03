package searchContaxtInterface;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone",Keys.ENTER);
		
		
		 List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			
			
		List<WebElement> allprice =driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 
		for(int i=0;i<allIphone.size();i++)
		{
			 WebElement iphone=allIphone.get(i);
			 WebElement allprices=allprice.get(i);
			 
			System.out.println(iphone.getText()+allprices.getText());	
			
		 
	 }
		driver.close();
		 
		 
	}

}
