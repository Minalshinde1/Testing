package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class airVistara {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en/plantravel/flight-booking");
		
		driver.findElement(By.xpath("//input[@ class='scombobox-display wcag-form-field ui-autocomplete-input']")).sendKeys("pune");
		
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("himalaya");
		
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		//driver.findElement(By.xpath("//button[text()='Depart Date']")).click();
		
		driver.findElement(By.xpath("//a[text()='26']")).click();
		
		//driver.findElement(By.xpath("//input[@id='returnCalendar']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Return Date']")).click();
		driver.findElement(By.xpath("//a[text()='28']")).click();
	}

}
