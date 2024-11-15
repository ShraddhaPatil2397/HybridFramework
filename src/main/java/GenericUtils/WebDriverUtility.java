package GenericUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
/**
 * author Shraddha
 * it is used to maximize browsers window
 * @param driver
 */
	public void maximizewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * author Shraddha
	 * it is used to minimize browsers window
	 * @param driver
	 */
	public void minimizewindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * author Shraddha
	 * it is used for implicitly wait
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void handleDD(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void handleDD(String value,WebElement element) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void handleDD(WebElement element, String visibleText) {
		Select s=new Select(element);
		s.deselectByVisibleText(visibleText);
	}
	
	public void mouseoverToElement(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void RightClickPage(WebDriver driver) {
		Actions a=new Actions(driver);
		a.contextClick();
	}
	public void RightClickOnElement(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	public void DoubleClick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	
	public void DragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
		
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		 
	
	
	
	
