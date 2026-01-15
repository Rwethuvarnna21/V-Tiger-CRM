package testCaseRepo;

import org.testng.annotations.Listeners;
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
@Listeners(genericUtility.Listenersimplementation.class)
public class Tc_002 extends Baseclass{
	@Test(groups= {"smoke"})
	public void LE_002() throws EncryptedDocumentException, IOException {
		Homepage home=new Homepage(driver);
		home.clickappnavigator();
		home.hoovermarketing(driver);
		home.clicklead();
		Leadpage lead=new Leadpage(driver);
		lead.clickoncreateicon();
		createleadpage cnlp=new createleadpage(driver);
		String lname = eutil.getSingleCellDataFromExcelFile("Lead", 4, 1);
		String Cname = eutil.getSingleCellDataFromExcelFile("Lead", 4, 2);
		String Tname = eutil.getSingleCellDataFromExcelFile("Lead", 4, 3);
		cnlp.selectLeadSourcepartner();
//		String Dropname = eutil.getSingleCellDataFromExcelFile("Lead", 4, 4);
		String number = eutil.getSingleCellDataFromExcelFile("Lead", 4, 5);

		cnlp.createnewlead(lname, Cname, Tname, number);
		
		
		
	}

}
