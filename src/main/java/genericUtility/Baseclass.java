package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import POMCLASS.Homepage;
import POMCLASS.Loginpage;

public class Baseclass {
public seleniumUtility sutil=new seleniumUtility();
public propertiesUtility putil=new propertiesUtility();
public ExcelUtility eutil=new ExcelUtility();
public WebDriver driver;
//used for listeners
public static WebDriver sdriver; 

@BeforeSuite(alwaysRun=true)
public void createDbconnection() {
	System.out.println("DB connection created");
}
@Parameters("browser")
@BeforeClass(alwaysRun=true)
public void launchBrowser(@Optional("chrome")String BROWSER) throws IOException {
	if(BROWSER.equals("chrome"))
		driver=new ChromeDriver();
	else if(BROWSER.equals("edge"))
		driver=new EdgeDriver();
	else if(BROWSER.equals("Firefox"))
		driver=new FirefoxDriver();
	else
	driver=new ChromeDriver();
//	initialize static driver used for listeners
	sdriver=driver;
	
	sutil.maximizewindow(driver);
	sutil.implicitWait(driver, 20);
	String url = putil.getDataFromPropertiesFiles("url");
	sutil.accessApplication(driver, url);
	System.out.println("Browser launched successfully");
}
	@BeforeMethod(alwaysRun=true)
	public void loginoperation() throws IOException {
	Loginpage page=new Loginpage(driver);
	String UN = putil.getDataFromPropertiesFiles("username");
	String pass = putil.getDataFromPropertiesFiles("password");
	page.Loginpage(UN, pass);
	System.out.println("login done successfully");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutoperation() {
	Homepage hp=new Homepage(driver);
	hp.clickicon();
	hp.clicksignout();
	System.out.println("logot done");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowswer() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	@AfterSuite(alwaysRun=true)
	public void closedb() {
		System.out.println("DB connection closed");
	}
	

}
