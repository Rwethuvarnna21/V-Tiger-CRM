package practice;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMCLASS.Homepage;
import POMCLASS.Leadpage;
import POMCLASS.Loginpage;
import POMCLASS.contactpage;
import POMCLASS.createleadpage;
import genericUtility.ExcelUtility;
import genericUtility.propertiesUtility;
import genericUtility.seleniumUtility;

public class vtigerdemo {

	public static void main(String[] args) throws IOException {
		propertiesUtility putil=new propertiesUtility();
		ExcelUtility eutil=new ExcelUtility();
		seleniumUtility sutil=new seleniumUtility();
		WebDriver driver=new ChromeDriver();
		sutil.maximizewindow(driver);
		sutil.implicitWait(driver, 15);
		///////////////logindata/////////////////////
		String url = putil.getDataFromPropertiesFiles("url");
		String UN = putil.getDataFromPropertiesFiles("username");
		String pass = putil.getDataFromPropertiesFiles("password");
		
	
        
		
		sutil.accessApplication(driver, url);
		Loginpage page=new Loginpage(driver);
		page.Loginpage(UN, pass);
		Homepage home=new Homepage(driver);
		home.clickappnavigator();
		home.hoovermarketing(driver);
		home.clicklead();
		Leadpage lead=new Leadpage(driver);
		lead.clickoncreateicon();
		/////////////*****************Sendingdatafromexcel******************8/////
		createleadpage cnld=new createleadpage(driver);
		String fname = eutil.getSingleCellDataFromExcelFile("Lead", 1, 1);
		String lname = eutil.getSingleCellDataFromExcelFile("Lead", 1, 2);
		String cname = eutil.getSingleCellDataFromExcelFile("Lead", 1, 3);
		cnld.createnewlead(fname, lname, cname);
		

        
		home.clickicon();
		home.clicksignout();
		

	}

}
