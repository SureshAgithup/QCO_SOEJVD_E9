package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

	public static void main(String[] args) throws Throwable {

		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		// Maximizing statement
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//to open the browser
		driver.get("https://www.google.com/");
		//address of the text field
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		Thread.sleep(3000);
		List<WebElement> allValues = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(3000);
		System.out.println(allValues.size());
		for (WebElement b : allValues)
		{
			System.out.println(allValues.size());
			
		}
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
