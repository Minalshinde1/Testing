package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollRight {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(2000);
		for(int i=0;i<=2; i++)
		{
			js.executeAsyncScript("window.scrollBy(500,0)");
			Thread.sleep(2000);
		
		}
		
	}

}
