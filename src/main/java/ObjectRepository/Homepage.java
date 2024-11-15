package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.WebDriverUtility;

public class Homepage extends WebDriverUtility {
@FindBy(xpath="//a[text()='Organizations']")private WebElement orglnk;
@FindBy(xpath="//a[text()='Opportunities']")private WebElement opplnk;
@FindBy(xpath="//span[text()=' Administrator']")private WebElement admImg;
@FindBy(xpath="//a[text()='Sign Out']")private WebElement signoutlnk;
//Constructor
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//getters
public WebElement getOrglnk() {
	return orglnk;
}
public WebElement getOpplnk() {
	return opplnk;
}
public WebElement getAdmImg() {
	return admImg;
}
public WebElement getSignoutlnk() {
	return signoutlnk;
}

//Business Library
public void clickonOrglnk() {
	orglnk.click();
}
public void clickonOpportunitieslnk() {
	opplnk.click();
}
public void clickOnSignOutApp() {
	signoutlnk.click();
}
}

