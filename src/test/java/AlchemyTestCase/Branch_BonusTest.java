package AlchemyTestCase;

import org.testng.annotations.Test;

import AlchemyPage.BranchSetUp;
import AlchemyPage.LoginAlchemy;
import utilities.BaseClass;

public class Branch_BonusTest extends BaseClass {

	@Test
	public void branch_Bonus() throws InterruptedException {
		LoginAlchemy n1=new LoginAlchemy(alcDriver);
		n1.alc_adminlogin("639177122793","123123q");
		BranchSetUp n2=new BranchSetUp(alcDriver);
		n2.branch_Bonus();
	}
}
