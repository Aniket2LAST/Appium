package AlchemyPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BranchSetUp extends BaseClass {

	@FindBy(xpath="//div[@class='sidebar-item ng-star-inserted'][8]")
	public WebElement branch;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	public WebElement Searchname;
	
	@FindBy(xpath="//div[contains(text(),'bn aniket')]")
	public WebElement selectName;
	
	@FindBy(xpath="//span[contains(text(),'Edit')]")
	public WebElement Edit;
	
	@FindBy(xpath="//div[text()=' Branch Owner ']")
	public WebElement BranchOwner;
	
	@FindBy(xpath="//label[text()='Bonus Eligible']")
	public WebElement bonus_Eligible; 
	
	@FindBy(xpath="//span[@class='mdl-switch__focus-helper']")
	public WebElement off;
	
	@FindBy(xpath="//input[@name='mmbl']")
	public WebElement bonus_Txt;
	
	@FindBy(xpath="//div[contains(text(),'Save')]")
	public WebElement save;
public BranchSetUp(WebDriver alcDriver) {
	
	PageFactory.initElements(alcDriver, this);
	}
public void branch_Bonus() throws InterruptedException {
	branch.click();
    waitForLoader();
	Searchname.isDisplayed();
	Searchname.click();
	Searchname.sendKeys("bn aniket");
	selectName.click();
	
	BranchOwner.click();
	waitForLoader();
	Edit.click();
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) alcDriver;
	js.executeScript("arguments[0].scrollIntoView(true);", save);
	Thread.sleep(5000);
	bonus_Eligible.click();
	Thread.sleep(5000);
	off.click();
	Thread.sleep(5000);
	bonus_Txt.clear();
	Thread.sleep(5000);
	bonus_Txt.sendKeys("89999");
	Thread.sleep(5000);
	save.click();
	
}
	
	
}
