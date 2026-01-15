package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test public void StrictlevelAssertion() {
		String Expectedname="Rwethu";
		String ActualName="Reethu";
		System.out.println("Strict level hardassertion start");
		Assert.assertFalse(ActualName.equals(Expectedname));
//		Assert.assertEquals(ActualName, Expectedname);
		System.out.println("Strict level hardassertion end");
	}
	
@Test
public void containslevelAssertion() {
	String Expectedplace="Austria";
	String Actualplace="Australia";
	System.out.println("contain level hardassertion start");
	Assert.assertTrue(Actualplace.contains(Expectedplace));
	System.out.println("contain level hardassertion end");
}
}
