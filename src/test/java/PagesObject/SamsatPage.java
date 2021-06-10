package PagesObject;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.NoSuchElementException;

public class SamsatPage extends BasePage {
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[3]/div/a")
	public WebElement IconSamsat; 
	
	@FindBy (xpath="//*[@id=\"0deb539c-928d-4198-ac57-36ca5e27e44e\"]")
	public WebElement pilihSamsatJatim; 
	
	@FindBy (xpath="//*[@id=\"907af331-ce4b-43d4-a56a-0879c8e68f37\"]")
	public WebElement pilihSamsatBanten;
	
	@FindBy (xpath="//*[@id=\"CustomerNo\"]")
	public WebElement CustomerNo; 

	@FindBy (xpath="//*[@id=\"CustomerNo2\"]")
	public WebElement NomorMesin;
	
	@FindBy (xpath="//*[@id=\"CustomerNo3\"]")
	public WebElement NomorKTP; 
	
	@FindBy (xpath="//*[@id=\"square_e-samsat-jawa-timur\"]/div[2]/div/div/div/div[3]/div[2]/div/button")
	public WebElement buttonBayarJatim;
	@FindBy (xpath="//*[@id=\"square_e-samsat-banten\"]/div[2]/div/div/div/div[4]/div[2]/div/button")
	public WebElement buttonBayarBanten;
	
	@FindBy (xpath="//*[@id=\"square_e-samsat-banten\"]/div[2]/div/div/div/div[3]/div")
	public WebElement ErorMessageSamsat;
	
	
	public SamsatPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void goToSamsat() throws NoSuchElementException {
		try {
				//waitElement();
				waitElementClickable(IconSamsat);
				IconSamsat.click();
			
			}catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
	public void pilihSamsatJatim() throws NoSuchElementException {
		try {
				//waitElement();
				waitElementClickable(pilihSamsatJatim);
				pilihSamsatJatim.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		} 
	
	public void pilihSamsatBanten() throws NoSuchElementException {
		try {
				//waitElement();
				waitElementClickable(pilihSamsatBanten);
				pilihSamsatBanten.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		} 
	
	public void setKodePembayaran(String setKodePembayaran) throws NoSuchElementException {
		try {
				waitElementClickable(CustomerNo);
				CustomerNo.clear();
				CustomerNo.sendKeys(setKodePembayaran);
				CustomerNo.sendKeys(Keys.ENTER);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	public void setNomorPolisi(String strNomorPolisi) throws NoSuchElementException {
		try {
				waitElement();
				//waitElementClickable(CustomerNo);
				CustomerNo.sendKeys(strNomorPolisi);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
	public void setNomorMesin(String strNomorMesin) throws NoSuchElementException {
		try {
				//waitElement();
				waitElementClickable(NomorMesin);
				NomorMesin.sendKeys(strNomorMesin);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
	public void setNomorKTP (String strNomorKTP) throws NoSuchElementException {
		try {
				//waitElement();
				waitElementClickable(NomorKTP);
				NomorKTP.sendKeys(strNomorKTP);
			
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
	public void clickButtonBayarJatim() throws NoSuchElementException {
		try {
				waitElementClickable(buttonBayarJatim);
				//waitElement();
				buttonBayarJatim.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}	
	
	public void clickButtonBayarBanten() throws NoSuchElementException {
		try {
				waitElementClickable(buttonBayarBanten);
				buttonBayarBanten.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}	
	
	public String ErorMessageMinSamsatIsDisplay() {
		try {
			waitElementClickable(ErorMessageSamsat);
			String actualText = ErorMessageSamsat.getText();
			String expectedText = "Kode pembayaran tidak ditemukan";
			Assert.assertEquals(actualText, expectedText);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return ErorMessageSamsat.getText();
	}
	
	public String ErorMessageMaxSamsatIsDisplay() {
		try {
			waitElementClickable(ErorMessageSamsat);
			String actualText = ErorMessageSamsat.getText();
			String expectedText = "Kode Pembayaran tidak sesuai, Mohon periksa kembali!";
			Assert.assertEquals(actualText, expectedText);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return ErorMessageSamsat.getText();
	}
	

} 


