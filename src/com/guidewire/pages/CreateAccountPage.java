package com.guidewire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class CreateAccountPage extends BasePage {

	private static WebDriver driver;
	 {

}
	 	 
	 @FindBy(xpath = "//*[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:Brand-inputEl\"]") 
	 WebElement Dropdown;
	 
	 @FindBy(xpath = "//li[normalize-space()='Insure The Box']") 
	 WebElement PickBrand;
			
	 @FindBy(id = "CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:PrimaryPhone-inputEl") 
	 WebElement PrimaryPhoneType;
	 
	 @FindBy(xpath = "//li[normalize-space()='Mobile']") 
	 WebElement SeletPriPhone;	 
	
	 @FindBy(xpath = "//*[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl\"]") 
	  WebElement Mobile;
	 		 
	 @FindBy(id = "CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:EmailAddress1-inputEl") 
	 WebElement Email;
		
	 @FindBy(id = "CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl") 
	 WebElement EnterPostCode;	 
		 	 	 	 
	 @FindBy(id = "CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode:AutoFillIcon") 
	 WebElement SearchPostCode1;
	 	 
	 @FindBy(id = "CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:addresses-trigger-picker") 
	 WebElement AddDropDown;
	 	 
	 
	 @FindBy(xpath = "//li[normalize-space()='4 Bamburgh Close, Amble, Morpeth, Northumberland, NE65 0GR']") 
	 WebElement SelectAddress1;
	 
	 
	 @FindBy(id = "CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-trigger-picker") 
	 WebElement GarageAddressDropDown;
	 
	 
	 @FindBy(id = "CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-trigger-picker") 
	 WebElement SelectAddress;
	 
	
	 @FindBy(xpath = "//li[normalize-space()='Correspondence Address']") 
	 WebElement Correspondence;	
	 	  

	@FindBy(xpath = "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode:AutoFillIcon']") 
	 WebElement Add;
	
	
	@FindBy(xpath = "//*[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer-inputEl\"]") 
	 WebElement Ins;
	
	
	@FindBy(xpath = "//*[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization\"]") 
	 WebElement Srch;
	

	@FindBy(xpath = "//input[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:addresses-inputEl']") 
	 WebElement Select1;
		
			   
	 public CreateAccountPage(WebDriver driver) {
			
			super(driver);	
	  }	  	 	 
	  
 					 
	/* 
	 public void selectBrandType(String Brand)
		{
			//logger.info(format("%s - going to select IncidentType option :"+option, getName()));
			GuideWireAccessors.selectOptionFromGWDropDown(driver,Brand, this.primaryBrandDropdown(),1);
	 }	 			 	 	 
	 
	*/
	 
	 
	 public CreateAccountPage DropType() {
		 Dropdown.click();		
	 return new CreateAccountPage(driver);
	 }
	 	 	  	 
	 public CreateAccountPage TakeBrand() {
		 PickBrand.click();		
	 return new CreateAccountPage(driver);
	 }
	 	  
	 public CreateAccountPage PPhone() {
		 PrimaryPhoneType.click();
		   return new CreateAccountPage(driver);
	 } 
	 
	 public CreateAccountPage Sphone() {
		 SeletPriPhone.click();
		   return new CreateAccountPage(driver);
	 }
	 
	 public CreateAccountPage Mob() {
		 Mobile.sendKeys("07947490081");
		   return new CreateAccountPage(driver);
	 }

	 public CreateAccountPage EnterEmail() {
		 Email.sendKeys("Testttt@gmail.com");
		   return new CreateAccountPage(driver);
	 }
	 
	 public CreateAccountPage ReEnterPostcode() {
		 EnterPostCode.sendKeys("Ne8 1pj");
		   return new CreateAccountPage(driver);
	 }
	 
	 public CreateAccountPage ClickSearch1() {
		 SearchPostCode1.click();
		   return new CreateAccountPage(driver);
	 }
	 
	 public CreateAccountPage AddressDropDown() {
		 AddDropDown.click();
		   return new CreateAccountPage(driver);
	 }
	 
	 
	 public CreateAccountPage AddressDropDownList() {
		 SelectAddress1.click();
		   return new CreateAccountPage(driver);
	 }
	 
	 
	 
	 public CreateAccountPage GarageDDList() {
		 GarageAddressDropDown.click();
		   return new CreateAccountPage(driver);
	 }
	  
	 	 
    public CreateAccountPage SelectCorrespondence() {
	 Correspondence.click();
	   return new CreateAccountPage(driver);
  }
  

	 
	 public CreateAccountPage SelectAddFromList() {
		 SelectAddress.click();
		   return new CreateAccountPage(driver);
	 }
	 	 	
	 
/*
	 public CreateAccountPage Search() {
		SearchPostCode.sendKeys("10 The Brow Newcastle upon tyne, Tyne & wear NE6 2FL");
		   return new CreateAccountPage(driver);
	 }

	*/	 
	 
	 public CreateAccountPage Address()
	   {
	     Add.click();
	     return new CreateAccountPage(driver);
	   }	
	 
	 
	  
	 public CreateAccountPage selectValue1(String sValue)
	   {
	     Select oSelect = new Select(Add);
	     oSelect.selectByVisibleText(sValue);
	     return new CreateAccountPage (driver);
	   }		 
	 	 
	 public CreateAccountPage Producer()
	   {
	     Ins.click();
	     return new CreateAccountPage(driver);
	   }	
	 
	 public CreateAccountPage Src()
	   {
	     Srch.click();
	     return new CreateAccountPage(driver);
	   }	
	 
	 
	 public CreateAccountPage input()
	   {
	     Srch.click();
	     return new CreateAccountPage(driver);
	   }	
	 
	  
	 
	 
}