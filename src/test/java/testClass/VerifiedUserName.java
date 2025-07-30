package testClass;

import org.testng.annotations.Test;

import PageObject.PB_UserName;
import utilities.BaseClass;

public class VerifiedUserName extends BaseClass {
    
	@Test
	public void isVerifiead() throws InterruptedException {
		PB_UserName name=new PB_UserName(pbDriver);
		name.nameVerified();
	}
}
