package TestClass;

import PagesObject.*;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class SamsatTest extends Utility {
	LoginPage objLogin; 
	HomePageVirtual objHomePage;
	SamsatPage objSamsatPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public String testUrl;
	 
	@Test 
	public void goToLoginPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Login Page For Samsat Test");
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
	public void testLogin() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Login Test For Samsat Test");
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
	public void goToSamsatTest() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Go To Category Samsat");
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.goToSamsat();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			// TODO: handle exception
			}
		
	} 
	
	@Test 
	public void searchSamsatKeyword() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "TS03-TC15 Validate search with Keyword 'Samsat Banten' ");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.searchSamsatKeyword("Samsat Banten");
			objHomePage.clickSearchSamsatKeyword();
			Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
		
			}
		
	} 
	
	@Test 
	public void goToSamsatJatim() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Go To Samsat Jatim");

		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.pilihSamsatJatim();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test 
	public void goToSamsatBanten() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Go To Samsat Banten");
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.pilihSamsatBanten();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test 
	public void InvalidMinSetKodePembayaran() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "TS05-EP12 Input Invalid Min Customer Number on Samsat");
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setKodePembayaran("9");	
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}  
	
	@Test 
	public void ValidateInvalidMinKodePembayaran() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "TS05-EP13 Validate Input Invalid Min Customer Number on Samsat");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarBanten();
			objSamsatPage.ErorMessageMinSamsatIsDisplay();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void InvalidMaxSetKodePembayaran() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "TS05-EP14 Input Invalid Max Customer Number on Samsat");
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setKodePembayaran("99999999999999900000000");	
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}  
	
	@Test 
	public void ValidateInvalidMaxKodePembayaran() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "TS05-EP15 Validate Input Invalid Min Customer Number on Samsat");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarBanten();
			objSamsatPage.ErorMessageMaxSamsatIsDisplay();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void InputValidSetKodePembayaran() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "TS05-EP16 Input Valid Customer Number on Samsat");
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setKodePembayaran("DEV00000");	
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}  
	
	@Test 
	public void ValidateValidKodePembayaran() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "TS05-EP17 Input Input Valid Customer Number on Samsat");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarBanten();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void setNomorPolisi() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Set Nomor Polisi");
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setNomorPolisi("L 1234 IDM");	
		
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	}  
	
	@Test
	public void setNomorMesin() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Set Nomor Mesin");
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setNomorMesin("DEV00000");
			Thread.sleep(20);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
			
		}
	
	} 
	
	@Test 
	public void setNomorKTP() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Set Nomor KTP");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.setNomorKTP("3603281311980003");
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void goToCheckOutSamsatJatim() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Go To CheckOut Page");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarJatim();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
	} 
	
	@Test
	public void goToCheckOutSamsatBanten() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Go To Checkout");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarBanten();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
	}
	
	@Test 
	public void checkOutSamsat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Testing On Checkout");
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
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	
	@Test 
	public void goToPaymentCenteronSamsat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Go To Payment Center");
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
	public void PilihAlatBayaronSamsat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Pilih Metode Bayar");
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
	public void clickBayaronSamsat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Click Button Bayar");
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
	public void TQPageTestonSamsat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Testing on TQ Page");
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
	public void DaftarTrxTestonSamsat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO, "Testing on Daftar Transaksi");
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
