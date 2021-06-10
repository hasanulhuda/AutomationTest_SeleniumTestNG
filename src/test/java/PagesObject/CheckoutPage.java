package PagesObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.NoSuchElementException;

public class CheckoutPage extends BasePage {
	public WebDriver driver; 
	
	@FindBy (xpath="//*[@id=\"siteHeader\"]/div/div/div/img")
	public WebElement LogoCheckout; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div[1]/div[1]/div[2]/div[1]")
	public WebElement KonfirmasiPesanan; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[1]/div[1]/div")
	public WebElement BoxImages; 
	
	@FindBy(xpath="//*[@id=\"site-content\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div/div[1]/div[1]/span")
	public WebElement HapusProduk; 
	
	@FindBy (xpath="//*[@id=\"section-summary\"]/div/div/div[1]/div[1]")
	public WebElement itemProdukVirtual; 
	
	@FindBy(xpath="//*[@id=\"section-summary\"]/div/div/div[1]/div[3]")
	public WebElement  itemSubtotal; 
	
	@FindBy(xpath="//*[@id=\"section-summary\"]/div/div/div[1]/div[5]")
	public WebElement itemTotal; 
	
	@FindBy (xpath="//*[@id=\"section-summary\"]/div/div/div[1]/div[2]")
	public WebElement subTotalSamsat; 
	
	@FindBy (xpath="	//*[@id=\"section-summary\"]/div/div/div[1]/div[4]")
	public WebElement TotalSamsat; 
	
	//*[@id="section-summary"]/div/div/div[1]/div[1] 
	//*[@id="section-summary"]/div/div/div[1]/div[2]
	//*[@id="section-summary"]/div/div/div[1]/div[3]
	
	@FindBy (xpath="//*[@id=\"couponInput\"]") 
	public WebElement inputCoupon;
	
	@FindBy (xpath="//*[@id=\"addCoupon\"]")
	public WebElement buttonAddCoupon;
	
	@FindBy (id="paymentCenter")
	public WebElement lanjutPembayaran; 
	
	
	
	
	
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void logoCheckoutIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = LogoCheckout.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void konfirmasiPesananIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = KonfirmasiPesanan.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void boxImagesIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = BoxImages.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void deleteProduIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = HapusProduk.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}

	public void itemProdukVirtualIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = itemProdukVirtual.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void itemSubtotalIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = itemSubtotal.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void itemSubtotalSamsatIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = subTotalSamsat.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	public void itemTotalSamsatIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = TotalSamsat.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	public void itemTotalIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = itemTotal.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void inputCouponIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = inputCoupon.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void buttonAddCouponIsDisplay() throws NoSuchElementException {
		try {
			
			waitElement();
			Boolean status = buttonAddCoupon.isDisplayed();
			Assert.assertTrue(status);
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
	public void goToPaymentCenter() {
		try {
			
			 waitElement();
			 lanjutPembayaran.click();
			 System.out.println("Element ditemukan");
			 Thread.sleep(2);
		}catch (InterruptedException e) {
			e.printStackTrace(); 
			 System.out.println("Element tidak ditemukan");
		} 
		
	}
	
	
		
						
		
	
	
}
