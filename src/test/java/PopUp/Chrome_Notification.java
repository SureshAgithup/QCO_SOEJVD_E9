package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Notification {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sures\\Desktop\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe" );
				WebDriver driver = new ChromeDriver(option);
				// Maximizing statement
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.redbus.in/");
		
		
	}

}
