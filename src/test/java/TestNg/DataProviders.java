package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
	@DataProvider
	public Object[][] getData()
	{
		Object[][] a= new Object[3][2];
		a[0][0]= "suresh";
		a[0][1]= "kumar";
		
		a[1][0]= "java";
		a[1][1]= "selenium";
		
		a[2][0]= "qspider";
		a[2][1]= "trainer";
		
		return a;
		
	}
	@Test(dataProvider="getData")
	public void  facebook(String data, String data1)
	{
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//opens the empty edge browser
				WebDriver driver = new EdgeDriver();
				// Maximizing statement
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				// to open the browser
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys(data);
				driver.findElement(By.id("pass")).sendKeys(data1);
				
	}
	
}
