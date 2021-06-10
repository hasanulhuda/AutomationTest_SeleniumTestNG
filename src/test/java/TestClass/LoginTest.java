package TestClass;

import PagesObject.LoginPage;
import PagesObject.ObjectPage_Login;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class LoginTest extends Utility {
	ObjectPage_Login objectPage_login;

	  	@Test 
	  	public void goToLoginPage(){
	  		TestReportListener.getTest().log(Status.INFO,"TS01-Go To Website");
			try {
					objectPage_login  = new ObjectPage_Login(driver);
					objectPage_login.clickUntukHilangkanOverlayHomePage();
					objectPage_login.clickTombolMasuk();
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	  	
		@Test 
		public void LoginInvalidUsernameMin(){
		TestReportListener.getTest().log(Status.INFO,"TS01-EP01 - Login Invalid Min Username Valid Pass");
		try { 
				objectPage_login  = new ObjectPage_Login(driver);
				objectPage_login.setUsername("0");
				objectPage_login.setPassword("indomaret");
				objectPage_login.clickSubmitLogin();
				objectPage_login.AlertOnLogin();
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
		@Test 
		public void LoginInvalidUsernameMax() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS01-EP02 - Login Invalid Max Username Valid Pass");
		try {
			objectPage_login  = new ObjectPage_Login(driver);
			objectPage_login.setUsername("08999999999999999999999999");
			objectPage_login.setPassword("indomaret");
			objectPage_login.clickSubmitLogin();
			objectPage_login.AlertOnLogin();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

		@Test (description = "TS01-EP03 - Login Valid Username Invalid Pass Min")
		public void LoginInvalidPasswordMin(){
		TestReportListener.getTest().log(Status.INFO,"TS01-EP03 - Login Valid Username Invalid Pass Min");
		try {
			objectPage_login  = new ObjectPage_Login(driver);
			objectPage_login.setUsername("0895634338579");
			objectPage_login.setPassword("a");
			objectPage_login.clickSubmitLogin();
			objectPage_login.AlertOnLogin();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
		
		@Test(description = "TS01-EP04 - Login Valid Username Invalid Pass Max")
		public void LoginInvalidPasswordMax(){
		TestReportListener.getTest().log(Status.INFO,"TS01-EP04 - Login Valid Username Invalid Pass Max");
		try { 
			objectPage_login  = new ObjectPage_Login(driver);
			objectPage_login.setUsername("0895634338579");
			objectPage_login.setPassword("abcdefghijklmnopqrstuvwxyz");
			objectPage_login.clickSubmitLogin();
			objectPage_login.AlertOnLogin();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		@Test (description = "TS01-EP05 - Login Valid Username and Valid Password")
		public void LoginValidUsernamePassword(){
		TestReportListener.getTest().log(Status.INFO,"TS01-EP05 - Login Valid Username and Valid Password");
		try {
			objectPage_login  = new ObjectPage_Login(driver);
			objectPage_login.setUsername("087881744704");
			objectPage_login.setPassword("indomaret");
			objectPage_login.clickSubmitLogin();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test (description = "TS01-EP05 - Login Valid Username and Valid Password")
	public void LoginSuccessful(){
		TestReportListener.getTest().log(Status.INFO,"TS01-EP05 - Login Valid Username and Valid Password");
		try {
			objectPage_login  = new ObjectPage_Login(driver);
			objectPage_login.setUsername("0895338021090");
			objectPage_login.setPassword("Takaki@27");
			objectPage_login.clickSubmitLogin();
			objectPage_login.clickGuideMulaiBelanja();
			Thread.sleep(20);

			String actualText = objectPage_login.getTextSearch();
			String expectedText = "Mau beli apa hari ini?";

			Assert.assertEquals(actualText, expectedText);
			System.out.println("Actual :"+actualText+"\n"+"Expected :"+expectedText);
//			driver.get("https://www.klikindomaret.com/product/pencuci-piring-new-1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
} 


