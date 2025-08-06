package PageObject;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseClass;



public class PB_SignUp1 extends BaseClass {
   
	  public PB_SignUp1(AndroidDriver driver) {
		    //    this.driver = driver;
		        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		    }
	  
	  
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
 
 
	  
 @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Sign up\")")
 public WebElement SignUpbtn;
 
 @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(13)")
 public WebElement Collectorl;
 
 @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-1\")")
 public WebElement name;
 
 @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-2\")")
 public WebElement dropDown;
 
 @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\")")
public WebElement searchDropDown; 
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Philippines (+63)\")")
 public WebElement selectPhilip; 
 
 @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-3\")")
 public WebElement phoneNumber;
 
 @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-sel-0\")")
 public WebElement gender;
 
 @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(66)")
 public WebElement selectGendermale;
 
 @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-5\")")
 public WebElement password;
 
 @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"ion-input-6\")")
 public WebElement cnfPassword;
 
 @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Image\").instance(5)")
 public WebElement agree;
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Register\")")
 public WebElement register;
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 1\")")
 public WebElement otp1;
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 2\")")
 public WebElement otp2;
 
 @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Continue\")")
 public WebElement continueb;
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 3\")")
 public WebElement otp3;
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 4\")")
 public WebElement otp4;
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 5\")")
 public WebElement otp5;
 
 @AndroidFindBy(uiAutomator="new UiSelector().text(\"Please enter OTP character 6\")")
 public WebElement otp6;
 
 
	/*
	 * new UiSelector().text("Please enter OTP character 1") new
	 * UiSelector().text("Please enter OTP character 2") new
	 * UiSelector().text("Please enter OTP character 3") new
	 * UiSelector().text("Please enter OTP character 4") new
	 * UiSelector().text("Please enter OTP character 5") new
	 * UiSelector().text("Please enter OTP character 6")
	 * 
	 */
 
 @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")
 public WebElement permissionFinal;
 
 public void SignUpCollector() throws InterruptedException, IOException {
	 continueb.click();
	 SignUpbtn.click();
	 Collectorl.click();
	 
	// cameraicon.click();
	 tap(682,617);
	 
	 takePhoto.click();
	 //permission.click();
	 cameraIcon1.click();
	 right.click();
	 savePhoto.click();
	 
	 name.click();
	 name.sendKeys(generateRandomString(7));
	 dropDown.click();
	 Thread.sleep(4000);
	 searchDropDown.sendKeys("+63");
	 selectPhilip.click();
	 phoneNumber.click();
	 tap(264,2263);
	 tap(202,1955);
	 
		/*
		 * tap(640,1570); tap(640,1570); tap(350,1570); tap(640,1570); tap(350,1570);
		 * tap(350,1570);
		 */
	 generateNo();
	 
	 tap(859,1967);
	 scroll(770,1000,770,1300);
	 tap(930,1500);
	 gender.click();
	 selectGendermale.click();
	 password.sendKeys("123456a");
	 cnfPassword.sendKeys("123456a");
	 scroll(500,1700,500,2000);
	 agree.click();
	 register.click();
	 otp1.click(); // Focus the first box
	 enterOtpWithADB("778899");	
	 //permissionFinal.click();
 }
 public void enterOtpWithADB(String otp) throws IOException {
	    Runtime.getRuntime().exec("adb shell input text " + otp);
	}
 public static String generateRandomOTP() {
     Random rand = new Random();
     int otp = 100000 + rand.nextInt(900000); // ensures 6-digit (100000 to 999999)
     return String.valueOf(otp);
 }

 // Method to copy to clipboard
 public static void copyToClipboard(String number) {
     StringSelection selection = new StringSelection(number);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
 }
 

 public void generateNo() throws InterruptedException {
	 
	 Set<Integer> sixDigitNumbers = new HashSet<>();
     Random random = new Random();

     // Generate 5 unique 6-digit numbers
     while (sixDigitNumbers.size() < 5) {
         int number = 100000 + random.nextInt(900000); // 100000–999999
         String strNO = String.valueOf(number);
         copyToClipboard(strNO);
         sixDigitNumbers.add(number);
     }

     // Print the generated numbers
     System.out.println("6-digit numbers: " + sixDigitNumbers);
     tap(540,1450);
 }
	 
	 
	 
	/*
	 * Set<Integer> phoneNo = generateRandomOTP(); copyToClipboard(phoneNo);
	 * System.out.println("Generated OTP copied to clipboard: " + phoneNo);
	 * tap(540,1450);
	 */
 
 
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
 
 

