package TestClass;

import PagesObject.*;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class PulsaTest extends Utility {
	LoginPage objLogin; 
	PulsaPage objPulsaPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public String testUrl;

	
	@Test (priority=1)
	public void goToLoginPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Website");
		try {
			objLogin  = new LoginPage(driver);
			
			objLogin.clickButtonLoginHome();
			
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
				e.printStackTrace();

			// TODO: handle exception
			}
		}
	@Test (priority=2)
	public void testLogin() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Login Test");
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
	
	@Test (priority=3)
	public void goToPulsaTest() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Pulsa");
		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.goToPulsa();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();

			// TODO: handle exception
			}
		
	}
	
	@Test (priority=4)
	public void goToCategoryPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Category");

		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.goToCategoryPulsa();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test (priority=5)
	public void inputInvalidMinNomorPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS05-EP06 Input Invalid Customer Number on Pulsa");
		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.inputNomorPulsa("08888");	
		
			Thread.sleep(60);
			
		} catch (InterruptedException e) {
			e.printStackTrace();

			// TODO: handle exception
		}
	
	}  
	
	@Test (priority=5)
	public void inputNomorPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Input Customer Number");
		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.inputNomorPulsa("081500100100");	
		
			Thread.sleep(60);
			
		} catch (InterruptedException e) {
			e.printStackTrace();

			// TODO: handle exception
		}
	
	}  
	
	@Test (priority=6)
	public void setDenomPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Select Denominal for Pulsa");
		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.pilihDenomPulsa();
			Thread.sleep(20);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	} 
	
	@Test (priority=7)
	public void pilihPulsa25() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Select Denominal for Pulsa");
		try {
			objPulsaPage = new PulsaPage(driver);
			objPulsaPage.pilihPulsa25();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=8)
	public void goToCheckOutPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Checkout Page");
		try {
			objPulsaPage = new PulsaPage(driver);
			objPulsaPage.clickButtonBayarPulsa();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=9)
	public void checkOutPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Checkout Test");
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.logoCheckoutIsDisplay();
			objCheckOutPage.konfirmasiPesananIsDisplay();
			objCheckOutPage.boxImagesIsDisplay();
			objCheckOutPage.deleteProduIsDisplay();
			objCheckOutPage.itemProdukVirtualIsDisplay();
			objCheckOutPage.itemSubtotalIsDisplay();
			objCheckOutPage.itemTotalIsDisplay();
			objCheckOutPage.inputCouponIsDisplay();
			objCheckOutPage.buttonAddCouponIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	
	@Test (priority=10)
	public void goToPaymentCenter() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Payment Center");
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.goToPaymentCenter();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	
	@Test (priority=11)
	public void PilihAlatBayar() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose available payment Methods");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPayment();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	} 
	
	@Test (priority=12)
	public void clickBayar() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose available Payment Methods");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
		
	} 
	
	@Test (priority=13)
	public void TQPageTest() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Thank You Page Test");
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
	
	@Test (priority=14)
	public void DaftarTrxTest() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Order History Test");
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
