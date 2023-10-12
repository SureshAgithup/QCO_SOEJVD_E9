package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_intex {
	
	public static void main(String[] args) throws Throwable
	{
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		// Maximizing statement
		driver.manage().window().maximize();
		//it open the application
		driver.get("https://demoapp.skillray.com/");
		
		driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
		
	}
	
}
