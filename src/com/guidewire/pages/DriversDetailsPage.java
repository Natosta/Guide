package com.guidewire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.policy.pages.DriversPage;
import com.policy.pages.PMVehiclesPage;

import basePage.BasePage;

public class DriversDetailsPage extends BasePage  {

	static WebDriver driver;
	
	
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver") 
	 WebElement AddDriver;
		
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact\"]") 
	 WebElement ExistingDriver;
		
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:0:UnassignedDriver-textEl\"]") 
	 WebElement AddDriver1;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Prefix-inputEl\"]") 
	 WebElement Title;
	
	@FindBy(xpath = "//li[normalize-space()='Mr.']") 
	 WebElement TitleType;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl\"]") 
	 WebElement Dob;
		
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Gender-trigger-picker\"]") 
	 WebElement Gender;
	
	@FindBy(xpath = "//li[normalize-space()='Male']") 
	 WebElement GenderType;
	  
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Occupation-trigger-picker\"]") 
	 WebElement Occupation;
	
	@FindBy(xpath = "//li[normalize-space()='Male']") 
	 WebElement OccupationType;
		
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-trigger-picker\"]") 
	 WebElement MaritalStatus;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Gender-trigger-picker\"]") 
	 WebElement GenderDW;
	
	@FindBy(xpath = "//li[normalize-space()='Male']") 
	 WebElement SelectGender;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Occupation-trigger-picker\"]") 
	 WebElement OccupationDW;
	
	@FindBy(xpath = "//li[normalize-space()='Actor']") 
	 WebElement SelectOccpation;
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-trigger-picker\"]") 
	 WebElement SltMarital;
	
	@FindBy(xpath = "//li[normalize-space()='Civil Partnership']") 
	 WebElement Married;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:UKResident5Years_true-inputEl\"]") 
	 WebElement Resident5yrs;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Homeowner_true-inputEl\"]") 
	 WebElement OwnHome;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab-btnInnerEl\"]") 
	 WebElement Roles;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:LicenseType-trigger-picker\"]") 
	 WebElement LicenceType;
	
	@FindBy(xpath = "//li[normalize-space()='Full UK Licence']") 
	 WebElement SelectLicence;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:PassedTest10Years_true-inputEl\"]") 
	 WebElement LicenceMoreThan10Years;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:AccessToOtherVehicles_false-inputEl\"]") 
	 WebElement OtherVehilcles;
		
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:DrivingQualifications-trigger-picker\"]") 
	 WebElement AdditionalDrivingQuali;
		
	@FindBy(xpath = "//li[normalize-space()='Pass Plus']") 
	 WebElement SelectAdditionalDrivingQuali;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MedicalConditions-trigger-picker\"]") 
	 WebElement MedicalConditionDW;
	
	
	@FindBy(xpath = "//li[normalize-space()='DVLA aware - No licence restriction']") 
	 WebElement ConditionAffectingYou;
	
	
	@FindBy(xpath = "//li[normalize-space()='Pass Plus']") 
	 WebElement AdditionalDriving;
	
	
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:CancelledPreviousInsurance_false-inputEl\"]") 
	 WebElement NoConvition;
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:NonMotoringConvictions_false-inputEl\"]") 
	 WebElement NonMotoringOffences;
	
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:CancelledPreviousInsurance_false-inputEl\"]") 
	 WebElement InsuranceCancelled;
	
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MotorClaims_false-inputEl\"]") 
	 WebElement MotoringClaims;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MotorConvictions_false-inputEl\"]") 
	 WebElement MotoringConvictions;
	
	@FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']") 
	 WebElement ToPmPage;
	
	

	
	
	//*[@id="SubmissionWizard:Next-btnInnerEl"]
	
	
    public DriversDetailsPage(WebDriver driver) {
		
		super(driver);	
  }

	
    public DriversPage AddDriverDDW() {
    	AddDriver.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage AddExDriver() {
    	ExistingDriver.click();
   	   return new DriversPage(driver);
     }  
    

    public DriversPage SelectDriver() {
    	AddDriver1.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage TitleDropDw() {
    	Title.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage SelectTitle() {
    	TitleType.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage EnterDob() {
    	Dob.sendKeys("29/06/1987");
   	   return new DriversPage(driver);
     }  
    
    public DriversPage SelectGenderType() {
    	Gender.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage GenderTy() {
    	 SelectGender.click();
   	   return new DriversPage(driver);
     }  
    
  
    public DriversPage Job() {
    	OccupationDW.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage JobType() {
    	SelectOccpation.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage MaritalStatus() {
    	SltMarital.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage SelectMarried() {
    	Married.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage Residency() {
    	Resident5yrs.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage HomeOwnerShip() {
    	OwnHome.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage NextTab() {
    	Roles.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage Licence() {
    	LicenceType.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage UKLicence() {
    	SelectLicence.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage LicenceTerm() {
    	LicenceMoreThan10Years.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage AccessToOtherVehicles() {
    	OtherVehilcles.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage SltQualification() {
    	AdditionalDrivingQuali.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage AddQualification() {
    	SelectAdditionalDrivingQuali.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage ConditionType() {
    	MedicalConditionDW.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage NoCondition() {
    	ConditionAffectingYou.click();
   	   return new DriversPage(driver);
     }  
    

    public DriversPage SelectCondition() {
    	AdditionalDriving.click();
   	   return new DriversPage(driver);
     }  
    
    
    public DriversPage NoConvict() {
    	NoConvition.click();
   	   return new DriversPage(driver);
     }  
    
    
    
    

    
    public DriversPage TypeOfMotorOffence() {
    	NonMotoringOffences.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage Insurance() {
    	InsuranceCancelled.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage Claims() {
    	MotoringClaims.click();
   	   return new DriversPage(driver);
     }  
    
    public DriversPage Convictions() {
    	MotoringConvictions.click();
   	   return new DriversPage(driver);
     }  
    
    public PMVehiclesPage PM() {
    	ToPmPage.click();
   	   return new PMVehiclesPage(driver);
     }  
    
}
    
    
    
    
    
    
    
    
    
    
    
    