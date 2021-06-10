package TestClass;

import PagesObject.HomePageVirtual;
import PagesObject.LoginPage;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class HomePageTest extends Utility {
	
	HomePageVirtual objHomePage;
	LoginPage objLogin; 
	public String testUrl;


	@Test 
	public void goToLoginPage() { 
		TestReportListener.getTest().log(Status.INFO,"TS01-Go To Website");
		try {
			objLogin  = new LoginPage(driver);
			
			objLogin.clickButtonLoginHome();
			
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	
	@Test 
	public void testLogin() {
		TestReportListener.getTest().log(Status.INFO,"TS01-EP05 - Login Valid Username and Valid Password for HomePageTest");
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
	public void UITestLogo() {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC01 Validate Logo Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.logoIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void verifyPageTitle() {
		try { 
			TestReportListener.getTest().log(Status.INFO,"Validate Title Virtual KlikIndomaret");
			String expectedTitle = "Beli Pulsa Online, Mudah & Aman | KlikIndomaret";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} 
	
	@Test 
	public void UITestFacebook() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC02 Validate Icon Facebook is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.facebookIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test
	public void UITestInstagram() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC03 Validate Icon Instagram is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.instagramIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 

	@Test 
	public void UITestDownload() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC04 Validate Download Apps Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.downloadAppIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test 
	public void UITestLayananPelanggan() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC05 Validate Customer Care Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.layananIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	} 
	
	@Test 
	public void UITestDaftarTrx() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC06 Validate Order History Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.daftarTrxIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void UITestItemSaldo() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC07 Validate Item Saldo Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.itemSaldoIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 

	@Test 
	public void UITestUserProfile() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC08 Validate Profile Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.profileIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	} 
	
	@Test 
	public void UITestSearch() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC09 Validate Search Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.searchIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	
	@Test 
	public void UITestBanner() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC10 Validate Banner Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.bannerIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	} 
	
	@Test 
	public void btnNextBannerVirtualValidate() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC11 Validate Next Button Banner Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.btnNextBannerVirtualValidate();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	@Test 
	public void btnPrevBannerVirtualValidate() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS02-TC12 Validate Prev Button Banner Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.btnPrevBannerVirtualValidate();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	
	@Test 
	public void searchPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC11 Validate Search With Keyword 'Pulsa' ");
		try { 
			objHomePage  = new HomePageVirtual(driver);	
			objHomePage.searchPulsaKeyword("Pulsa");
			objHomePage.clickSearchPulsaKeyword();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void searchPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC12 Validate Search With Keyword 'Token' ");

		try { 
			objHomePage  = new HomePageVirtual(driver);	
			objHomePage.searchPLNKeyword("Token");
			objHomePage.clickSearchPLNKeyword();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void searchSamsat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC13 Validate Search With keyword 'Samsat Jawa Timur' ");

		try { 
			objHomePage  = new HomePageVirtual(driver);	
			objHomePage.searchSamsatKeyword("Samsat Jawa timur");
			objHomePage.clickSearchSamsatKeyword();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test 
	public void searchBPJS() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC14 Validate Search With Keyword 'BPJS Sehat' ");

		try { 
			objHomePage  = new HomePageVirtual(driver);	
			objHomePage.searchBPJSKeyword("BPJS sehat");
			objHomePage.clickSearchBPJSKeyword();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test 
	public void searchPBB() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC15 Validate Search With Keyword 'PBB Jakarta'");

		try { 
			objHomePage  = new HomePageVirtual(driver);	
			objHomePage.searchPBBKeyword("PBB Jakarta");
			objHomePage.clickSearchPBBKeyword();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test
	public void searchPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC16 Validate Search With Keyword 'PDAM Yogyakarta' ");
		try { 
			objHomePage  = new HomePageVirtual(driver);	
			objHomePage.searchPDAMKeyword("PDAM yogyakarta");
			objHomePage.clickSearchPDAMKeyword();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}  

	@Test 
	public void validateCategoryPulsa() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC17 Validate Category Pulsa & Paket Data");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPulsaIsDisplay(); 
			objHomePage.validateCategoryPulsa();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void validateCategoryEmoney() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC18 Validate Category Uang Elektronik");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryEmoneyIsDisplay(); 
			objHomePage.validateCategoryEmoney();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryESasmat() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC19 Validate Category ESamsat");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryESamsatIsDisplay(); 
			objHomePage.validateCategoryEsamsat();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryPLN() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC20 Validate Category PLN");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPLNIsDisplay(); 
			objHomePage.validateCategoryPln();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void validateCategoryBPJS() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC21 Validate Category BPJS");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryBPJSIsDisplay(); 
			objHomePage.validateCategoryBpjs();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryInternet() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC22 Validate Category Internet dan TV Kabel");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryInternetTVKabelIsDisplay(); 
			objHomePage.validateCategoryInternetTVKabel();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryGame() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC23 Validate Category Voucher Game");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryVoucherGameIsDisplay(); 
			objHomePage.validateCategoryVoucherGame();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryStreaming() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC24 Validate Category Streaming");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryStreamingIsDisplay(); 
			objHomePage.validateCategoryStreaming();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryGas() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC25 Validate Category Gas");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryGasIsDisplay(); 
			objHomePage.validateCategoryGas();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryPBB() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC26 Validate Category PBB");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPBBIsDisplay(); 
			objHomePage.validateCategoryPBB();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void validateCategoryPDAM() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC27 Validate Category PDAM");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPDAMIsDisplay(); 
			objHomePage.validateCategoryPDAM();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test 
	public void validateCategoryTelomPascaBayar() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC28 Validate Category Telkom & Telpon (Pasca Bayar)");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryTelkomTelponIsDisplay(); 
			objHomePage.validateCategoryTelkomTelpon();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void validateCategoryIPL() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC29 Validate Category Iurang Pemeliharaan Lingkungan");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryIPLIsDisplay(); 
			objHomePage.validateCategoryIPL();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void validateCategoryAsuransi() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC30 Validate Category Asuransi");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryAsuransiIsDisplay(); 
			objHomePage.validateCategoryAsuransi();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void validateCategoryMultiFinance() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC31 Validate Category Multi Finance");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryMultiFinanceiIsDisplay(); 
			objHomePage.validateCategoryMultiFinance();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void validateCategoryPendidikan() throws InterruptedException {
		TestReportListener.getTest().log(Status.INFO,"TS03-TC32 Validate Category Pendidikan");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPendidikaniIsDisplay(); 
			objHomePage.validateCategoryPendidikan();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	
//	@Test (priority=12)
//	public void ValidateCategoryPulsa() {
//		try { 
//			
//		}
	//}
}
