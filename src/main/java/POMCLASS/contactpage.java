package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpage {

	@FindBy(id="Contacts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement createnewcontact;
	
	public contactpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getCreatenewcontact() {
		return createnewcontact;
	}

	public void createnewcontacticon() {
		getCreatenewcontact().click();
	}
	
}
