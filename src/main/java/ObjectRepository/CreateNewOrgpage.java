package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgpage {

	@FindBy(xpath="//input[@name='accountname']")private WebElement orgText;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement savebtn;
	
	public CreateNewOrgpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//getters
	public WebElement getOrgText() {
		return orgText;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	//Business Library
	public void createOrganizationAndSaveIt(String ORGNAME) {
		orgText.sendKeys(ORGNAME);;
		savebtn.getText();
	}
}
