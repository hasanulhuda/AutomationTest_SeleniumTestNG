package PagesObject;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PbbPages extends BasePage {

	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[10]/div/a")
	public WebElement IconPBB;
	
	@FindBy (xpath="//*[@id=\"9ab3cce3-22e1-4f73-a228-cd5ef58b92bd\"]")
	public WebElement pilihPBBJakarta; 
	
	@FindBy (xpath="//*[@id=\"f2ef8aea-ab22-4255-b46a-7299f4d9b093\"]")
	public WebElement pilihPBBTangsel;
	
	@FindBy (xpath="//*[@id=\"nomor_PBB\"]")
	public WebElement inputNomorPajak;   
	

	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[1]/div[1]")
	public WebElement logoPBBInput; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-kab-asahan\"]/div[2]/div/div/div/div[3]/div[1]/div[1]")
	public WebElement logoPBBInputTangsel; 

	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[1]/div[1]/i")
	public WebElement btnCancel;
	
	@FindBy (xpath="//*[@id=\"square_pbb-kab-asahan\"]/div[2]/div/div/div/div[3]/div[1]/div[1]/i")
	public WebElement btnCancelTangsel;
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[2]/div/button")
	public WebElement listTahunPajak;   
	
	@FindBy (xpath="//*[@id=\"square_pbb-kab-asahan\"]/div[2]/div/div/div/div[3]/div[2]/div/button")
	public WebElement listTahunPajakTangsel;
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[2]/div/div/div/input")
	public WebElement textInputTahunPajak;  
	
	@FindBy (xpath="//*[@id=\"square_pbb-kab-asahan\"]/div[2]/div/div/div/div[3]/div[2]/div/div/div/input")
	public WebElement textInputTahunPajakTangsel; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[2]/a")
	public WebElement pilihTahunPajak; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-kab-asahan\"]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[2]/a")
	public WebElement pilihTahunPajakTangsel; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[5]/div/div[2]/button")
	public WebElement buttonBayarPBBJakarta; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-kab-asahan\"]/div[2]/div/div/div/div[5]/div/div[2]/button")
	public WebElement buttonBayarPBBTangsel;
	
	@FindBy (xpath ="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[1]/div[2]")
	public WebElement ErorMessagePbb;
	
	
	
	
	public PbbPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void goToPBB() {
		try {
			waitElement(); 
			IconPBB.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pilihPBBJakarta()  { 
		try {
			waitElement(); 
			pilihPBBJakarta.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pilihPBBTangsel()  { 
		try {
			waitElement(); 
			pilihPBBTangsel.click();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void inputNomorPajak(String strNomorPajak) {
		try {
			waitElementLong();
			inputNomorPajak.clear();
			inputNomorPajak.sendKeys(strNomorPajak);
			inputNomorPajak.sendKeys(Keys.ENTER);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	public void logoPBBisDisplay() {
		try {	
				waitElementLong();
				boolean status = logoPBBInput.isDisplayed();
				Assert.assertTrue(status);
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	
	public void logoPBBTangselisDisplay() {
		try {	
				waitElementLong();
				boolean status = logoPBBInputTangsel.isDisplayed();
				Assert.assertTrue(status);
				Thread.sleep(5);
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
	
	
	public void btnCancelTangselIsDisplay() {
		try {
			waitElementLong(); 
			boolean status = btnCancelTangsel.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	
	public void clickListPajak() {
		try { 
			waitElement(); 
			listTahunPajak.click();
			Thread.sleep(0);
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}
	} 
	
	public void clickListPajakTangsel() {
		try { 
			waitElement(); 
			listTahunPajakTangsel.click();
			Thread.sleep(0);
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}
	}
	
	public void textInputPajakIsDisplay() {
		try { 
			waitElement();
			boolean status = textInputTahunPajak.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void textInputPajakTangselIsDisplay() {
		try { 
			waitElement();
			boolean status = textInputTahunPajakTangsel.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pilihTahunPajak() {
		try { 
			waitElement(); 
			pilihTahunPajak.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pilihTahunPajakTangsel() {
		try { 
			waitElement(); 
			pilihTahunPajakTangsel.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickBtnBayarPBB() {
		try { 
			waitElement(); 
			buttonBayarPBBJakarta.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickBtnBayarPBBTangsel() {
		try { 
			waitElement(); 
			buttonBayarPBBTangsel.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String ErorMessageBpjsIsDisplay() {
		try {
			waitElementClickable(ErorMessagePbb);
			String actualText = ErorMessagePbb.getText();
			String expectedText = "Nomor Telpon, Billing Id, NOP tidak ditemukan";
			Assert.assertEquals(actualText, expectedText);
		
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return ErorMessagePbb.getText();
	}
}
