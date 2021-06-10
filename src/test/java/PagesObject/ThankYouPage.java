package PagesObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ThankYouPage extends BasePage {
	
	@FindBy (xpath="//*[@id=\"site-header\"]/div/div/div/a/img") 
	public WebElement headerTQP; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[1]")
	public WebElement ketStatus; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[1]/div[2]/p[2]/a") 

	public WebElement petunjukBayar;
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[2]/a[1]")
	public WebElement lihatDaftarTrx; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[2]/a[2]")
	public WebElement backToHome; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]")
	public WebElement rincianPembayaran; 
	
	@FindBy (xpath="//*[@id=\"kodevirtual-731010895634338579\"]")
	public WebElement  kodeBayarBCA;
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div")
	public WebElement  kodeBayar;
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[2]/div[1]/div[2]")
	public WebElement metodeBayar; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[2]/div[1]/div[3]")
	public WebElement TanggalPesan;
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[2]/div[1]/div[4]")
	public WebElement batasWaktu;
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[2]/div[1]/div[5]")
	public WebElement totalBayar;  
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[2]/div[2]")
	public WebElement bottomList; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[3]") 
	public WebElement moreInfo; 
	
	
	public ThankYouPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public  void  headerTQPIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = headerTQP.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	public  void  keteranganStatusIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = ketStatus.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	}  
	
	public  void  petunjukBayarIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = petunjukBayar.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	
	public  void  lihatDaftarTrxIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = lihatDaftarTrx.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	public  void  goToDaftarTrx() {
		try { 
			
			waitElement();
			lihatDaftarTrx.click();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	
	public  void  backToHomeIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = backToHome.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	public  void  rincianPembayaranIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = rincianPembayaran.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	public  void  kodeBayarIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = kodeBayar.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	
	public  void metodeBayarIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = metodeBayar.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	public  void TanggalPesanIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status =  TanggalPesan.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	
	public  void batasWaktuIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = batasWaktu.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	} 
	
	public  void totalBayarIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = totalBayar.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	}
	
	
	public  void bottomListIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = bottomList.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	}
	
	public  void moreInfoIsDisplayed() {
		try { 
			
			waitElement();
			Boolean status = moreInfo.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	}
	
	
	
	
}
