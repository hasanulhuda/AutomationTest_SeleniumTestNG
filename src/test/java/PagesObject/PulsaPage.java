package PagesObject;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PulsaPage extends BasePage {
	
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[1]/div/a")
	public WebElement IconPulsa; 
	
	@FindBy (xpath="//*[@id=\"fde94763-8c56-45a3-abc9-6efe422f321c\"]")
	public WebElement CategoryPulsa; 
	
	@FindBy (xpath="//*[@id=\"9ad980e6-8b8d-432f-bcf9-c75c200a7c82\"]")
	public WebElement CategoryPaketData;
	
	@FindBy (xpath="//*[@id=\"nomor_pulsa\"]")
	public WebElement inputNomorPulsa;
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[3]/div[1]/div[1]")
	public WebElement iconProviderPulsa;
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[3]/div[2]")
	//(xpath="//*[@id=\"ddl_nomor_pulsa\"]") 
	
	public WebElement pilihDenomPulsa; 
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[3]/div[2]/div/ul/li[4]")
	public WebElement pilih25k;
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[4]/div[2]/div[2]/button")
	public WebElement buttonBayarPulsa;

	public PulsaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void goToPulsa() throws InterruptedException {
		try { 
		
			waitElement();
			IconPulsa.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
		// TODO: handle exception
			e.printStackTrace();
		} 
	
	} 
	public void goToCategoryPaketData() {
		try {
			waitElement();
			CategoryPaketData.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void goToCategoryPulsa() {
		try {
			waitElement();
			CategoryPulsa.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void inputNomorPulsa(String strInquiryPulsa) {
		try {
			waitElement(); 
			inputNomorPulsa.sendKeys(strInquiryPulsa);
			inputNomorPulsa.sendKeys(Keys.ENTER);
			waitElementLong();	
			Thread.sleep(10);
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void pilihDenomPulsa() {
		try { 
			new WebDriverWait(driver, 60)

            .until(ExpectedConditions.elementToBeClickable(pilihDenomPulsa));
			
			//waitElementClickable(pilihDenomPulsa);
			pilihDenomPulsa.click(); 
			waitElementLong();
			Thread.sleep(10);

		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void pilihPulsa25() {
		try {
			waitElementLong();
			pilih25k.click();
			Thread.sleep(10);
		}catch (InterruptedException e) {
		e.printStackTrace();
			
		}
	}
	
	public void clickButtonBayarPulsa()  {
		try {
			waitElement();
			buttonBayarPulsa.click();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
