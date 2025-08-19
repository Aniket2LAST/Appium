package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;

public class login_1Page extends BaseClass {

public login_1Page(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

@AndroidFindBy(uiAutomator="new UiSelector().text(\"English\")")
public WebElement English;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Continue\")")
public WebElement continu;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Log in\")")
public WebElement login;

@AndroidFindBy(uiAutomator="new UiSelector().instance(0)")
public WebElement DropDown;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\")")
public WebElement selectdrp;


@AndroidFindBy(uiAutomator="new UiSelector().text(\"Philippines (+63)\")")
public WebElement philip;

/*
 * @AndroidFindBy(xpath= "(//android.widget.EditText)[3]") public WebElement
 * phoneTxt;
 */
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement phoneTxt;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(2)")
public WebElement passwordTxt;


@AndroidFindBy(uiAutomator="new UiSelector().text(\"Log in\")")
public WebElement LogIn;

public void LogIn(String phoneNumber, String password, String code) throws InterruptedException {
	English.click();
	continu.click();
	login.click();
	Thread.sleep(5000);
	//DropDown.click();
	tap(200,1670);
	Thread.sleep(5000);
	selectdrp.sendKeys(code);
	Thread.sleep(5000);
	//searchcountries.sendKeys(code);
	tap(240,500);
	Thread.sleep(4000);
	//phoneTxt.click();
	phoneTxt.sendKeys(phoneNumber);
	passwordTxt.sendKeys(password);
	Thread.sleep(2000);
	tap(500,2100);
	//LogIn.click();
}


}
