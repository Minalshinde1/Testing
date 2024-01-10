package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoAppAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");
		Thread.sleep(2000);
		
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		
		act.contextClick(driver.findElement(By.id("btn30"))).perform();
		driver.findElement(By.xpath("(//div[@class='py-1 ps-1 hover:bg-orange-300'])[1]")).click();
		Thread.sleep(2000);
		
		act.contextClick(driver.findElement(By.id("btn31"))).perform();
		driver.findElement(By.xpath("(//div[@class='py-1 ps-1 hover:bg-orange-300'])[2]")).click();
		
		Thread.sleep(2000);
		act.contextClick(driver.findElement(By.id("btn32"))).perform();
		driver.findElement(By.xpath("//div[text()='3']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
