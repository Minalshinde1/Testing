package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
        //drag webElement
       WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
       Thread.sleep(2000);
       //drop webElement
       WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
       Thread.sleep(2000);
       Actions act = new Actions(driver);
       act.dragAndDrop(drag, drop).perform();
       Thread.sleep(2000);
       driver.quit();
	}
}
