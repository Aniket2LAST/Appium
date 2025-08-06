package PageObject;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;




public class ProcessorSignUp extends BaseClass {

	@AndroidFindBy(uiAutomator="new UiSelector().text(\"English\")")	
	 public WebElement english;	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"Continue\")")
	public WebElement continu;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Sign up\")")	
 public WebElement signBtn;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Add material\")")	
public WebElement addmat;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(15)")
public WebElement recycleBussiness;
	
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(17)")
public WebElement processorSign;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Image\").instance(0)")
public WebElement cameraIcon;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take photo\")")
public WebElement takePhoto;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.camera2:id/shutter_button\")")
public WebElement cameraIcon1;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.camera2:id/done_button\")")
public WebElement right;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Save photo\")")
public WebElement savePhoto;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-0\")")
public WebElement namel;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-1\")")
public WebElement dropDown;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\")")
public WebElement selectCountry;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Philippines (+63)\")")
public WebElement selectPhilip;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-2\")")
public WebElement phoneNumber;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-sel-0\")")
public WebElement gender;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(63)")
public WebElement selectGendermale;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-4\")")
public WebElement password;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-5\")")
public WebElement cnfPassword;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-7\")")
public WebElement businessName;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-8\")")
public WebElement address;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-9\")")
public WebElement city;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-10\")")
public WebElement country;


@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-11\")")
public WebElement businessPhone;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Image\").instance(2)")
public WebElement agree;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Register\")")
public WebElement register;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 1\")")
public WebElement otp1;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(12)")
public WebElement HDPE;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Next\")")
public WebElement nextBtn;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-4\")")
public WebElement price;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Save material\")")
public WebElement saveMaterial;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(9)")
public WebElement color;


public ProcessorSignUp(AndroidDriver driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

public void signUpProcess() throws InterruptedException, IOException {
	
	PB_SignUp1 pb=new PB_SignUp1(pbDriver);
	english.click();
	continu.click();
	signBtn.click();
	//recycleBussiness.click();
	tap(500,1400);
	Thread.sleep(3000);
	processorSign.click();
	
	//camera
	cameraIcon.click();
	takePhoto.click();
	//permission.click();
	cameraIcon1.click();
	right.click();
	savePhoto.click();
	
	namel.sendKeys(generateRandomString(6));
	dropDown.click();
	Thread.sleep(4000);
	selectCountry.sendKeys("+63");
	Thread.sleep(3000);
	selectPhilip.click();
	
	 phoneNumber.click();
	 tap(264,2263);
	 tap(202,1955);
	 
		/*
		 * tap(640,1570); tap(640,1570); tap(350,1570); tap(640,1570); tap(350,1570);
		 * tap(350,1570);
		 */
	 
	 pb.generateNo();
	 tap(530,1450);
	 tap(859,1967);
	 scroll(770,1000,770,1300);
	 tap(930,1500);
	 gender.click();
	 selectGendermale.click();
	 password.sendKeys("123456a");
	 cnfPassword.sendKeys("123456a");
	 Thread.sleep(2000);
	 scroll(500,2000,500,500);
	 businessName.sendKeys(generateRandomString(8));
	 address.sendKeys("Himalya");
	 city.sendKeys("DElhi");
	 agree.click();
	 register.click();
	 otp1.click(); // Focus the first box
	 enterOtpWithADB("778899");	
	 //permissionFinal.click();
	 
	 
	 // Add material part
	 Thread.sleep(2000);
	 addmat.isDisplayed();
	 tap(981,450);
	 nextBtn.click();
	 Thread.sleep(3000);
	 //HDPE.click();
	 tap(100,760);
	 nextBtn.click();
	 
	 //condition
	 tap(110,1907);
	 nextBtn.click();
	 
	 //color.click();
	 tap(110,710);
	 nextBtn.click();
	 Thread.sleep(4000);
	 //tap(980,1310);
	
	 //price.click();
	 tap(200,1800);
	 Thread.sleep(2000);
	 //price.sendKeys("10");
	 pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	 pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	 
	 Thread.sleep(5000);
	
	 nextBtn.click();
	 
	 //saveMaterial.isDisplayed();
	 //saveMaterial.click();
	 tap(550,2040);
	
	
}

public void enterOtpWithADB(String otp) throws IOException {
    Runtime.getRuntime().exec("adb shell input text " + otp);
}
public static String generateRandomString(int length) {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    StringBuilder name = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
        name.append(chars.charAt(random.nextInt(chars.length())));
    }
    return name.toString();
}

public static String getRandomNumber() {
    Random random = new Random();
    int randomNo = random.nextInt(401) + 100; // 100–500
    return String.valueOf(randomNo);
}
	 
}
