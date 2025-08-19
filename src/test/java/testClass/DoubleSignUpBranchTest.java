package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.BranchSignUp;
import PageObject.PB_LogoutPage;
import utilities.BaseClass;

public class DoubleSignUpBranchTest extends BaseClass {
    
	@Test
	 public void signUpBranch() throws InterruptedException, IOException {
        BranchSignUp branch = new BranchSignUp(pbDriver);
        PB_LogoutPage logpb = new PB_LogoutPage(pbDriver);
        
		
		  branch.signUpBranch(); 
		  logpb.logOutMain();
		 

        // Recreate the page object after logout
         branch = new BranchSignUp(pbDriver);
        branch.signUpBranch_1();
        logpb.logOutMain();
    }
}
