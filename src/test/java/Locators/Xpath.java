package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
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
		//address of email text field using X path attributes
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Suresh");
		Thread.sleep(3000);
		//address of password text field using x path contains attributes 
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("kumar");
		Thread.sleep(3000);
		//address of forgotten password using xpath text
		 // driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//Address of forgotten password using xpath contains
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}
		
	
		

}
