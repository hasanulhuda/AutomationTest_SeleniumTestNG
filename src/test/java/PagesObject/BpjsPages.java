package PagesObject;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BpjsPages extends BasePage {
	public WebDriver driver;

	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[5]/div")
	 public WebElement categoryBPJS; 
	 
	 @FindBy(xpath="//*[@id=\"d45cd255-b92a-47db-bc2b-54a519403a2a\"]")
	 public WebElement BpjsKesehatan;
	 
	 @FindBy(xpath="//*[@id=\"2ed8c9e9-4796-4802-8e7f-42ff55a405ea\"]")
	 public WebElement BpjsTenagaKerja;
	 
	 @FindBy(xpath="//*[@id=\"CustomerNo\"]")
	 public WebElement CustomerNoBPJS;
	 
	 @FindBy (xpath="//*[@id=\"square_bpjs-kesehatan\"]/div[2]/div/div/div/div[4]/div/div/button")
	 public WebElement btnBayarBpjsKesehatan; 
	 
	 @FindBy (xpath="//*[@id=\"square_bpjs-ketenagakerjaan\"]/div[2]/div/div/div/div[4]/div/div/button")
	 public WebElement btnBayarBpjsTenagaKerja; 
	 
	 @FindBy (xpath ="//*[@id=\"square_bpjs-kesehatan\"]/div[2]/div/div/div/div[3]/div[2]")
	 public WebElement ErorMessageBPJS;
	 
	public BpjsPages(WebDriver driver) {
		super(driver);
		
	}
	
	public void goToBpjs(){
		try { 
			waitElementClickable(categoryBPJS);
			categoryBPJS.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
		// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void goToSubCategoryBpjsKesehatan() {
		try {
			waitElementClickable(BpjsKesehatan);
			BpjsKesehatan.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void goToSubCategoryBpjsTengaKerja() {
		try {
			waitElementClickable(BpjsTenagaKerja);
			BpjsTenagaKerja.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void inputCustomerNumberBpjs(String strInquiryBPJS) {
		try {
			waitElementClickable(CustomerNoBPJS); 
			CustomerNoBPJS.clear();
			CustomerNoBPJS.sendKeys(strInquiryBPJS);
			CustomerNoBPJS.sendKeys(Keys.ENTER);
			
			waitElementLong();	
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void clickButtonBayarBpjsKesehatan() {
		try {
			waitElementClickable(btnBayarBpjsKesehatan);
			btnBayarBpjsKesehatan.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void clickButtonBayarBpjsTenagaKerja() {
		try {
			waitElementClickable(btnBayarBpjsTenagaKerja);
			btnBayarBpjsTenagaKerja.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String ErorMessageBpjsIsDisplay() {
		try {
			waitElementClickable(ErorMessageBPJS);
			String actualText = ErorMessageBPJS.getText();
			String expectedText = "Nomor Peserta tidak ditemukan - Salah, harap pastikan nomor peserta BPJS Konsumen";
			Assert.assertEquals(actualText, expectedText);
		
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return ErorMessageBPJS.getText();
	}
	
	
	
}
