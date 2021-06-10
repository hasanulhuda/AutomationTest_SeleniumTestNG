package TestClass;

import PagesObject.*;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class PdamTest extends Utility {
	LoginPage objLogin; 
	PdamPages  objPdamPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public String testUrl;
	
	
	@Test 
	public void goToLoginPagePDAM() {
		TestReportListener.getTest().log(Status.INFO,"Go To Website for PDAM Test");
		try {
			objLogin  = new LoginPage(driver);
			
			objLogin.clickButtonLoginHome();
			
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
			}
		}
	
	@Test 
	public void testLoginPDAM() {
		TestReportListener.getTest().log(Status.INFO,"Login Tests for PDAM Test");
		try { 
			objLogin  = new LoginPage(driver);
			objLogin.setUserName("087881744704");
			objLogin.setPassword("indomaret");
			objLogin.clikcLogin(); 
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void goToPdamTest() {
		TestReportListener.getTest().log(Status.INFO,"Go To PDAM Test");
		try { 
			objPdamPage  = new PdamPages(driver);
			objPdamPage.goToPDAM();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			// TODO: handle exception
			}
		
	} 
	
	@Test 
	public void pilihNamaPDAM() {
		TestReportListener.getTest().log(Status.INFO,"Go To PDAM Yogyakarta");
		try {
			objPdamPage = new PdamPages(driver);
			objPdamPage.pilihNamaPDAM();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void inputTextPDAM() {
		TestReportListener.getTest().log(Status.INFO,"search Kota PDAM");
		try {
			objPdamPage = new PdamPages(driver);
			objPdamPage.inputTextPDAM("yogyakarta");
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void selectInputTextPDAM() {
		TestReportListener.getTest().log(Status.INFO,"Choose Input Text PDAM");
		try {
			objPdamPage = new PdamPages(driver);
			objPdamPage.selectInputTextPDAM();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	
	@Test 
	public void btnCancelIsDisplay() { 
		TestReportListener.getTest().log(Status.INFO,"btn Cancel Book Test PDAM");
		try { 
			objPdamPage = new PdamPages(driver); 
			objPdamPage.btnCancelIsDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void inputInvalidMinCustomerNoPDAM() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP18 Input InValid Min Customer Number on PDAM");
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.inputCustomerNo("9");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void ValidateInvalidMinCustomerNoPDAM() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP19 Input InValid Min Customer Number on PDAM");
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.clickButtonBayarPDAM();
			objPdamPage.ErorMessagePDAMIsDisplay();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void inputInvalidMaxCustomerNoPDAM() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP20 Input InValid Min Customer Number on PDAM");
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.inputCustomerNo("99999999999999900000000");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void ValidateInvalidMaxCustomerNoPDAM() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP21 Input InValid Min Customer Number on PDAM");
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.clickButtonBayarPDAM();
			objPdamPage.ErorMessagePDAMIsDisplay();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	
	@Test 
	public void inputValidCustomerNoPDAM() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP22 Input Valid Customer Number on PDAM");
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.inputCustomerNo("DEV00000");
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void ValidateValidCustomerNoPDAM() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP23 Validate Input Valid Customer Number on PDAM");
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.clickButtonBayarPDAM();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void checkOutPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Checkout Test for PDAM Test");
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.logoCheckoutIsDisplay();
			objCheckOutPage.konfirmasiPesananIsDisplay();
			objCheckOutPage.boxImagesIsDisplay();
			objCheckOutPage.deleteProduIsDisplay();
			objCheckOutPage.itemProdukVirtualIsDisplay();
			objCheckOutPage.itemSubtotalSamsatIsDisplay();
			objCheckOutPage.itemTotalSamsatIsDisplay();
			objCheckOutPage.inputCouponIsDisplay();
			objCheckOutPage.buttonAddCouponIsDisplay();
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	
	@Test 
	public void goToPaymentCenterPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Payment Center for PDAM Test");
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.goToPaymentCenter();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	@Test 
	public void PilihAlatBayarPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose Available Payment Methods for PDAM Test");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPayment();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	} 
	
	@Test 
	public void clickBayarPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose Available Payment Methods for PDAM Test");

		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
		
	} 
	
	@Test 
	public void TQPageTestPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"ThankYou Page Test for PDAM Test");
		try {
			objTQPage = new ThankYouPage(driver);
			objTQPage.headerTQPIsDisplayed();
			objTQPage.keteranganStatusIsDisplayed();
			objTQPage.petunjukBayarIsDisplayed();
			objTQPage.lihatDaftarTrxIsDisplayed();
			objTQPage.backToHomeIsDisplayed();
			objTQPage.rincianPembayaranIsDisplayed();
			objTQPage.kodeBayarIsDisplayed();
			objTQPage.metodeBayarIsDisplayed();
			objTQPage.TanggalPesanIsDisplayed();
			objTQPage.batasWaktuIsDisplayed();
			objTQPage.totalBayarIsDisplayed();
			objTQPage.bottomListIsDisplayed();
			objTQPage.moreInfoIsDisplayed();
			objTQPage.goToDaftarTrx();

			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	@Test 
	public void DaftarTrxTestPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Order History Test for PDAM Test");
		try {
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.introNextIsDisplay();
			objDaftarTrx.introCloseIsDisplay();
			objDaftarTrx.logoIsDisplay();
			objDaftarTrx.downloadAppIsDisplay();
			objDaftarTrx.facebookIsDisplay();
			objDaftarTrx.instagramIsDisplay();
			objDaftarTrx.layananIsDisplay();
			objDaftarTrx.daftarTrxIsDisplay();
			objDaftarTrx.itemSaldoIsDisplay();
			objDaftarTrx.profileIsDisplay();
			objDaftarTrx.iconRetailIsDisplay();
			objDaftarTrx.iconVirtualIsDisplay();
			objDaftarTrx.iconVirtualIsDisplay();
			objDaftarTrx.iconTiketIsDisplay();
			objDaftarTrx.btnDaftarTrxVirtualIsDisplay();
			objDaftarTrx.btnDaftarTrxRetailIsDisplay();
			objDaftarTrx.bbtnDaftarTrxTravelIsDisplay();
			objDaftarTrx.btnDaftarTrxFoodIsDisplay();
			objDaftarTrx.btnDaftarTrxTiketIsDisplay();
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.detailSOdaftarTrxIsDisplay();
			objDaftarTrx.popUpDaftarTrxIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
