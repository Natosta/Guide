package com.guidewire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountDetailsPage extends BasePage {

	private static WebDriver driver;
	
	
	
	
	
	@FindBy(xpath = "//input[@name='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName']") 
	 WebElement FirstName;
	
	
	@FindBy(xpath = "//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']") 
	 WebElement SurnNmae;
		
	@FindBy(xpath = "//*[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\"]")
	 WebElement PostCode;
		
	@FindBy(xpath = "//a[@class='bigButton']")
	 WebElement Search;
		
	@FindBy(xpath = "//span[@id='NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl']")
	 WebElement Create;
	
	@FindBy(xpath = "//a[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-itemEl']")
	 WebElement Person;
			
	
	
   public AccountDetailsPage(WebDriver driver)
   {
		
		super(driver);
	
   }

   public AccountDetailsPage First() 
   {
	   FirstName.sendKeys("Mike");
	   return this;
   }

   
   public AccountDetailsPage Second()
   {
	   SurnNmae.sendKeys("Tan");
	   return this;
   }

   public AccountDetailsPage PostCode()
   {
	   PostCode.sendKeys("NE65 0GR");
	   return this;
   }
   
   
   public AccountDetailsPage Src() 
   {
	   Search.click();
	   return this;
   }
   

   public AccountDetailsPage CreateUser() 
   {
	   Create.click();
	   return this;
   }

   public CreateAccountPage ClickPerson() {
	   Person.click();
	   return new CreateAccountPage(driver);
   }
}
