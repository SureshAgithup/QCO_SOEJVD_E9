package basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchings_browser {
	

	public static void main(String[]args) throws Throwable {
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		// Delay time
		Thread.sleep(3000);
		// Maximizing statement
		driver.manage().window().maximize();
		
		
		
		
	}
}
