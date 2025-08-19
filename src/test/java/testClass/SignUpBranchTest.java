package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.BranchSignUp;
import PageObject.PB_LogoutPage;
import utilities.BaseClass;

public class SignUpBranchTest extends BaseClass {
	
	@Test
	public void sign() throws InterruptedException, IOException {
	    try {
	        BranchSignUp st = new BranchSignUp(pbDriver);
	        st.signUpBranch();
	    } catch (Exception e) {
	        System.err.println("Error during branch sign-up: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
}
