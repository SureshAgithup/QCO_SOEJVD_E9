package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	//double click
	public void doubleClickProcess(WebDriver driver, WebElement ele) {
	Actions a = new Actions(driver);
	a.doubleClick(ele).perform();
	}
	//Right click
		public void RightClick(WebDriver driver, WebElement ele){
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		}
		
		//drag and drop
		public void DragandDrop(WebDriver driver, WebElement ele1,WebElement ele2)
		{
			Actions a = new Actions(driver);
			a.dragAndDrop(ele1,ele2).perform();
		}
		
		//implicit wait
		public void implicitwait(WebDriver driver,int time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			
		}
		//Explicit wait
		public void Expilicitwait(WebDriver driver,int time,WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver,time);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
			
		}
		
		
		
	

}
