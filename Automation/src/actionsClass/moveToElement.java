package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		  WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		  
		  //crate object for actions class
		  Thread.sleep(2000);
		   Actions act = new Actions(driver);
		   Thread.sleep(3000);
		   act.moveToElement(fashion).perform();
		   Thread.sleep(2000);
		   
		   driver.quit();
	}

}
