package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddendivisionPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sures\\Desktop\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe" );
		//edge driver related statement
		//WebDriverManager.edgedriver().setup();
		
		//opens the empty edge browser
		WebDriver driver = new ChromeDriver();
		// Maximizing statement
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//to open the browser
		driver.get("htpps://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div[text()='sep']/ancestor::div[@class='sc-jzJRIG dPBSOp']//span[@class='DayTiles_CalendarDaysSpan-sc-1xum02u-1 fgdqFw']")).click();

	}

}
