package testCaseRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
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
public class TC_001 extends Baseclass {
//	@Test(retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
public void LE_001() throws EncryptedDocumentException, IOException {
		Homepage home=new Homepage(driver);
		home.clickappnavigator();
		home.hoovermarketing(driver);
//		Assert.fail();
		home.clicklead();
		Leadpage lead=new Leadpage(driver);
		lead.clickoncreateicon();
		createleadpage cnlp=new createleadpage(driver);
		String fname = eutil.getSingleCellDataFromExcelFile("Lead",1 , 1);
		String lname = eutil.getSingleCellDataFromExcelFile("Lead",1 , 2);
		String cname = eutil.getSingleCellDataFromExcelFile("Lead",1 , 3);
		cnlp.createnewlead(fname, lname, cname);
}
}
