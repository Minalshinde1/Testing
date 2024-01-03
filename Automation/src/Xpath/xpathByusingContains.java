package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByusingContains {
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("Flowers",Keys.ENTER);
			
			WebElement iphonePrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@f='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
			
			System.out.println(iphonePrice.getText());
	}

}
