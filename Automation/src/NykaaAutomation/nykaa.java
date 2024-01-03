package NykaaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class nykaa {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/");
		
		String title = driver.getTitle();
		
		System.out.println("title of current wed page :"+ title);
		
		
	  String url  =driver .getCurrentUrl();
	  
	  System.out.println("current url of current web page :"+url);
	  
	  String sc= driver.getPageSource();
	  System.out.println(sc);

	  driver.navigate().refresh();
	  
	  driver.findElement(By.className("css-1gzc5zn")).click();
	  
}
}

