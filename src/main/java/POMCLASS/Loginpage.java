package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
/**
 * this is a loginpage pomclass vtiger
 */
	
//		locating the webelement
		@FindBy(name="username")
		private WebElement usernameTextField;
		
		@FindBy(name="password")
		private WebElement passwordtextfield;
		
		@FindBy(xpath="//button[text()='Sign in']")
		private WebElement loginBTn;
		
//	initializing the webelement
		public Loginpage(WebDriver driver) {
			PageFactory.initElements( driver,this);
			}
		
//		getter method
		

		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordtextfield() {
			return passwordtextfield;
		}

		public WebElement getLoginBTn() {
			return loginBTn;
		}

//		utilizing the webelement
		
		public void Loginpage(String username,String password) {
			

			    usernameTextField.sendKeys(username);


			    passwordtextfield.sendKeys(password);
			    loginBTn.click();
			
		}
		
		
		
		

	

}
