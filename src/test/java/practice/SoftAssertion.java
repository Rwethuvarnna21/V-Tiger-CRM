package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
@Test public void strictlevelSoftAssertion() {
	String Expectedname="Reenu";
	String ActualName="Reethu";
	System.out.println("Strict level softassertion start");
	SoftAssert s=new SoftAssert();
		s.assertEquals(ActualName,Expectedname);
	
	System.out.println("Strict level softassertion end");
	s.assertAll();
}
	@Test public void containlevelsoftAssertion() {
		String Expectedname="Reenu";
		String ActualName="Reethu";
		System.out.println("Strict level contain  softassertion start");
		SoftAssert s=new SoftAssert();
		s.assertTrue(ActualName.equals(Expectedname));
		System.out.println("Strict level contain  softassertion endt");
		s.assertAll();
		
}

	
}


