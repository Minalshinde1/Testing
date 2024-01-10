package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		WebElement circle = driver.findElement(By.id("circle"));
		//create object for actions class
		Actions act = new Actions(driver);
		act.clickAndHold(circle).perform();
		Thread.sleep(2000);
		act.release().perform();
		driver.quit();
		
		
		
	}

}
