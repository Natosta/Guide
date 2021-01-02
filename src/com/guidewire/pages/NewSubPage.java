package com.guidewire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class NewSubPage extends BasePage {

	private static WebDriver driver;



	
    @FindBy(id = "AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl") 
	WebElement Submission;
	
	
	

   public NewSubPage(WebDriver driver) {
	
	super(driver);

   }

   public NewSubPage First() {
	   Submission.click();
	   return this;
   }
	  
	   
	   
  }
