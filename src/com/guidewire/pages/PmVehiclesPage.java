package com.guidewire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.policy.pages.PMVehiclesPage;
import com.policy.pages.RiskAnalysisPage;

import basePage.BasePage;

public class PmVehiclesPage extends BasePage{

	static WebDriver driver;
	
	
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel_tb:Add-btnInnerEl\"]") 
	 WebElement AddPm;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RegistrationNumber-inputEl\"]") 
	 WebElement Reg;	

	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:SecurityDevices-trigger-picker\"]") 
	 WebElement SecurityDeviceDW;
	
	@FindBy(xpath = "//li[normalize-space()='None']") 
	WebElement SelecteSecurityDevice;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:SecurityTracker_false-inputEl\"]") 
	 WebElement SecurityTracker;	

	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:MarketValue-inputEl\"]") 
	 WebElement MarketValue;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:HasBeenModified_false-inputEl\"]") 
	 WebElement CarMordified;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:DayTimeParking-trigger-picker\"]") 
	 WebElement DayTimeParkDW;
	
	@FindBy(xpath = "//li[normalize-space()='Secure Car Park']") 
	 WebElement DayTimePark;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:NightTimeParking-trigger-picker\"]") 
	 WebElement NightTimeParkDW;
		
	@FindBy(xpath = "//li[normalize-space()='Garaged Overnight']") 
	 WebElement GarageParking;
		
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:PersonalMotor_AssignDriversDV:MainDriverLV_tb:AddDriver-btnInnerEl\"]") 
	 WebElement AddDriverToVehicleDW;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:PersonalMotor_AssignDriversDV:MainDriverLV_tb:AddDriver:0:Driver-itemEl\"]") 
	 WebElement SelectDriver;
	
	@FindBy(xpath = "//*[@id=\"ext-element-1044\"]")
	 WebElement AddDriverCheckBox;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:MonthPurchased-trigger-picker\"]") 
	 WebElement MonthDW;
	
	@FindBy(xpath = "//li[normalize-space()='January']") 
	 WebElement SelectMonth;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:YearPurchased-inputEl\"]") 
	 WebElement CarYear;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:ClassOfUse-trigger-picker\"]") 
	 WebElement HowCarIsUsedDW;
	
	@FindBy(xpath = "//li[normalize-space()='Social Domestic and Pleasure only (including commuting)']") 
	 WebElement SelectHowCarIsUsed;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RegisteredKeeper_true-inputEl\"]") 
	 WebElement RegisteredKeeper;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RightHandDrive_true-inputEl\"]") 
	 WebElement CarRightHand;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:Imported_false-inputEl\"]") 
	 WebElement CarImported;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:LessThanEightSeats_true-inputEl\"]") 
	 WebElement LessThan8Seat;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:ProductMiles-trigger-picker\"]") 
	 WebElement ProductMilesDW;
	
	@FindBy(xpath = "//li[normalize-space()='10000']") 
	 WebElement EnterMiles;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:AnnualMileage-inputEl\"]") 
	 WebElement ExpectedMiles;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:VoluntaryExcess-trigger-picker\"]") 
	 WebElement VolExcDW;
	
	@FindBy(xpath = "//li[normalize-space()='400']") 
	 WebElement EnterVolExcDW;

	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:NCDYears-trigger-picker\"]") 
	 WebElement NcdDW;
	
	@FindBy(xpath = "//li[normalize-space()='3']") 
	 WebElement SelectNCD;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:NCDProtection_false-inputEl\"]") 
	 WebElement ProtectNCD;
	
	@FindBy(xpath = "//*[@id=\"SubmissionWizard:Next-btnInnerEl\"]") 
	WebElement NextButt;
	
	
    public PmVehiclesPage (WebDriver driver) {
		
		super(driver);	
  }

	
	  public PMVehiclesPage AddVehicles() {
         AddPm.click();
	  return new PMVehiclesPage(driver);
	  }  
	    
	  
	  public PMVehiclesPage EnterVehicleReg() {
		  Reg.sendKeys("KR55JYU");
	  return new PMVehiclesPage(driver);
	  }  
		   
	  
	  public PMVehiclesPage SecurityDevice() {
		  SecurityDeviceDW.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage AddDevice() {
		  SelecteSecurityDevice.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage SecuTracker() {
		  SecurityTracker.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage VehicleValue() {
		  MarketValue.sendKeys("2000");
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage Modified() {
		  CarMordified.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage DayParking() {
		  DayTimeParkDW.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage SelectDayPark() {
		  DayTimePark.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage NightPark() {
		  NightTimeParkDW.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage NightParking() {
		  GarageParking.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage AddDriversToVH() {
		  AddDriverToVehicleDW.click();
	  return new PMVehiclesPage(driver);
	  }  
		    
	  public PMVehiclesPage ChooseDriver() {
		  SelectDriver.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage DriverCheckBox() {
		  AddDriverCheckBox.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage YearBought() {
		  MonthDW.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage MonthBought() {
		  SelectMonth.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage YearBoughtCar() {
		  CarYear.sendKeys("2016");
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage HowDoUseYourCar() {
		  HowCarIsUsedDW.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage TellUs() {
		  SelectHowCarIsUsed.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage CarOwner() {
		  RegisteredKeeper.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage Keeper() {
		  RegisteredKeeper.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage DrivingHand() {
		  CarRightHand.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage Imported() {
		  CarImported.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage Seats() {
		  LessThan8Seat.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage ProdMiles() {
		  ProductMilesDW.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage SelectMiles() {
		  EnterMiles.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage DriverMiles() {
		  ExpectedMiles.sendKeys("10000");
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage VolExcess() {
		  VolExcDW.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage EnterVolAmount() {
		  EnterVolExcDW.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage NCD() {
		  NcdDW.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage AddNCD() {
		  SelectNCD.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public PMVehiclesPage CoverNCD() {
		  ProtectNCD.click();
	  return new PMVehiclesPage(driver);
	  }  
	  
	  public RiskAnalysisPage RiskCheck() {
		  NextButt.click();
	  return new RiskAnalysisPage(driver);
	  } 
}
	//  public QuotePage GetQuote() {
	//	  Vali.click();
	//  return new QuotePage(driver);
	    

