package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMCLASS.Homepage;
import POMCLASS.Leadpage;
import POMCLASS.Loginpage;
import POMCLASS.createleadpage;
import genericUtility.Baseclass;
import genericUtility.ExcelUtility;
import genericUtility.propertiesUtility;
import genericUtility.seleniumUtility;

public class TC_001practice extends Baseclass {
@Test
public void testcase1() throws IOException {
//	seleniumUtility sutil=new seleniumUtility();
//	propertiesUtility putil=new propertiesUtility();
//	ExcelUtility eutil=new ExcelUtility();
//	String url = putil.getDataFromPropertiesFiles("url");
//	String UN = putil.getDataFromPropertiesFiles("username");
//	String pass = putil.getDataFromPropertiesFiles("password");
//	WebDriver driver=new ChromeDriver();
//	sutil.maximizewindow(driver);
//	sutil.implicitWait(driver, 20);
//	sutil.accessApplication(driver, url);
//	Loginpage page=new Loginpage(driver);
//	page.Loginpage(UN, pass);
	Homepage home=new Homepage(driver);
	home.clickappnavigator();
	home.hoovermarketing(driver);
	home.clicklead();
	Leadpage lead=new Leadpage(driver);
	lead.clickoncreateicon();
	createleadpage cnlp=new createleadpage(driver);
	String fname = eutil.getSingleCellDataFromExcelFile("Lead",1 , 1);
	String lname = eutil.getSingleCellDataFromExcelFile("Lead",1 , 2);
	String cname = eutil.getSingleCellDataFromExcelFile("Lead",1 , 3);
	cnlp.createnewlead(fname, lname, cname);
//	home.clickicon();
//	home.clicksignout();
//	driver.quit();
	
	
	
	
}


}

