package testClass;

import org.testng.annotations.Test;

import PageObject.PB_RegisterMember;
import PageObject.PB_SignUpPage;
import utilities.BaseClass;

public class SignTest extends BaseClass {
	@Test
	public void sign() throws InterruptedException {
    PB_SignUpPage sign=new PB_SignUpPage(pbDriver);
    sign.signUpCollector();
 
}
}