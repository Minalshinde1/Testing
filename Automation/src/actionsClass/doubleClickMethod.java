package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		
		
		//create the object for actions class
		Actions act = new Actions(driver);
		
		WebElement path = driver.findElement(By.id("btn20"));
		
	    act.doubleClick(path).perform();
	    act.doubleClick(driver.findElement(By.id("btn21"))).perform();
	    
	    //for yes
	    act.doubleClick(driver.findElement(By.id("btn22"))).perform();
	    //for No
	    act.doubleClick(driver.findElement(By.id("btn21"))).perform();
	    
	    
	    act.doubleClick(driver.findElement(By.id("btn27"))).perform();
	    
	    driver.quit();
	}

}
