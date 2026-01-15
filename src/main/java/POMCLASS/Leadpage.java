package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadpage {
	/**
	 * this is the initialaizing method
	 * @param driver
	 */
	public Leadpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(id="Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement createnewlead;
	
	public WebElement getCreatenewlead() {
		return createnewlead;
	}
	/**
	 * this is a bussiness library to click on create new lead icon
	 */
	public void clickoncreateicon() {
		getCreatenewlead().click();
	}

}
