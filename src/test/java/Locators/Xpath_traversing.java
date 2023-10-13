package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_traversing {
	
	public static void main(String[] args) throws Throwable
	{
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		// Maximizing statement
		driver.manage().window().maximize();
		
		//to open the browser
		driver.get("https://www.amazon.in/Redmi-Storage-Performance-Mediatek-Display/dp/B0BYN4D512/ref=sr_1_1_sspa?crid=9WYJ098K356P&keywords=mobile&qid=1695476096&sprefix=%2Caps%2C250&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
	WebElement price =driver.findElement(By.xpath("(//span[text()='        Redmi 12C (Matte Black, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery       ']/../../../../../../..//span[@class='a-price-whole'])[5]"));
		System.out.println(price.getText());
	}
	

}
