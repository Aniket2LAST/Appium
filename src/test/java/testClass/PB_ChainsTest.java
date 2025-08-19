package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.PB_Chains;
import utilities.BaseClass;

public class PB_ChainsTest extends BaseClass {
    
	@Test
	public void Chains_Pb() throws InterruptedException, IOException {
		PB_Chains dew =new PB_Chains(pbDriver);
		dew.chains();
	}
}
