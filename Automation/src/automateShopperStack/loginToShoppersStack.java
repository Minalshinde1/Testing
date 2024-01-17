package automateShopperStack;

import java.io.File;
import java.time.Duration;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class loginToShoppersStack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		Thread.sleep(3000);
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("prachishinde2000@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Prachi@9687");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		WebElement men = driver.findElement(By.xpath("//a[@name='men']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(men).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		 driver.findElement(By.xpath("//img[@alt='Levis Mens Regular Fit Tee']"));
		 //TakesScreenshot ts =(TakesScreenshot) driver;
		//File gss = ts.getScreenshotAs(OutputType.FILE);
		driver .findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.id("cartIcon")).click();
		//driver.findElement(By.xpath("(//button[@tabindex='0'])[2]")).click();
		 
		 
	}

}
