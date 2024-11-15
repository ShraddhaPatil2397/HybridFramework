package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationpage {
@FindBy(xpath="//td[@class='detailedViewHeader']")private WebElement orgHeadtxt;
public OrganizationInformationpage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
//getters
public WebElement getOrgHeadtxt() {
	return orgHeadtxt;
}
//Business library
public String getTextoforg() {
	return orgHeadtxt.getText();
	
}
}
