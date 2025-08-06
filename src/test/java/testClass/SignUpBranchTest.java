package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.BranchSignUp;
import utilities.BaseClass;

public class SignUpBranchTest extends BaseClass {
	
	@Test
   public void sign() throws InterruptedException, IOException {
	BranchSignUp st = null;
	try {
		st = new BranchSignUp(pbDriver);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	st.signUpBranch();        
   }
}
