package POMCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.seleniumUtility;

public class createleadpage {

	@FindBy(name="firstname")
	private WebElement firstnametextfield;
	
	@FindBy(name="lastname")
	private WebElement lastnametextfield;
	
	@FindBy(name="company")
	private WebElement companynametextfield;
	
	@FindBy(name="designation")
	private WebElement designationtextfield;
	
	@FindBy(xpath="(//span[text()='Select an Option'])[1]")
	private WebElement leadsourcedropdown;
	
	@FindBy(id="select2-result-label-18")
	private WebElement leadsourceoption;
	
	@FindBy(name="mobile")
	private WebElement mobiletextfield;
	
	@FindBy(name="email")
	private WebElement emailtextfield;
	
	@FindBy(name="city")
	private WebElement citytextfield;
	
	@FindBy(name="state")
	private WebElement statetextfield;
	
	@FindBy(xpath="//button[text()='Save']")
	 WebElement savebutton;
	
	public createleadpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getCompanynametextfield() {
		return companynametextfield;
	}

	
	public WebElement getDesignationtextfield() {
		return designationtextfield;
	}

	public WebElement getLeadsourcedropdown() {
		return leadsourcedropdown;
	}
	public WebElement getLeadsourceoption() {
		return leadsourceoption;
	}

	public WebElement getMobiletextfield() {
		return mobiletextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getCitytextfield() {
		return citytextfield;
	}

	public WebElement getStatetextfield() {
		return statetextfield;
	}
	public void selectLeadSourcepartner() {
		
		getLeadsourcedropdown().click();
		getLeadsourceoption().click();
	}
	
	public void createnewlead(String fname,String lname,String company) {
		getFirstnametextfield().sendKeys(fname);
		getLastnametextfield().sendKeys(lname);
		getCompanynametextfield().sendKeys(company);
		savebutton.click();
	}
	public void createnewlead(String lname,String company,String title,String mobile) {
		getLastnametextfield().sendKeys(lname);
		getCompanynametextfield().sendKeys(company);
		getDesignationtextfield().sendKeys(title);
//		seleniumUtility sutil=new seleniumUtility();
//		sutil.dropdownbyvalue(getLeadsourcedropdown(), leadsource);
		selectLeadSourcepartner();
		getMobiletextfield().sendKeys(mobile);
		savebutton.click();
	}

		
	public void createnewlead(String lname,String company,String title,String mobile,String email,String city,String state) {
		getLastnametextfield().sendKeys(lname);
		getCompanynametextfield().sendKeys(company);
		getDesignationtextfield().sendKeys(title);	
		getMobiletextfield().sendKeys(mobile);
		getEmailtextfield().sendKeys(email);
		getCitytextfield().sendKeys(city);
		getStatetextfield().sendKeys(state);
		savebutton.click();
	}
}
