package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
@FindBy(xpath="//img[@title='Create Organization...']")private WebElement orglookupimg;
public Organizationpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//getters
public WebElement getOrglookupimg() {
	return orglookupimg;
}
//Business library
public void clickOnorglookupImg() {
	orglookupimg.click();
}
}
