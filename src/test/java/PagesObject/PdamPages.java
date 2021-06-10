package PagesObject;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PdamPages extends BasePage {
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[11]/div/a")
	public WebElement IconPDAM;
	
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[1]/div[1]/button/span[1]")
	public WebElement PilihNamaPDAM; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[1]/div[1]/div/div/input")
	public WebElement InputTextPDAM; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[1]/div[1]/div/ul/li[229]/a")
	public WebElement selectInputTextPDAM;

	
	@FindBy (xpath="//*[@id=\"CustomerNo\"]")
	public WebElement CustomerNo; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/i")
	public WebElement btnCancel; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[3]/div/div/button")
	public WebElement btnBayarPDAM; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[1]/div[3]")
	public WebElement ErorMessagePDAM;
	
	
	public PdamPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void goToPDAM() {
		try { 
			waitElement(); 
			IconPDAM.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();;
		}
	}
	
	
	public void pilihNamaPDAM() { 
		try { 
			waitElement();
			PilihNamaPDAM.click();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void inputTextPDAM(String strNamaPDAM) {
		try {
			waitElement(); 
			InputTextPDAM.sendKeys(strNamaPDAM);
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void selectInputTextPDAM() { 
		try { 
			waitElement();
			selectInputTextPDAM.click();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void btnCancelIsDisplay() {
		try { 
			waitElementLong();
			boolean status = btnCancel.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void inputCustomerNo(String strCustomerNo) {
		try {
			waitElement();
			CustomerNo.clear();
			CustomerNo.sendKeys(strCustomerNo);
			CustomerNo.sendKeys(Keys.ENTER);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickButtonBayarPDAM() {
		try {
			waitElement(); 
			btnBayarPDAM.click();
			Thread.sleep(6);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String ErorMessagePDAMIsDisplay() {
		try {
			waitElementClickable(ErorMessagePDAM);
			String actualText = ErorMessagePDAM.getText();
			String expectedText = "No Pelanggan tidak di temukan, mohon periksa kembali nomor pelanggan anda";
			Assert.assertEquals(actualText, expectedText);
		
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return ErorMessagePDAM.getText();
	}

}
