package TestNG_Perallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_compatability {
	@Parameters({"browsername"}) //give this once after converting into suite file
	@Test
	public void fac(String browser)
	{
		WebDriver driver;
		if (browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			//open the empty browser
			driver = new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sures\\Desktop\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe");
					driver = new ChromeDriver();
			
		}
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// to open the browser
		driver.get("https://www.facebook.com/");
	}

}
