package testClass;

import org.testng.annotations.Test;

import PageObject.TransactionsPage;
import PageObject.login_1Page;
import utilities.BaseClass;

public class BranchToMemberTransactionTest extends BaseClass {
    
	@Test
	public void transactions() throws InterruptedException {
		TransactionsPage n1=new TransactionsPage(pbDriver);
		 login_1Page pblogin = new login_1Page(pbDriver);
		 
		 pblogin.LogIn("778877655", "123456a", "+63");
		n1.branchtransactions("66778899");
	}
}
