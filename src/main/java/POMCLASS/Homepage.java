package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.seleniumUtility;

public class Homepage {
//	locating the webelement
@FindBy(id="appnavigator")
private WebElement navigator;

@FindBy(xpath="//span[text()=' MARKETING']")
private WebElement marketing;

@FindBy(xpath="//a[@title='Leads']")
private WebElement leads;

@FindBy(xpath="(//a[@title='Contacts'])[1]")
private WebElement contacts;

@FindBy(xpath="//a[@role='button']")
private WebElement icon;

@FindBy(linkText="Sign Out")
private WebElement signout;
//initializing the webelement
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//getter method
public WebElement getNavigator() {
	return navigator;
}

public WebElement getMarketing() {
	return marketing;
}

public WebElement getLeads() {
	return leads;
}

public WebElement getContacts() {
	return contacts;
}

public WebElement getIcon() {
	return icon;
}

public WebElement getSignout() {
	return signout;
}
//utilizing method 
public void clickappnavigator() {
	navigator.click();
	}

public void hoovermarketing(WebDriver driver) {
	
	seleniumUtility sutil=new seleniumUtility();
	
	sutil.mousehoveringAction(driver,getMarketing());
}
public void clicklead() {
	leads.click();
}


public void hoovercontact(WebDriver driver) {
	seleniumUtility sutil=new seleniumUtility();
	sutil.mousehoveringAction(driver,getContacts());
}
public void clickcontact() {
	contacts.click();
}
public void clickicon() {
	icon.click();
}
public void clicksignout() {
	signout.click();
}
	
		

	

}
