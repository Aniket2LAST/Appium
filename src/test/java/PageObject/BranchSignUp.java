package PageObject;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;

public class BranchSignUp extends BaseClass {
	
	 public BranchSignUp(AndroidDriver driver) {
		    //    this.driver = driver;
		        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		    }

@AndroidFindBy(uiAutomator="new UiSelector().text(\"English\")")	
public WebElement english;	
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Continue\")")
public WebElement continu;	 
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Sign up\")")	
public WebElement signBtn;
  
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(15)")
public WebElement recycleBussiness;
  
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(13)")
public WebElement branch;
  
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Next\")")
public WebElement nextBtn;
  
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Add material\")")	
public WebElement addmat;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Image\").instance(0)")
public WebElement cameraicon;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take photo\")")
public WebElement takePhoto;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\")")
public WebElement permission;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.camera2:id/shutter_button\")")
public WebElement cameraIcon1;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.camera2:id/done_button\")")
public WebElement right;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Save photo\")")
public WebElement savePhoto; 

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement name;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"+1\")")
public WebElement dropDown;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\")")
public WebElement searchDropDown; 

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Philippines (+63)\")")
public WebElement selectPhilip;

@AndroidFindBy(xpath= "(//android.widget.EditText)[2]")
public WebElement phoneNumber;


@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\").instance(0)")
public WebElement gender;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(63)")
public WebElement selectGendermale;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(4)")
public WebElement password;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(5)")
public WebElement cnfPassword;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-7\")")
public WebElement businessName;

@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-21\")")
public WebElement businessName_1;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"1600 Amphitheatre Pkwy, Mountain View, CA 94043, USA\").instance(0)")
public WebElement address;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Mountain View\")")
public WebElement city;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"United States\")")
public WebElement country;


@AndroidFindBy(uiAutomator="new UiSelector().text(\"+1\")")
public WebElement businessPhone;

@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Image\").instance(2)")
public WebElement agree;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Register\")")
public WebElement register;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 1\")")
public WebElement otp1;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Add new material\")")
public WebElement addMaterial;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Save material\")")
public WebElement saveMaterial;
  

public void signUpBranch() throws InterruptedException, IOException {
	
	 try {
		 
		 if(english.isDisplayed()) {
			 english.click();
		 }
	 }catch(Exception ignored) {}
	 
	 try {
	        if (continu.isDisplayed()) {
	            continu.click();
	        }
	    } catch (Exception ignored) {}
	
	
	//english.click();
	//continu.click();
	signBtn.click();
	//recycleBussiness.click();
	tap(500,1400);
	Thread.sleep(2000);
	branch.click();
	
	//camera
	Thread.sleep(3000);
	//cameraicon.isDisplayed();
	//cameraicon.click();
	tap(680,618);
	
	
	takePhoto.click();
	//permission.click();
	Thread.sleep(3000);
	//cameraIcon1.click();
	tap(530,2230);
	//right.click();
	tap(540,2250);
	Thread.sleep(8000);
	savePhoto.click();
	Thread.sleep(8000);
	name.sendKeys(generateRandomString(6));
	dropDown.click();
	Thread.sleep(4000);
	searchDropDown.sendKeys("+63");
	Thread.sleep(3000);
	selectPhilip.click();
	
	 //phoneNumber.click();
	tap(500,1000);
	 tap(100,1517);
	 tap(400,1370);
	 generateNo();
	 tap(620,580);
	 tap(950,1110);
	 
	 scroll(770,1000,770,1300);
	 tap(930,1500);
	 //gender.click();
	 tap(980,1418);
	 selectGendermale.click();
	 password.sendKeys("123456a");
	 cnfPassword.sendKeys("123456a");
	 Thread.sleep(2000);
	 scroll(500,2000,500,500);
	 businessName.sendKeys(generateRandomString(8));
	 address.sendKeys("Himalya");
	 city.sendKeys("DElhi");
	 agree.click();
	 Thread.sleep(3000);
	 register.click();
	 otp1.click(); // Focus the first box
	 //enterOtpWithADB("778899");
	 
	 tap(100,1517);
	 tap(400,1370);
	 otpGenearte();
	 tap(620,425);
	 tap(942,942);
	 
	 
	 
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
		 addMaterial();
		 Thread.sleep(2000);
	
}


public void signUpBranch_1() throws InterruptedException, IOException {
	
 try {
		 
		 if(english.isDisplayed()) {
			 english.click();
		 }
	 }catch(Exception ignored) {}
	 
	 try {
	        if (continu.isDisplayed()) {
	            continu.click();
	        }
	    } catch (Exception ignored) {}
	
	
	//english.click();
	//continu.click();
	signBtn.click();
	//recycleBussiness.click();
	tap(500,1400);
	Thread.sleep(2000);
	branch.click();
	
	
	name.sendKeys(generateRandomString(6));
	dropDown.click();
	Thread.sleep(4000);
	searchDropDown.sendKeys("+63");
	Thread.sleep(3000);
	selectPhilip.click();
	
	 //phoneNumber.click();
	tap(500,1000);
	 tap(100,1517);
	 tap(400,1370);
	 generateNo();
	 tap(620,580);
	 tap(950,1110);
	 
	 scroll(770,1000,770,1300);
	 tap(930,1500);
	 //gender.click();
	 tap(980,1418);
	 selectGendermale.click();
	 password.sendKeys("123456a");
	 cnfPassword.sendKeys("123456a");
	 Thread.sleep(2000);
	 scroll(500,2000,500,500);
	 businessName_1.sendKeys(generateRandomString(8));
	 address.sendKeys("Himalya");
	 city.sendKeys("DElhi");
	 agree.click();
	 
      
		scroll(500,1790,500,1100);
	    //camera
		Thread.sleep(3000);
		//cameraicon.isDisplayed();
		//cameraicon.click();
		tap(680,618);
		
		
		takePhoto.click();
		//permission.click();
		Thread.sleep(3000);
		//cameraIcon1.click();
		tap(530,2230);
		//right.click();
		tap(540,2250);
		Thread.sleep(8000);
		savePhoto.click();
		
		scroll(500,1100,500,1790);
		
	 Thread.sleep(3000);
	 register.click();
	 otp1.click(); // Focus the first box
	 //enterOtpWithADB("778899");
	 
	 tap(100,1517);
	 tap(400,1370);
	 otpGenearte();
	 tap(620,425);
	 tap(942,942);
	 
	 
	 
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
		 addMaterial();
		 Thread.sleep(2000);
	
}
public void addMaterial() throws InterruptedException {
	addMaterial.click();
	tap(981,450);
	 nextBtn.click();
	 Thread.sleep(3000);
	 //HDPE.click();
	 tap(112,893);
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
	 Thread.sleep(3000);
	 saveMaterial.click();
	 Thread.sleep(7000);
	 //tap(550,2040);
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






}
