package TestClass;

import PagesObject.*;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;


public class plnTest extends Utility {
	LoginPage objLogin; 
	PlnPage objPlnPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public String testUrl;
	
  	@Test
  	public void goToLoginPagePLN() throws InterruptedException {
  		TestReportListener.getTest().log(Status.INFO,"Go To Website for PLN Test");
		try {
			objLogin  = new LoginPage(driver);
			objLogin.clickButtonLoginHome();
			Thread.sleep(20);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
  	
	@Test 
	public void testLoginPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Login Test for PLN Test");
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
	public void goToPLNTest() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Category PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.goToPLN();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
	}  
	@Test 
	public void goTokenListrikPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Sub Category PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.gotToTokenListrikPLN();
			Thread.sleep(10);
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
	} 
	@Test 
	public void inputInvalidMinTokenPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS05-EP30 Input Invalid Min Customer Number PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setInquiryPLN("00000000000");
			Thread.sleep(1000);
			objPlnPage.ErorMessagePLNIsDisplay();
			Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}  
	
	@Test 
	public void inputInvalidMaxTokenPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS05-EP31 Input Invalid Max Customer Number PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setInquiryPLN("99999999999");
			Thread.sleep(1000);
			objPlnPage.ErorMessagePLNIsDisplay();
			Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}  
	@Test 
	public void inputValidTokenPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS05-EP32 Input Valid Customer Number PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setInquiryPLN("10000000100");
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}  
	
	@Test 
	public void setDenomPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose Denominal for PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setDenomPLN();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
	} 
	@Test 
	public void setNominalPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose Denominal for PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.chooseDenomPLN();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

	} 
	
	@Test 
	public void goToCheckOut() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go To Checkout Page");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.clickButtonBayar();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
	
	} 
	//-----------------------CHECKOUT------------------------------
	@Test 
	public void ValidateLogoCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC33 Validate Logo is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.logoCheckoutIsDisplay(); 
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	} 
	
	@Test 
	public void ValidateTabKonfirmasiPesananCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC34 Validate Tab Konfirmasi Pesanan is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.konfirmasiPesananIsDisplay();			
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	@Test 
	public void ValidateBoxImageCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC35 Validate Image Product is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.boxImagesIsDisplay();		
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	@Test 
	public void ValidateDeleteProductCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC36 Validate Delete Product is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.deleteProduIsDisplay();
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	
	@Test 
	public void ValidateItemProductCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC37 Validate Item Product is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.itemProdukVirtualIsDisplay();
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	@Test 
	public void ValidateItemSubTotalCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC38 Validate Item SubTotal is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.itemSubtotalIsDisplay();
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	@Test 
	public void ValidateItemTotalCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC39 Validate Item Total is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.itemTotalIsDisplay();
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}

	@Test 
	public void ValidateItemCouponCO() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS06-TC40 Validate Item Coupon is Display On CheckOut Page");
		try {
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.inputCouponIsDisplay();
			objCheckOutPage.buttonAddCouponIsDisplay();	
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}

	
//	@Test 
//	public void checkOutPLN() throws InterruptedException{
//		TestReportListener.getTest().log(Status.INFO,"CheckOut Test");
//		try { 
//			objCheckOutPage = new CheckoutPage(driver);
//		//	objCheckOutPage.logoCheckoutIsDisplay();
//		//	objCheckOutPage.konfirmasiPesananIsDisplay();
//		//	objCheckOutPage.boxImagesIsDisplay();
//		//	objCheckOutPage.deleteProduIsDisplay();
//		//	objCheckOutPage.itemProdukVirtualIsDisplay();
//		//	objCheckOutPage.itemSubtotalIsDisplay();
//		//	objCheckOutPage.itemTotalIsDisplay();
//		//	objCheckOutPage.inputCouponIsDisplay();
//		//	objCheckOutPage.buttonAddCouponIsDisplay();	
//			Thread.sleep(10);
//			
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		
//	} 
	@Test 
	public void goToPaymentCenter() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Go TO Payment Center");
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.goToPaymentCenter();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	//----------------------payment center------------------------------
	
	@Test 
	public void validateSubTotalPC() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 -TC41 Valdiate Total Pembayaran PC Frame");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			
			objPCFrame.validateSubTotal();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	@Test 
	public void validateIsaku() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 -TC42 Valdiate Isaku on PC Frame");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			
			objPCFrame.validateIsaku();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} 
	@Test 
	public void validateBCAVA() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 -TC44 Valdiate BCA VA PC Frame");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			
			objPCFrame.validateBCAVA();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} 
	
	@Test 
	public void validateATM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 -TC43 Valdiate Tranfer Via ATM PC Frame");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			
			objPCFrame.validateATM();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} 
	
	@Test 
	public void validateRekpon() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 -TC45 Valdiate CIMB Rekening Ponsel PC Frame");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			
			objPCFrame.validateRekpon();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} 
	
	@Test 
	public void validateSaldo() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 -TC46 Valdiate Saldo Pembayaran PC Frame");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			
			objPCFrame.validateSaldoKlik();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} 
	@Test 
	public void PilihAlatBayar() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 - TC46 Choose Available Methods");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			
			objPCFrame.pickPayment();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} 
	
	@Test 
	public void clickBayar() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS07 - TC46 Choose Available payment methods ");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	//---------------------------THANNKYOU PAGE ----------------------------
	@Test 
	public void validateHeaderTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC47 Validate Header Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.headerTQPIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateKetStatusTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC48 Validate Keterangan Status Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.keteranganStatusIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validatePetunjukBayarTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC49 Validate Petunjuk Bayar Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.petunjukBayarIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateGoToOrderHistoryTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC50 Validate Link To OrderHistory Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.petunjukBayarIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateGoToHomePageTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC51 Validate Link To HomePage Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.backToHomeIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateRincianPembayaranTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC52 Validate Rincian Pembayaran Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.rincianPembayaranIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateKodeBayarTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC53 Validate Kode Pembayaran Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.kodeBayarIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateMetodeBayarTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC54 Validate Metode Pembayaran Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.metodeBayarIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateTanggalPesanTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC55 Validate Tanggal Pesan Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.TanggalPesanIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateBatasPesanTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC56 Validate Batas Waktu Pesan Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.batasWaktuIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateTotalBayarTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC57 Validate Total Bayar Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.totalBayarIsDisplayed();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test 
	public void validateBottomTQPage() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC58 Validate Bottom List Thankyou Page is Display");
		try { 
			
			objTQPage = new ThankYouPage(driver);
			objTQPage.bottomListIsDisplayed();
			objTQPage.moreInfoIsDisplayed();
			objTQPage.goToDaftarTrx();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
//	@Test
//	public void TQPageTest() throws InterruptedException{
//		TestReportListener.getTest().log(Status.INFO,"Thank You Page Test");
//		try {
//			objTQPage = new ThankYouPage(driver);
//			objTQPage.headerTQPIsDisplayed();
//			objTQPage.keteranganStatusIsDisplayed();
//			objTQPage.petunjukBayarIsDisplayed();
//			objTQPage.lihatDaftarTrxIsDisplayed();
//			objTQPage.backToHomeIsDisplayed();
//			objTQPage.rincianPembayaranIsDisplayed();
//			objTQPage.kodeBayarIsDisplayed();
//			objTQPage.metodeBayarIsDisplayed();
//			objTQPage.TanggalPesanIsDisplayed();
//			objTQPage.batasWaktuIsDisplayed();
//			objTQPage.totalBayarIsDisplayed();
//			objTQPage.bottomListIsDisplayed();
//			objTQPage.moreInfoIsDisplayed();
//			objTQPage.goToDaftarTrx();
//
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} 
//		
//		
//		
//	}
	@Test 
	public void validateLogoOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC59 Validate Logo Order History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.introNextIsDisplay();
			objDaftarTrx.introCloseIsDisplay();
			objDaftarTrx.logoIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateDownloadAppOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC60 Validate Download App Order History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.downloadAppIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateFacebookOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC61 Validate Facebook App Order History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.facebookIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	
	@Test 
	public void validateInstagramOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC62 Validate Instagram App Order History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.instagramIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateCustomerCareOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC63 Validate Customer Care Order History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.layananIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateDownloadAppCareOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC64 Validate Download Apps Order History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.downloadAppIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	
	@Test 
	public void validateIconOrderHistoryOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC65 Validate Icon Order History Order History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.daftarTrxIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateItemSaldoOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC66 Validate item Saldo History is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.itemSaldoIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateProfileOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC67 Validate Profile is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.profileIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	
	@Test 
	public void validateiconRetailOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC68 Validate Icon Retail is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.iconRetailIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateiconVirtualOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC69 Validate Icon Virtual is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.iconVirtualIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateiconTravelOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC70 Validate Icon Travel is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.iconTravelIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateiconFoodOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC71 Validate Icon Food is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.iconFoodIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateiconTiketOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC72 Validate Icon Tiket is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.iconTiketIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateVirtualOrderHistoryOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC73 Validate Order History Virtual is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.btnDaftarTrxVirtualIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateRetailOrderHistoryOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC74 Validate Order History Retail is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.btnDaftarTrxRetailIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	} 
	
	@Test 
	public void validateTravelOrderHistoryOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC75 Validate Order History Travel is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.bbtnDaftarTrxTravelIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateFoodOrderHistoryOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC76 Validate Order History Food is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.btnDaftarTrxFoodIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	} 
	
	
	@Test 
	public void validateTiketOrderHistoryOH() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC77 Validate Order History Tiket is Display");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.btnDaftarTrxTiketIsDisplay();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	
	@Test 
	public void validateFilterKonfirmasi() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC78 Validate Filter Order History Konfirmasi ");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.validateFilterKonfirmasi();
			
			Thread.sleep(100);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	} 
	
	@Test 
	public void validateFilterProses() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC79 Validate  Filter Order Proses");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.validateFilterProses();
			Thread.sleep(100);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	} 
	
	@Test 
	public void validateFilterBerhasil() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC80 Validate  Filter Order Berhasil");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.validateFilterBerhasil(); 
			
			Thread.sleep(100);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	} 
	
	@Test 
	public void validateFilterGagal() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC81 Validate  Filter Order Gagal");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.validateFilterGagal(); 
			
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateFilterRefund() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC82 Validate  Filter Order Refund");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.validateFilterRefund();
			//balikin ke semua daftar atau cek dlu detail SO baru filter 
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void validateFilterSemua() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS08 - TC83 Validate  Filter Order Refund");
		try { 
			
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.validateFilterSemuaTrx();
			//balikin ke semua daftar atau cek dlu detail SO baru filter 
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	@Test 
	public void DaftarTrxTest() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Order History Test");
		try {
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.detailSOdaftarTrxIsDisplay();
			objDaftarTrx.popUpDaftarTrxIsDisplay();
			Thread.sleep(10);
			//			objDaftarTrx.introNextIsDisplay();
			//			objDaftarTrx.introCloseIsDisplay();
			//			objDaftarTrx.logoIsDisplay();
			//			objDaftarTrx.downloadAppIsDisplay();
			//			objDaftarTrx.facebookIsDisplay();
			//			objDaftarTrx.instagramIsDisplay();
			//			objDaftarTrx.layananIsDisplay();
			//			objDaftarTrx.daftarTrxIsDisplay();
			//			objDaftarTrx.itemSaldoIsDisplay();
			//			objDaftarTrx.profileIsDisplay();
			//			objDaftarTrx.iconRetailIsDisplay();
			//			objDaftarTrx.iconVirtualIsDisplay();
			//			objDaftarTrx.iconVirtualIsDisplay();
			//			objDaftarTrx.iconTiketIsDisplay();
			//			objDaftarTrx.iconFoodIsDisplay();
			//			objDaftarTrx.iconTravelIsDisplay();
			//			objDaftarTrx.btnDaftarTrxVirtualIsDisplay();
			//			objDaftarTrx.btnDaftarTrxRetailIsDisplay();
			//			objDaftarTrx.bbtnDaftarTrxTravelIsDisplay();
			//			objDaftarTrx.btnDaftarTrxFoodIsDisplay();
			//			objDaftarTrx.btnDaftarTrxTiketIsDisplay();
			//			objDaftarTrx.filterDaftarTrxIsDisplay();
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	
	
}
