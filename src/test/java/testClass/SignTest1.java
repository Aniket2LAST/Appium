package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.PB_SignUp1;
import utilities.BaseClass;

public class SignTest1 extends BaseClass {
    
	@Test
	public void sign() throws InterruptedException, IOException {
	PB_SignUp1 sign=new PB_SignUp1(pbDriver);
	sign.SignUpCollector();
	}
}
