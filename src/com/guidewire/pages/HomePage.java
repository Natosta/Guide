package com.guidewire.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

//import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.tests.Test.TestBase;



public class HomePage  extends BasePage
{
	  

	    // Policy Centre begin Here 
		@FindBy(xpath = "//span[@id='Desktop:DesktopMenuActions-btnEl']")
		 WebElement ActionMenu;
		
		@FindBy(id = "Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-itemEl")
		 WebElement Newaccount;	
		
		/*
		@FindBy(css = "#Desktop\\3a DesktopMenuActions\\3a DesktopMenuActions_Create\\3a DesktopMenuActions_NewAccount-textEl") 
		 WebElement Proceed;
		
		
		@FindBy(how=How.ID,using="id=TabBar:AccountTab-btnWrap")
		WebElement PolicyDrop;
		
		@FindBy(how=How.CSS,using="#Desktop\\3a DesktopMenuActions-btnInnerEl")
		WebElement policyBtn;
		
		@FindBy(how=How.CSS,using="#Desktop\\3a DesktopMenuActions\\3a DesktopMenuActions_Create\\3a DesktopMenuActions_NewSubmission-textEl")
		WebElement newSubmissionBtn;
		
		*/	
		

	static Logger log = Logger.getLogger(TestBase.class.getName());
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
		
	public HomePage ActionsSideMenu()
	{	 
		  
		ActionMenu.click();
	return new HomePage (driver);
	}	
	
	
    public HomePage CreateNewAccount()
   {	 
	  
      Newaccount.click();
    return new HomePage (driver);
   }	
		
  }
	
	   
	   
	
	

   /*
	
	public HomePage selectValue(String sValue)
	   {
	     Select oSelect = new Select(AdvertType);
	     oSelect.selectByVisibleText(sValue);
	     return new HomePage (driver);
	   }  
	*/

	
	
	
	
	
	
	
	
	
	
