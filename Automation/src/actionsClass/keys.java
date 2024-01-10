package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;


public class keys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("http://pn/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("manager",Keys.TAB,Keys.TAB);
		//Thread.sleep(2000);
		//driver.findElement(By.id("loginButton")).click();
		
	}
	}


