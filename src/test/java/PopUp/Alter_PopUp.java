package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_PopUp {

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
				driver.get("https://demoapp.skillrary.com/product.php?product=java");
				//address of plus icon
				WebElement plus=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
				Thread.sleep(3000);
				Actions a = new Actions(driver);
				a.doubleClick(plus).perform();
				driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
				Thread.sleep(3000);
				//handling PopUp
				Alert al = driver.switchTo().alert();
				Thread.sleep(3000);
				System.out.println(al.getText());
				al.accept();
				//al.dismiss();
				
				
				

	}

}
