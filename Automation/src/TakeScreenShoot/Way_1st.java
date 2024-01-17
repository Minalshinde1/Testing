package TakeScreenShoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way_1st {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com/in/iphone/");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
	
		File dest=new File("./selenium/iphone1.png");
		Thread.sleep(2000);
		//copy from src to dest
		Files.copy(src, dest);
		driver.quit();
	}

}
