package PagesObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.NoSuchElementException;

public class LoginPage extends BasePage {
// WebDriver driver;

	//By userNameVirtual = By.name("Email"); 
	//By passwordVirtual = By.name("Password");
	//By Login = By.xpath("//*[@id=\"site-content\"]/div/div/div[1]/div/form/div[2]/button");
	

 @FindBy (xpath="//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[2]/div/div[2]/div/a")
 public WebElement LoginHomeVirtual;
 
 @FindBy(name="Email")
//	
 public WebElement userNameVirtual;

 @FindBy(name="Password")

public  WebElement passwordVirtual;    

  @FindBy(xpath ="//*[@id=\"site-content\"]/div/div/div[1]/div/form/div[2]/button")

 public  WebElement login;
	
	public  LoginPage (WebDriver driver) {
		super(driver);
	}  
	
	
	public void clickButtonLoginHome() throws NoSuchElementException {
		try {
			LoginHomeVirtual.click();
		//	Assert.assertTrue(driver.getCurrentUrl().contains("\"/account.klikindomaret.com/?ReturnUrl=https://virtual.klikindomaret.com/\""));
			
		} catch  (NoSuchElementException e) {
			// TODO: handle exception
		}
	}
	
	public void setUserName(String strUserName) {
		try {
			waitElementLong();
			userNameVirtual.sendKeys(strUserName);
			Thread.sleep(2);
		} catch  (InterruptedException e) {
			// TODO: handle exception
		}
		
	} 
	
	public void setPassword(String strPassword) throws NoSuchElementException
	{
		try {
			waitElement();
			passwordVirtual.sendKeys(strPassword); 
			Thread.sleep(2);
		} catch ( InterruptedException e) {
			// TODO: handle exception
		}
	
	}
	
	public void clikcLogin() throws NoSuchElementException {
		try {
			waitElement();
			login.click();
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
	
	public void AlertOnLogin() throws NoSuchElementException {
		try {
			waitElementLong();
			alertLogin();
			Thread.sleep(10);
			
		}catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	 /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */ 
//	  public void loginToVirtualIdm(String strUserName,String strPasword){
//
//	        //Fill user name
//
//	        this.setUserName(strUserName);
//
//	        //Fill password
//
//	        this.setPassword(strPasword);
//
//	        //Click Login button
//
//	        this.clikcLogin();        
//	    }

	}
	
	

