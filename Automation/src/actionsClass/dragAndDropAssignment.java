package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dragAndDropAssignment {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	
	driver.navigate().to("https://demoapps.qspiders.com/?scenario=1");
	driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
	driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[7]")).click();
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
	
	//drag mobile charger
	WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement drag2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	//drop mobile accessories
	WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(drag1, drop1).perform();
	act.dragAndDrop(drag2, drop1).perform();
	
	//drag laptop charger
	WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	WebElement drag4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	//drop laptop accessories
	WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	Actions act1 = new Actions(driver);
	act.dragAndDrop(drag3, drop2).perform();
	act.dragAndDrop(drag4, drop2).perform();
	
	driver.quit();
}
}
