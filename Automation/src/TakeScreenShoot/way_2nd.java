package TakeScreenShoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class way_2nd {
	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		Thread.sleep(2000);
		driver.get("https://www.apple.com/iphone/?cid=oas-us-domains-iphone.com");
		//getScreenShot method
		Thread.sleep(2000);
		File s = driver.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		 File r = new File("./selenium/iphone2.png");
		 Files.copy(s, r);
		 driver.quit();
		 
	}

}
