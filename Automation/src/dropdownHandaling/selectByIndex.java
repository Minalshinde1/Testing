package dropdownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {

	public static void main(String[] args)  {
	
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");

		
		WebElement dropdown = driver.findElement(By.id("select3"));

		//Create the object of select class
		Select s = new Select(dropdown);

		//Using select by index
		s.selectByIndex(7);		
		driver.close();
		
		
	
			
	}
}
