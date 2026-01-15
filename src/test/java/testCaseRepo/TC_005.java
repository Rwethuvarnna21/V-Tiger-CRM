package testCaseRepo;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMCLASS.Homepage;
import POMCLASS.contactpage;
import POMCLASS.createcontactpage;
import genericUtility.Baseclass;

public class TC_005 extends Baseclass{
	@Test(groups= {"smoke"})
	public void CON_002() throws EncryptedDocumentException, IOException {
		Homepage home=new Homepage(driver);
		home.clickappnavigator();
		home.hoovermarketing(driver);
		home.clickcontact();
		contactpage cp=new contactpage(driver);
		cp.createnewcontacticon();
		createcontactpage cncp=new createcontactpage(driver);
		String lname = eutil.getSingleCellDataFromExcelFile("contacts", 4, 1);
		String Dname = eutil.getSingleCellDataFromExcelFile("contacts", 4, 2);
		String mail = eutil.getSingleCellDataFromExcelFile("contacts", 4, 3);
		
		String number = eutil.getSingleCellDataFromExcelFile("contacts", 4, 4);
		cncp.createcontact(lname, Dname, mail, number);

}
}