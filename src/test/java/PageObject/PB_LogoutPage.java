package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;

public class PB_LogoutPage extends BaseClass {
public PB_LogoutPage (AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

@AndroidFindBy(xpath = "//android.widget.Button[@text=\"menu\"]")
public WebElement log;

public void clickmenu() throws InterruptedException {
	tap(60,170);
}
public void clicklogout() throws InterruptedException {
	tap(121,1330);
}
public void logout() throws InterruptedException {
	log.click();
	clicklogout();
}
}
