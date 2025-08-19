package AlchemyTestCase;

import org.testng.annotations.Test;

import AlchemyPage.LoginAlchemy;
import utilities.BaseClass;

public class AlchemyLogin extends BaseClass {

	@Test
	public void loginAlchemy() throws InterruptedException {
		LoginAlchemy n1=new LoginAlchemy(alcDriver);
		n1.alc_adminlogin("639177122793","123123q");
	}
}
