package basic_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class following_sibling {
	
	public static void main(String[] args) throws Throwable
	{
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		// Maximizing statement
		driver.manage().window().maximize();
		
		//to open the browser
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Mobiles']/following-sibling::a[@data-csa-c-content-id='nav_cs_gb']")).click();
	}

}
