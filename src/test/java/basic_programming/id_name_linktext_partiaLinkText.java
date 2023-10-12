package basic_programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class id_name_linktext_partiaLinkText {
	
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
		//Address of email text field
		driver.findElement(By.id("email")).sendKeys("suresh");
		//Address of password textfield
		driver.findElement(By.name("pass")).sendKeys("suresh@123");
		//Delay time
		Thread.sleep(3000);
		//Address of login button
		//driver.findElement(By.name("login")).click();
		
	    //Use linkText open creat page
		driver.findElement(By.linkText("Create a Page")).click();
		//Delay time
		Thread.sleep(3000);
		//Use linkText open creat page
		driver.findElement(By.partialLinkText("Create")).click();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement b: allLinks) {
			System.out.println(b.getText());
			
		}
	}

}

