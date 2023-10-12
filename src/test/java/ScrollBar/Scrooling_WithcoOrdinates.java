package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrooling_WithcoOrdinates {


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
				driver.get("https://www.amazon.in/");
				//address of career webElement
				WebElement carrer = driver.findElement(By.xpath("//a[text()='Careers']"));
				Point coOrdinates = carrer.getLocation();
				int x =coOrdinates.getX();
				int y =coOrdinates.getY();
				
				//downloading
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(" + x + "," + y + ")");
				Thread.sleep(3000);
				
				//career.click();
				js.executeScript("arguments[0].click();", carrer);
				
				
				

	}

}
