package basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	
	public static void main(String[] args) throws Throwable
	{
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		// Maximizing statement
		driver.manage().window().maximize();
		//it open the application
		driver.get("https://www.facebook.com/");
		// Delay time
		Thread.sleep(3000);
		// navigate the one webpage to another webpage
		driver.navigate().to("https://www.amazon.in/");
		// Delay time
		Thread.sleep(3000);
		//going to backward function
		driver.navigate().back();
		// Delay time
		Thread.sleep(3000);
		//Going to forward function
		driver.navigate().forward();
		// Delay time
		Thread.sleep(3000);
		//going to Refresh function
		driver.navigate().refresh();
		// Delay time
		Thread.sleep(3000);
		//close the webpage( driver.quit() or driver.close())
		driver.quit();
		
		
		
		
		
	}

}
