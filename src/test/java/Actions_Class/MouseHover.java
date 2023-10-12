package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

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
				driver.get("https://www.snapdeal.com/");
				
				//address of sign in
				WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
				//create an object for actions class
				Actions a = new Actions(driver);
				a.moveToElement(signIn).perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Register']")).click();
				
				
				
				
	}

}
