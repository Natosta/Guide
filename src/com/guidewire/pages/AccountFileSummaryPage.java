package com.guidewire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountFileSummaryPage extends BasePage {
	
	static WebDriver driver;
	
	 @FindBy(id = "CreateAccount:CreateAccountScreen:Update-btnInnerEl") 
	 WebElement UpButton;
	
	 @FindBy(xpath = "//span[@id='AccountFile:AccountFileMenuActions-btnInnerEl']") 
	 WebElement SubmitNewAccuont;
	
	 
	
	 
	
    public AccountFileSummaryPage (WebDriver driver) {
		
		super(driver);		
    }
    
   
    
    public AccountFileSummaryPage ToNewAccount() {
    	UpButton.click();
   	   return new AccountFileSummaryPage(driver);
     }
      
    public AccountFileSummaryPage CreateAcct() {
    	SubmitNewAccuont.click();
   	   return new AccountFileSummaryPage(driver);
     }
      
}
    
    
    