package AlchemyPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseClass;

public class Order_Bonus_AddPaage extends BaseClass {

	@FindBy(xpath="//div[@class='sidebar-item ng-star-inserted'][5]")
	public WebElement orders;
	
	@FindBy(xpath="//a[text()='Orders']")
	public WebElement orders_Link;
	
	@FindBy(xpath="//div[@class='pb-add-button fixed ng-star-inserted']")
	public WebElement add_Bonus;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement name_Txt;
	
	@FindBy(xpath="//Select[@name='country']")
	public WebElement country_Select;
	
	@FindBy(xpath="//input[@id='brand']")
	public WebElement brand;
	
	@FindBy(xpath="//input[@class='d-block w-100 text-center ng-valid ng-dirty ng-touched']")
	public WebElement total_Weight;
	
	@FindBy(xpath="//input[@class='d-block w-100 text-center ng-untouched ng-pristine ng-valid']")
	public WebElement member_Bonus;
	
	@FindBy(xpath="(//input[@class='d-block w-100 text-center ng-pristine ng-valid ng-touched'])[1]")
	public WebElement processor_Bonus;
	
	@FindBy(xpath="//label[text()='Branch bonus/kg']/parent::div//input")
	public WebElement branch_Bonus;
	
	@FindBy(xpath="//input[@class='d-block w-100 text-center ng-pristine ng-valid ng-touched']")
	public WebElement monthly_Bonus;
	
	@FindBy(xpath="//input[@placeholder='Input a reference ID for this order']")
	public WebElement reference_ID;
	
	@FindBy(xpath="(//div[@class='add-button-primary-green-icon me-2'])[1]")
	public WebElement assign_Processor;
	
	@FindBy(xpath="(//div[@class='add-button-primary-green-icon me-2'])[2]")
	public WebElement assign_Branch;
	
	@FindBy(xpath="//button[@class='pb-button green']")
	public WebElement create;
	
	public void add_Bonus() {
		orders.click();
		orders_Link.click();
		add_Bonus.click();
		name_Txt.sendKeys("Satya_Bonus");
		
	Select select = new Select(country_Select);

	select.selectByVisibleText("Philippines");
	
	  brand.sendKeys("Plastic");
	  total_Weight.sendKeys("50000");
	  member_Bonus.sendKeys("7");
	  processor_Bonus.sendKeys("0");
	  branch_Bonus.sendKeys("2");
	  monthly_Bonus.sendKeys("10");
	  reference_ID.sendKeys("12add");
	  assign_Processor.click();
	  
	}
	
}
