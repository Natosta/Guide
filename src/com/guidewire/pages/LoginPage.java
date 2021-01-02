package com.guidewire.pages;


import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.Test.TestBase;

public class LoginPage extends BasePage
{
	
   static Logger log = Logger.getLogger(TestBase.class.getName());
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Login:LoginScreen:LoginFormMessage\"]")
	WebElement ErroMessage;
	

	
	@FindBy(how=How.XPATH,using="//*[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]")
	WebElement userName;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")
	WebElement passwordField;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]")
	WebElement HomePageLoginButton;
	


	
	@FindBy(how=How.LINK_TEXT,using="Forgotten Password?")
	WebElement forgottonPassWord;
	
	@FindBy(how=How.CSS,using="#user-welcome>span>strong")
	WebElement welcomeText;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"Login:LoginScreen:LoginDV:submit\"]")
	WebElement errorText;
	
	
	
	
	public String ErroMessage()
	{			
					
		return ErroMessage.getText().toString();
	}

	
	
	public LoginPage setPassword(String password)
	{
		passwordField.sendKeys(password);
		
		return new LoginPage(driver);
	}
	
	
	
	public  HomePage login(String username, String password)
	{
		log.info("Login to Policy Center");
		userName.sendKeys(username);
		passwordField.sendKeys(password);
		HomePageLoginButton.click();
		return new HomePage(driver);
		
	}
	
	
	private static void click() {
		// TODO Auto-generated method stub
		
	}


	public void clickOnRememberCheckBox()
	{
	//	rememberMeCheckbox.click();
	}
	
	public LoginPage clickForgottonPassWordLink()
	{
	//	forgottonPassWord.click();
		return new LoginPage(driver);
	}
	
	
	public HomePage clickLoginButton()
	{
	   // LoginButton.click();
		return new HomePage(driver);
	}
	
	//public boolean isLoginSuccessful(String username)
	{
	//	return welcomeText.getText().contains(username);
		
	}
	
	public HomePage loginExpectingError(String username, String password) 
	{
	//	userNameField.sendKeys(username);
		passwordField.sendKeys(password);
		// submitButton.click();
		return new HomePage(driver);
	}
	
	//public String getErrorText()
	{
	// 	return errorText.getText();
		
		
	}
	
	public HomePage clickOnHomeLink()
	{
	//	links_home.size();
	//	Iterator<WebElement> links = links_home.iterator();
		
	//	while(links.hasNext())
		{
		//	WebElement ele = links.next();
		//	String total_links = ele.getText();
			
		//if(total_links.equalsIgnoreCase("home"));
		//	ele.click();
		//	break;
			
		}
		
		return new HomePage(driver);

	
	}
	
	public HomePage homePageText()
	{
	//	sources_home_screen.getText();
		return new HomePage(driver);
	}


	public void login_to_mso(String name, String password) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
