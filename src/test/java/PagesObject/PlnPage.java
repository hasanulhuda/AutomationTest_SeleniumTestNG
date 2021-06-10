package PagesObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.NoSuchElementException;

public class PlnPage extends BasePage {
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[4]/div/a")
	public WebElement IconPLN; 
	
	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]")
	public WebElement TokenListrikPLN;
	
	@FindBy (xpath="//*[@id=\"nomor_prabayar_NoMeter\"]")
	public WebElement InputToken; 
	
	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div/div")
	public WebElement pilihDenom;

	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div/ul/li[1]")
	public WebElement pilih20k;
	
	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]/div[3]/div/div[2]/button")
	public WebElement buttonBayar;  
	
	@FindBy (xpath ="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]/div[1]/div/div[2]")
	public WebElement ErorMessagePLN; 

	
 	public PlnPage(WebDriver driver) {
		super(driver);
	}
	
	public  void  goToPLN() throws NoSuchElementException {
		try { 
			
			waitElementClickable(IconPLN);
			IconPLN.click();
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		
	} 

	
	public  void  gotToTokenListrikPLN() throws NoSuchElementException {
		try { 
			
			waitElementClickable(TokenListrikPLN);
			TokenListrikPLN.click();
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		
	} 
	
	public  void  setInquiryPLN(String strInquiryPln) throws NoSuchElementException {
		try { 
			
			waitElementClickable(InputToken);
			InputToken.clear();
			InputToken.sendKeys(strInquiryPln);
		
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		
	} 
	
	
	public void setDenomPLN() throws NoSuchElementException {
		try {
			waitElementClickable(pilihDenom); 
			pilihDenom.click();
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	} 
	
	
	public void chooseDenomPLN() throws NoSuchElementException {
		try {
			waitElementClickable(pilih20k); 
			pilih20k.click();
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	} 
	
	
	public void clickButtonBayar() throws NoSuchElementException {
		try {
			waitElementClickable(buttonBayar); 
			buttonBayar.click();
			waitElementLong(); 
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	} 
	
	public String ErorMessagePLNIsDisplay() {
		try {
			waitElementClickable(ErorMessagePLN);
			String actualText = ErorMessagePLN.getText();
			String expectedText = "NOMOR METER YANG ANDA MASUKKAN SALAH, MOHON TELITI KEMBALI";
			Assert.assertEquals(actualText, expectedText);
		
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return ErorMessagePLN.getText();
	} 
}
