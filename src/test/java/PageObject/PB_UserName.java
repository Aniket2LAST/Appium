package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;

public class PB_UserName extends BaseClass {

    public PB_UserName(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Aniket Kumar\"]")
    public WebElement name;

    public void nameVerified() throws InterruptedException {
    	PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
        pblogin.login("64657448", "123456a", "+63");
        Thread.sleep(5000);
        String expectedName = "Aniket Kumar";
        String actualName = name.getText();  
        System.out.println("Text found: " + actualName);
        
        // Optional: Assertion
        if (actualName.equals(expectedName)) {
            System.out.println("Username matched!");
        } else {
            System.out.println("Username mismatch!");
        }
    }
}
