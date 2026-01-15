package practice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericUtility.Listenersimplementation.class)
public class practiceTestNG {
//    @Ignore
	@Test(priority=1/*enabled=false*/)
		
	public void createuser() {
		System.out.println("user created");
		}
	@Test(priority=2,invocationCount=2)
	public void modifyuser() {
//		Assert.fail();
		System.out.println("modify user");
	}
	@Test(priority=-1,dependsOnMethods= {"createuser","modifyuser"})
	public void deleteuser() {
		System.out.println("delete-user");
	}
}
