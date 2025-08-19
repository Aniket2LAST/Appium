package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.PB_LogoutPage;
import PageObject.ProcessorSignUp;
import utilities.BaseClass;

public class ProcessorSignUpTest  extends BaseClass{
    
	@Test
	public void signUpProcessor() throws InterruptedException, IOException {
		ProcessorSignUp st=new ProcessorSignUp(pbDriver);
		st.signUpProcess();
		Thread.sleep(4000);
		PB_LogoutPage logpb=new PB_LogoutPage(pbDriver);
		logpb.logOutMain();
	}
}
