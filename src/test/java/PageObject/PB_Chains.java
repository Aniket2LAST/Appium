package PageObject;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;

public class PB_Chains extends BaseClass {

	 public PB_Chains(AndroidDriver driver) {
		    //    this.driver = driver;
		        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	
	 
	 public void chains() throws InterruptedException, IOException {
		 PB_LogoutPage logpb=new PB_LogoutPage(pbDriver);
			
		 PB_SignUp1 sign=new PB_SignUp1(pbDriver);
			sign.SignUpCollector();
			logpb.logout();
			sign.SignUpCollector();
			logpb.logout();
			
		 BranchSignUp branch=new BranchSignUp(pbDriver);
		    branch.signUpBranch();
		    logpb.logOutMain();
		    branch.signUpBranch();
		    logpb.logOutMain();
		    
		 ProcessorSignUp st=new ProcessorSignUp(pbDriver);
			st.signUpProcess(); 
			logpb.logOutMain();
			
		 PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		 int n1 =sixDigitNumbers.get(2);
		    pblogin.login( String.valueOf(n1), "123456a", "+63");	
		    
		    int member1=sixDigitNumbers.get(0);
		    TransactionsPage tc=new TransactionsPage(pbDriver);
		    tc.branchtransactions(String.valueOf(member1));
	 }
}
