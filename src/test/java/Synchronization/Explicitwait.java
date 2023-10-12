package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
				// Maximizing statement
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//explicitWait
				WebDriverWait wait=new WebDriverWait(driver,20);
				
				//to open the browser
				driver.get("https://www.facebook.com/");
				//address of the email.textfield
				driver.findElement(By.id("email")).sendKeys("suresh");
				WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
				wait.until(ExpectedConditions.elementToBeClickable(login));
				login.click();
				
				
				}

}
