package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMCLASS.Homepage;
import POMCLASS.contactpage;
import POMCLASS.createcontactpage;
import genericUtility.Baseclass;

public class TC_006 extends Baseclass{
	@Test
	public void CON_003() throws EncryptedDocumentException, IOException {
		Homepage home=new Homepage(driver);
		home.clickappnavigator();
		home.hoovermarketing(driver);
		home.clickcontact();
		contactpage cp=new contactpage(driver);
		cp.createnewcontacticon();
		createcontactpage cncp=new createcontactpage(driver);
		String lname = eutil.getSingleCellDataFromExcelFile("contacts", 7, 1);
		String Dname = eutil.getSingleCellDataFromExcelFile("contacts", 7, 2);
		String email = eutil.getSingleCellDataFromExcelFile("contacts", 7, 3);
	
		String mailingcity = eutil.getSingleCellDataFromExcelFile("contacts", 4, 1);
		String mailingstate = eutil.getSingleCellDataFromExcelFile("contacts", 4, 2);
		String mailingcountry = eutil.getSingleCellDataFromExcelFile("contacts", 4, 3);
		cncp.createcontact(lname, Dname, email, mailingcity, mailingstate, mailingcountry);
	}

}
