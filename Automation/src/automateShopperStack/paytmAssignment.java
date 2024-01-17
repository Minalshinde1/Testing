package automateShopperStack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class paytmAssignment {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_1qjtX'])[9]")).click();
		
		//Enter the value in from text field
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		//Enter the value in to TO text field
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("DXB");
		driver.findElement(By.xpath("//div[text()='Dubai, United Arab Emirates']")).click();
		
		//enter the value in date
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
        driver.findElement(By.xpath("(//div[text()='28'])[1]")).click();
        
        //enter the travellers and cabin class
        driver.findElement(By.id("travellerClass")).click();
        for(int i=0; i<=2; i++)
        {
        	driver. findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
        	Thread.sleep(2000);
        	}
        driver.findElement(By.id("flightSearch")).click();
         List<WebElement> allFlight = driver.findElements(By.xpath("//div[@class='_5Cbbf']"));
         for(WebElement flight:allFlight)
         {
        	 System.out.println(flight.getText());
        	 System.out.println("------------------------------");
        	 
        	 
         }
         TakesScreenshot js1= (TakesScreenshot) driver;
        File screen = js1.getScreenshotAs(OutputType.FILE);
        File store = new File("./selenium/paytm.png");
        Files.copy(screen, store);
        
        Thread.sleep(2000);
        driver.quit();
        
        }
        
	

}
