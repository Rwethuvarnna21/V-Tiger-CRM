package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.seleniumUtility;

public class facebook {
 @FindBy(id="email")
 WebElement emailTF;
 public facebook(WebDriver driver) {
	 PageFactory.initElements( driver,this);
 }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		seleniumUtility sutil=new seleniumUtility();
		Thread.sleep(1000);
		sutil.maximizewindow(driver);
		sutil.accessApplication(driver, "https://www.facebook.com/");
		Thread.sleep(1000);
//	 WebElement emailTF = driver.findElement(By.name("email"));
//	 emailTF.sendKeys("robin");
		facebook p=new facebook(driver);
	 Thread.sleep(1000);
	 p.emailTF.sendKeys("robin");
	 driver.navigate().refresh();
	 Thread.sleep(1000);
	 p.emailTF.sendKeys("hood");
		

	}

}
