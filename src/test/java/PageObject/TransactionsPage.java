package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;

public class TransactionsPage extends BaseClass {
  
	public TransactionsPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Exchange\")")
public WebElement exchange; 

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement searchTxt;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\").instance(2)")
public WebElement searchSymbol;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(32)")
public WebElement memberSelect;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Start transaction\")")
public WebElement startTransactins;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"HDPE\")")
public WebElement HDPE;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"PET\")")
public WebElement PET;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"MONOBLOCK\")")
public WebElement Monoblock;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement weightTxt;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement priceTxt;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Add to cart\")")
public WebElement AddCart;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Next\")")
public WebElement next;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take photo of receipt\")")
public WebElement TakeReceipt;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take Picture\")")
public WebElement TakePhoto;


@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.camera2:id/shutter_button\")")
public WebElement cameraIcon;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.camera2:id/done_button\")")
public WebElement done;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Save\")")
public WebElement Save;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Confirm\")")
public WebElement conform;


	public void branchtransactions(String Number) throws InterruptedException {
		Thread.sleep(5000);
		exchange.click();
		Thread.sleep(10000);
		
			
		searchTxt.sendKeys(Number);
		
		searchSymbol.click();
		memberSelect.click();
		startTransactins.click();
		HDPE.click();
		weightTxt.sendKeys("30");
		priceTxt.sendKeys("10");
		AddCart.click();
		next.click();
		TakeReceipt.click();
		TakePhoto.click();
		cameraIcon.click();
		done.click();
		Save.click();
		conform.click();
		
	}
}
