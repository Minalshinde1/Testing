package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementMyntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement variable = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Thread.sleep(2000);
		Actions var = new Actions(driver);
		Thread.sleep(2000);
		var.moveToElement(variable).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
