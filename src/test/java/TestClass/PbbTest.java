package TestClass;

import PagesObject.*;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class PbbTest extends Utility {
	LoginPage objLogin; 
	HomePageVirtual objHomePage;
	PbbPages  objPbbPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
//	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public String testUrl;
	
	@Test 
	public void goToLoginPagePBB() { 
		TestReportListener.getTest().log(Status.INFO,"Go To Website for PBB Test");
		try {
			objLogin  = new LoginPage(driver);
			
			objLogin.clickButtonLoginHome();
			
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	
	@Test 
	public void testLoginPBB() {
		TestReportListener.getTest().log(Status.INFO,"Login Test for PBB Test");
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
	public void goToPbbTest() {
		TestReportListener.getTest().log(Status.INFO,"Go To PBB Test");
		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.goToPBB();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			// TODO: handle exception
			}
		
	} 
	
	@Test 
	public void goToPbbTangsel() { 
		TestReportListener.getTest().log(Status.INFO,"Go To Pbb Tangsel");

		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.pilihPBBTangsel();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	 }
	
	@Test 
	public void goToPbbJakarta() { 
		TestReportListener.getTest().log(Status.INFO,"Go TO PBB Jakarta");

		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.pilihPBBJakarta();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	@Test 
	public void searchPBBKeyword() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03 - TC16 Validate Search With Keyword 'PBB Jakarta'");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.searchPBBKeyword("PBB Jakarta");
			objHomePage.clickSearchPBBKeyword();
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();	
			}
		
	} 
	
	
	@Test
	public void inputInvalidMinNomorPajak() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP24 Input Invalid Min Nomor Pajak PBB");
		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.inputNomorPajak("99");
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test
	public void inputInvalidMaxNomorPajak() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP26 Input Invalid Max Nomor Pajak PBB");
		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.inputNomorPajak("00000000000000000");
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test
	public void inputValidNomorPajak() { 
		TestReportListener.getTest().log(Status.INFO,"TS05-EP28 Input Valid  Nomor Pajak PBB");
		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.inputNomorPajak("DEV00000");
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	@Test 
	public void logoPbbInputIsDisplay() {
		TestReportListener.getTest().log(Status.INFO,"Logo PBB is Display");
		try { 
			objPbbPage = new PbbPages(driver); 
			objPbbPage.logoPBBisDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void logoPBBTangselInputIsDisplay() {
		TestReportListener.getTest().log(Status.INFO,"Logo PBB is display");
		try { 
			objPbbPage = new PbbPages(driver); 
			objPbbPage.logoPBBTangselisDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void btnCancelIsDisplay() { 
		TestReportListener.getTest().log(Status.INFO,"btn Cancel Is Display");
		try { 
			objPbbPage =  new PbbPages(driver);
			objPbbPage.btnCancelIsDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void btnCancelTangselIsDisplay() { 
		TestReportListener.getTest().log(Status.INFO,"btn Cancel is Display");
		try { 
			objPbbPage =  new PbbPages(driver);
			objPbbPage.btnCancelTangselIsDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test 
	public void pilihTahunPajak() {
		TestReportListener.getTest().log(Status.INFO,"Choose list pajak");
		try {
			objPbbPage =  new PbbPages(driver);
			objPbbPage.clickListPajak();
			objPbbPage.pilihTahunPajak();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Test 
	public void clickListPajakTangsel() {
		TestReportListener.getTest().log(Status.INFO,"choose list pajak");
		try {
			objPbbPage =  new PbbPages(driver);
			objPbbPage.clickListPajakTangsel();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Test 
	public void textInputTahunPajakIsDisplay() { 
		TestReportListener.getTest().log(Status.INFO,"input tahun pajak");
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.textInputPajakIsDisplay();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@Test
	public void textInputTahunPajakTangselIsDisplay() { 
		TestReportListener.getTest().log(Status.INFO,"input tahun pajak");
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.textInputPajakTangselIsDisplay();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
//	@Test 
//	public void pilihTahunPajak() {
//		TestReportListener.getTest().log(Status.INFO,"input tahun pajak");
//		try {
//			objPbbPage = new PbbPages(driver); 
//			objPbbPage.pilihTahunPajak();
//			Thread.sleep(6);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	} 
	
//	@Test 
//	public void pilihTahunPajakTangsel() {
//		TestReportListener.getTest().log(Status.INFO,"input tahun pajak");
//		try {
//			objPbbPage = new PbbPages(driver); 
//			objPbbPage.pilihTahunPajakTangsel();
//			Thread.sleep(6);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	} 
	
	@Test 
	public void validateInputInvalidMinNomorPajak() {
		TestReportListener.getTest().log(Status.INFO,"TS05-EP25 Input Invalid Min Nomor Pajak PBB");
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.clickBtnBayarPBB();
			objPbbPage.ErorMessageBpjsIsDisplay();
			Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
			
		}
	} 
	
	@Test 
	public void validateInputInvalidMaxNomorPajak() {
		TestReportListener.getTest().log(Status.INFO,"TS05-EP27 Input Invalid Max Nomor Pajak PBB");
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.clickBtnBayarPBB();
			objPbbPage.ErorMessageBpjsIsDisplay();
			Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
			
		}
	} 
	
	@Test 
	public void validateInputValidNomorPajak() {
		TestReportListener.getTest().log(Status.INFO,"TS05-EP29 Input Valid  Nomor Pajak PBB");
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.clickBtnBayarPBB();
			Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
	@Test 
	public void goToCheckoutPbbTangsel() {
		TestReportListener.getTest().log(Status.INFO,"Go To Checkout");
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.clickBtnBayarPBBTangsel();
			Thread.sleep(5);
		} catch (InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
	@Test 
	public void checkOutPbb() throws InterruptedException {
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
	
	@Test 
	public void goToPaymentCenterPBB() throws InterruptedException {
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
	@Test
	public void PilihAlatBayarPBB() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose Available Payment Methods");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPaymentIsaku();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	} 
	
	@Test 
	public void clickBayarPBB()  throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"Choose Available Payment Methods");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayarIsaku();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
		
	} 
	
//	@Test (priority=22)
//	public void TQPageTest() throws InterruptedException{
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
//	}
	
	@Test 
	public void DaftarTrxTestPBB() throws InterruptedException {
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
