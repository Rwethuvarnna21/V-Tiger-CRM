package POMCLASS;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createcontactpage {

	@FindBy(name="firstname")
	private WebElement firstnametextfield;
	
	@FindBy(name="lastname")
	private WebElement lastnametextfield;
	
	@FindBy(name="title")
	private WebElement titletextfield;
	
	@FindBy(name="department")
	private WebElement depttextfield;
	
	@FindBy(name="mobile")
	private WebElement mobiletextfield;
	
	@FindBy(name="email")
	private WebElement emailtextfield;
	
	@FindBy(name="mailingcity")
	private WebElement mailingcitytextfield;
	
	@FindBy(name="mailingstate")
	private WebElement mailingstatetextfield;
	
	@FindBy(name="mailingcountry")
	private WebElement mailingcountrytextfield;
	
	@FindBy(xpath="//button[text()='Save']")
	 WebElement savebutton;
	
	public createcontactpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getDepttextfield() {
		return depttextfield;
	}

	public WebElement getMobiletextfield() {
		return mobiletextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getMailingcitytextfield() {
		return mailingcitytextfield;
	}

	public WebElement getMailingstatetextfield() {
		return mailingstatetextfield;
	}

	public WebElement getMailingcountrytextfield() {
		return mailingcountrytextfield;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getTitletextfield() {
		return titletextfield;
	}
	
	public void createcontact(String fname,String lname,String title) {
		getFirstnametextfield().sendKeys(fname);
		getLastnametextfield().sendKeys(lname);
		getTitletextfield().sendKeys(title);
		savebutton.click();
	}
	public void createcontact(String lname,String Dept,String email,String mobile) {
		
		getLastnametextfield().sendKeys(lname);
		getDepttextfield().sendKeys(Dept);
		getEmailtextfield().sendKeys(email);
		getMobiletextfield().sendKeys(mobile);
		savebutton.click();
	}
	public void createcontact(String lname,String Dept,String email,String city,String state,String country) {
		
		getLastnametextfield().sendKeys(lname);
		getDepttextfield().sendKeys(Dept);
		getEmailtextfield().sendKeys(email);
		getMailingcitytextfield().sendKeys(city);
		getMailingstatetextfield().sendKeys(state);
		getMailingcountrytextfield().sendKeys(country);
		savebutton.click();
		
	}
}
