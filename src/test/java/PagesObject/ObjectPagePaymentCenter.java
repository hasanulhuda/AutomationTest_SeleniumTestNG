package PagesObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;

import java.util.NoSuchElementException;

public class ObjectPagePaymentCenter extends BasePage {
	public WebDriver driver;
	public ObjectPagePaymentCenter(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (id="paymentCenterFrame")
	public WebElement PCFrame;

	@FindBy (id="402")
	public WebElement ATM;

	@FindBy (xpath="//*[@id=\"BPISAKU\"]")
	public WebElement IsakuXpath;

	@FindBy (id="BPISAKU")
	public WebElement IsakuID;
	public void clickPembayaranISaku(){
		try {
			waitElement();
			waitForVisibility(IsakuID);
			IsakuID.click();
			Reporter.log("");
		}catch (NoSuchElementException e){
			e.printStackTrace();
			Reporter.log("");
		}
	}

	@FindBy (id="RKPON")
	public WebElement cimbRekpon;

	@FindBy (id="saldoKlikCheck")
	public WebElement saldoKlik;

	@FindBy (xpath ="//*[@id=\"openSubTotal\"]")
	public WebElement SubTotal;

	@FindBy (xpath="//*[@id=\"popupSeamlessISaku\"]/div/div[1]/div/div/div[1]/a")
	public WebElement CloseIsaku;

	@FindBy (id="payButton")
	public WebElement btnBayar;

	@FindBy (xpath = "//*[@id=\"pc-backChannel\"]/a")
	public WebElement btnBack;

	public void validateIsaku() throws NoSuchElementException {
		try {
			waitElement();
			IsakuXpath.click();
			btnBack.click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}

	@FindBy (xpath="//*[@id=\"402\"]")
	public WebElement BcaVA;
	public void validateBCAVA() throws NoSuchElementException {
		try {
			waitElement();
			BcaVA.click();
			btnBack.click();
			Reporter.log("");
		}catch (NoSuchElementException e) {
			e.printStackTrace();
			Reporter.log("");
		}	
	}

	public void pickPayment() throws NoSuchElementException {
		try {
			waitElementLong();
			PaymentCenterFrame();
			BcaVA.click();
			//System.out.println("BCA VA BISA");

		}catch (NoSuchElementException e ) {
			//System.out.println("ATM BISA");
			e.printStackTrace();
			ATM.click();
		}

	}
	
	public void validateATM() throws NoSuchElementException {
		try {
		
			ATM.click();
			
			btnBack.click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	
	public void validateRekpon() throws NoSuchElementException {
		try {
			
		
			cimbRekpon.click();
			
			btnBack.click();
			defaultContent();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void validateSaldoKlik() throws NoSuchElementException {
		try {
			PaymentCenterFrame();
			waitElementClickable(cimbRekpon);
			cimbRekpon.click();
		
			btnBack.click();
			
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	
	public void validateSubTotal() throws NoSuchElementException {
		try {
			PaymentCenterFrame();
			SubTotal.click();
			
	
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}

	
	public void pickPaymentIsaku() throws NoSuchElementException {
		try {
			waitElementLong();
			PaymentCenterFrame();
			IsakuID.click();
			//System.out.println("ISaku BISA");
			
		}catch (NoSuchElementException e ) {
			e.printStackTrace();
			//System.out.println("Isaku BISA");
			
			IsakuXpath.click();
		} 
		
	}
	
	
		public void clickBayar() throws NoSuchElementException {
			try {
				waitElementLong();
				btnBayar.click();
				defaultContent();
			}catch (NoSuchElementException e) {
				e.printStackTrace();
				//System.out.println(e);
			} 
	} 
		
		public void clickBayarIsaku() throws NoSuchElementException {
			try {
				waitElementLong();
				btnBayar.click();
				waitElement(); 
				CloseIsaku.click();
				defaultContent();
			}catch (NoSuchElementException e) {
				//System.out.println(e);
				e.printStackTrace();
			} 
	}
} 
