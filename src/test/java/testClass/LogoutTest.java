package testClass;

import org.testng.annotations.Test;

import PageObject.PB_LogoutPage;
import utilities.BaseClass;

public class LogoutTest extends BaseClass{
    
	@Test
	public void logoutTest() throws InterruptedException {
		PB_LogoutPage logpb=new PB_LogoutPage(pbDriver);
		logpb.logout();
	}
}
