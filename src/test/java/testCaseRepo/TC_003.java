package testCaseRepo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMCLASS.Homepage;
import POMCLASS.Leadpage;
import POMCLASS.createleadpage;
import genericUtility.Baseclass;

public class TC_003 extends Baseclass {
	@Test(groups= {"smoke","regression"})
	public void LE_003() throws EncryptedDocumentException, IOException {
		Homepage home=new Homepage(driver);
		home.clickappnavigator();
		home.hoovermarketing(driver);
		home.clicklead();
		Leadpage lead=new Leadpage(driver);
		lead.clickoncreateicon();
		createleadpage cnlp=new createleadpage(driver);
		String lname = eutil.getSingleCellDataFromExcelFile("Lead", 7, 1);
		String Cname = eutil.getSingleCellDataFromExcelFile("Lead", 7, 2);
		String Tname = eutil.getSingleCellDataFromExcelFile("Lead", 7, 3);
		String number = eutil.getSingleCellDataFromExcelFile("Lead", 7, 4);
		String email = eutil.getSingleCellDataFromExcelFile("Lead", 7, 5);
		String city = eutil.getSingleCellDataFromExcelFile("Lead", 7, 6);
		String state = eutil.getSingleCellDataFromExcelFile("Lead", 7, 7);
		cnlp.createnewlead(lname, Cname, Tname, number, email, city, state);
		
	}


@Test
public void hi() {
	System.out.println("hi");	
}
}
