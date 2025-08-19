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

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
public WebElement log;


public void clickmenu() throws InterruptedException {
	tap(60,170);
}
public void clicklogout() throws InterruptedException {
	//for collector
	tap(121,1330);
	
	//for branch
	//tap(120,1500);
}
public void logout() throws InterruptedException {
	log.click();
	clicklogout();
}
public void logOutMain() throws InterruptedException {
	if(log.isDisplayed()) {
	tap(60,170);
	tap(120,1500);
	}
}

}
