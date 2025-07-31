package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.ProcessorSignUp;
import utilities.BaseClass;

public class ProcessorSignUpTest  extends BaseClass{
    
	@Test
	public void signUpProcessor() throws InterruptedException, IOException {
		ProcessorSignUp st=new ProcessorSignUp(pbDriver);
		st.signUpProcess();
	}
}
