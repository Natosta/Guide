package com.guidewire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.policy.pages.DriversPage;
import basePage.BasePage;

public class PolicyIfPage extends BasePage
{
	
	static WebDriver driver;


   @FindBy(xpath = "//a[@itemindex='0']") 
	 WebElement SelectProduct;

   @FindBy(id = "SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:MarketingQuestionInputSet:MarketingQuestion-trigger-picker") 
	 WebElement Product;
 
   @FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:MarketingQuestionInputSet:MarketingQuestion-trigger-picker\"]") 
 	 WebElement WhereDidYouHear;

   @FindBy(xpath = "//li[normalize-space()='Radio']") 
 	 WebElement SelectHowYouHeard;
   
   @FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:RateAsOfDate-trigger-picker\"]") 
	 WebElement DateTime;
   
   @FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:RateAsOfDate-inputEl\"]") 
	 WebElement Times;
	
   @FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']") 
	 WebElement NextButt;
   



   public PolicyIfPage(WebDriver driver) {

	super(driver);
   }

   public PolicyIfPage ProdSelect() {
	   SelectProduct.click();
		   return this;   
	   
   }
   
   public PolicyIfPage HearAboutDD() {
	   WhereDidYouHear.click();
		   return this;   
	   
   }
   
   public PolicyIfPage SelectAboutUs() {
	   SelectHowYouHeard.click();
		   return this;   	   
   }
   
   
   public DriversPage EnterDate() {
	   DateTime.click();
	   return new DriversPage(driver);  	   
   }
   
   
   public DriversPage Enter() {
	   Times.click();
	   return new DriversPage(driver);  	   
   }
   
 //*[@id="ext-element-22"]

   public DriversPage Proceed() {
	   NextButt.click();
	   return new DriversPage(driver);  
	   
   }
   

   
}
   
   
   
   