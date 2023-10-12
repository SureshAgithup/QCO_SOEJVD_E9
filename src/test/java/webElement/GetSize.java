package webElement;

import org.openqa.selenium.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize {

	public static void main(String[] args) {
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
				
				// Maximizing statement
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//to open the browser
				driver.get("https://www.facebook.com/");
				WebElement emailTf = driver.findElement(By.xpath("//input[@id='email']"));
			    Dimension size = emailTf.getSize();
			    int h = size.getHeight();
			    double w = size.getWidth();
			    System.out.println("h");
			    System.out.println("w");
			    
			    
				
				
	}

}
