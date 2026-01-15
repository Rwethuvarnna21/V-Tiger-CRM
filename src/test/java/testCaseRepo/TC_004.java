package testCaseRepo;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMCLASS.Homepage;
import POMCLASS.contactpage;
import POMCLASS.createcontactpage;
import genericUtility.Baseclass;

public class TC_004 extends Baseclass {
	@Test(groups= {"smoke"})
	public void CON_004() throws EncryptedDocumentException, IOException {
		Homepage home=new Homepage(driver);
		home.clickappnavigator();
		home.hoovermarketing(driver);
		home.clickcontact();
		contactpage cp=new contactpage(driver);
		cp.createnewcontacticon();
		createcontactpage cncp=new createcontactpage(driver);
		String fname = eutil.getSingleCellDataFromExcelFile("contacts", 1, 1);
		String lname = eutil.getSingleCellDataFromExcelFile("contacts", 1, 2);
		String Tname = eutil.getSingleCellDataFromExcelFile("contacts", 1, 3);
		cncp.createcontact(fname, lname, Tname);
		
	}

}
