package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceprion {
public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
//element
WebElement gmail =driver.findElement(By.xpath("//a[text()='Gmail']"));
driver.navigate().refresh();
gmail.click();
}
}
