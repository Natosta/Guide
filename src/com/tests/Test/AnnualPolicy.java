package com.tests.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guidewire.pages.AccountFileSummaryPage;
import com.guidewire.pages.CreateAccountPage;
import com.guidewire.pages.DriversDetailsPage;
import com.guidewire.pages.AccountDetailsPage;
import com.guidewire.pages.HomePage;
import com.guidewire.pages.LoginPage;
import com.guidewire.pages.NewSubPage;
import com.guidewire.pages.PmVehiclesPage;
import com.guidewire.pages.PolicyIfPage;
import com.policy.pages.NewSubmissionsPage;


public class AnnualPolicy extends TestBase
{
	
	@Test //(priority=1)
	// login into Guid_ewire
	public void IssueAnnualPolicy() throws InterruptedException
	{
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	
		Thread.sleep(4000);
		login.login("su", "gw");
	    //Assert.assertEquals("The submitted user name/password is invalid.", "ErroMessage");

	   //Assert.assertEquals(login.getTilte(), "DEV mode - 9.0.5.326] Policy Centre");
	
		Thread.sleep(2000);
		HomePage Home = PageFactory.initElements(driver, HomePage.class);	
		Thread.sleep(2000);
		Home.ActionsSideMenu();
		Home.CreateNewAccount();
		
		AccountDetailsPage Enter = PageFactory.initElements(driver, AccountDetailsPage.class);
		
		Enter.First();
		Enter.Second();
		Enter.PostCode();
		Enter.Src();
		Enter.CreateUser();
		Enter.ClickPerson();
		
	//	System.out.print("Test + Passed");
		
		CreateAccountPage Account = PageFactory.initElements(driver, CreateAccountPage.class);
		
		Account.DropType();
		Account.TakeBrand();
		Thread.sleep(2000);
		Account.PPhone();
		Thread.sleep(2000);
		Account.Sphone();
		Thread.sleep(2000);
		Account.Mob();
		Account.EnterEmail();
	//	Account.ReEnterPostcode();
		Account.ClickSearch1();
		Account.AddressDropDown();
		Account.AddressDropDownList();
		Thread.sleep(2000);
		Account.GarageDDList();
		Account.SelectCorrespondence();
		Account.SelectAddFromList();
		Account.Address();
		
		AccountFileSummaryPage New = PageFactory.initElements(driver, AccountFileSummaryPage.class);
		Thread.sleep(3000);
		New.ToNewAccount();
		New.CreateAcct();
		
				
		NewSubPage Submit = PageFactory.initElements(driver, NewSubPage.class);
		Thread.sleep(2000);
		Submit.First();
	
		
		PolicyIfPage MotoAndInfo = PageFactory.initElements(driver, PolicyIfPage.class);
		Thread.sleep(1000);
		MotoAndInfo.ProdSelect();
		MotoAndInfo.HearAboutDD();
		MotoAndInfo.SelectAboutUs();
		MotoAndInfo.EnterDate();
		MotoAndInfo.Enter();
		MotoAndInfo.Proceed();
		
		
		DriversDetailsPage Drivers = PageFactory.initElements(driver, DriversDetailsPage.class);
		Thread.sleep(1000);
		
		Drivers.AddDriverDDW();
		Drivers.AddExDriver();
		Drivers.SelectDriver();
		Drivers.TitleDropDw();
		Drivers.SelectTitle();
		Drivers.EnterDob();
		Drivers.SelectGenderType();
		Drivers.GenderTy();
		Drivers.Job();
		Drivers.JobType();
		Drivers.MaritalStatus();
		Drivers.SelectMarried();
		Drivers.Residency();
		Thread.sleep(1000);
		Drivers.HomeOwnerShip();
		Drivers.NextTab();
		Drivers.Licence();
		Drivers.UKLicence();
		Thread.sleep(1000);
		Drivers.LicenceTerm();
		Thread.sleep(2000);
		Drivers.AccessToOtherVehicles();
		Drivers.SltQualification();
		Drivers.AddQualification();
		Thread.sleep(2000);
		Drivers.ConditionType();
		Thread.sleep(1000);
		Drivers.NoCondition();
		Thread.sleep(2000);		
	//	Drivers.SelectCondition();	
		Thread.sleep(2000);
		Drivers.NoConvict();
		Drivers.TypeOfMotorOffence();
		Drivers.Insurance();
		Drivers.Claims();
		Thread.sleep(1000);
		Drivers.Convictions();
		Thread.sleep(2000);
		Drivers.PM();
				
		PmVehiclesPage Vehicle = PageFactory.initElements(driver, PmVehiclesPage.class);
		Vehicle.AddVehicles();
		Vehicle.EnterVehicleReg();
		Vehicle.SecurityDevice();
		
		Thread.sleep(4000);
		Vehicle.SecurityDevice();
		Vehicle.AddDevice();
		Vehicle.SecuTracker();
		Vehicle.VehicleValue();
		Vehicle.Modified();
		Thread.sleep(2000);
		Vehicle.DayParking();
		Vehicle.SelectDayPark();
		Vehicle.NightPark();
		Vehicle.NightParking();
		Vehicle.AddDriversToVH();
		Vehicle.ChooseDriver();
		Thread.sleep(2000);
		Vehicle.DriverCheckBox();
		Vehicle.YearBought();	`
		Vehicle.MonthBought();
		Vehicle.YearBoughtCar();
		Vehicle.HowDoUseYourCar();
		Vehicle.TellUs();
		Vehicle.CarOwner();
		Vehicle.Keeper();
		Vehicle.DrivingHand();
		Vehicle.Imported();
		Vehicle.Seats();
		Vehicle.ProdMiles();
		Vehicle.SelectMiles();
		
	
		
		
		
		
			
		
		
		
		
		
	    /*
        logger.log(LogStatus.INFO, "Logged in to Intranet + Successfully");
	    Assert.assertTrue(login.isLoginSuccessful("Ten Dev/QA PM"), "This login is not Valid mate");
        Assert.assertEquals(login.getTilte(), "Pages - My Northumbria");
        System.out.print("Test 01 Passed = Page title verified successfully");
        
        boolean CalenderIcon = driver.findElement(By.xpath("//i[@class='material-icons']")).isDisplayed();
        assertTrue(CalenderIcon, "Icon is Present");
        System.out.print("Test 02 Passed = Calender Icon is Displayed");
		logger.log(LogStatus.PASS, "Page title verified successfully");
        
       */
        
     
	}

}
