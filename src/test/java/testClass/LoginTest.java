package testClass;

import utilities.BaseClass;

import org.testng.annotations.Test;

import PageObject.PB_LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {
        PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
        pblogin.login("64657448", "123456a", "+63");
        Thread.sleep(5000);
        pblogin.logout();
    }
}
