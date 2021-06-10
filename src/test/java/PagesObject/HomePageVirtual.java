package PagesObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.NoSuchElementException;
//import sun.awt.image.URLImageSource;

public class HomePageVirtual extends BasePage {
	public WebDriver driver; 
		
	
	 @FindBy(xpath="//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[1]/div/a[1]")
	 public WebElement logoIdm;  
	 @FindBy(css = "<img src=\"/Assets/image/virtual_logo.png\">")
	 public WebElement urlImageLogo;
	 @FindBy(id="downloadApp")
	 public WebElement downloadApp ;  
	 @FindBy(xpath="//*[@id=\"follow_us\"]/a[1]")
	 public WebElement linkFacebook;   
	 @FindBy(xpath="//*[@id=\"follow_us\"]/a[2]") 
	 public WebElement linkInstagram;  
	 @FindBy(xpath="//*[@id=\"siteHeader\"]/div[1]/div/div[1]/div[2]/div[1]") 
	 public WebElement layananPelanggan; 
	 @FindBy(xpath="//*[@id=\"itemStatus\"]")
	 public WebElement daftarTrxHome; 
	 @FindBy(id="itemSaldo")
	 public WebElement itemSaldoHome;   
	 @FindBy(id="dropdownUser")
	 public WebElement profileUser;
	 @FindBy(name="search")
	 public WebElement search;
	 @FindBy(xpath="//*[@id=\"site-content\"]/div[1]")
	 public WebElement bannerVirtual; 
	 @FindBy (xpath ="//*[@id=\"site-content\"]/div[1]/div/div[3]")
	 public WebElement btnPrevBannerVirtual;
	 @FindBy (xpath ="//*[@id=\"site-content\"]/div[1]/div/div[4]")
	 public WebElement btnNextBannerVirtual;
	 
	 
	 @FindBy(xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[1]/div")
	 public WebElement categoryPulsa;  
	 @FindBy(xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[2]/div")
	 public WebElement categoryEmoney; 
	 @FindBy(xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[3]/div")
	 public WebElement categoryEsamsat;  
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[4]/div")
	 public WebElement categoryPLN;  
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[5]/div")
	 public WebElement categoryBPJS; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[6]/div")
	 public WebElement categoryInternetTvKabel; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[7]/div")
	 public WebElement categoryVoucherGame; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[8]/div")
	 public WebElement categoryStreaming; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[9]/div")
	 public WebElement categoryGas; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[10]/div")
	 public WebElement categoryPBB; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[11]/div")
	 public WebElement categoryPDAM; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[12]/div")
	 public WebElement categoryTelkomTelpon; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[13]/div")
	 public WebElement categoryIPL; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[14]/div")
	 public WebElement categoryAsuransi; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[15]/div")
	 public WebElement categoryMultiFinance; 
	 @FindBy(xpath ="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[16]/div")
	 public WebElement categoryPendidikan;
	 
	 @FindBy (xpath="//*[@id=\"listprod0\"]")
	 public WebElement resultSearchSamsatBanten; 
	 @FindBy (xpath="//*[@id=\"listCat5\"]") 
	 public WebElement resultSearchPulsa; 
	 @FindBy (xpath="//*[@id=\"listprod0\"]")
	 public WebElement resultSearchPLN; 
	 @FindBy (xpath="//*[@id=\"listprod0\"]") 
	 public WebElement resultSearchBPJS; 
	 @FindBy (xpath="//*[@id=\"listprod0\"]")
	 public WebElement resultSearchPBB; 
	 @FindBy (xpath="//*[@id=\"listprod0\"]")
	 public WebElement resultSearchPDAM;
	 
	public HomePageVirtual(WebDriver driver) {
		super(driver);
		this.driver =driver;
	}
	
	public  void  logoIsDisplay() {
		try { 
			//waitElement();
			waitElementClickable(logoIdm);
			Boolean status = logoIdm.isDisplayed();
			Assert.assertTrue(status);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		
	} 
	
	public  void  downloadAppIsDisplay() throws NoSuchElementException {
		try { 	
			//waitElement();
			waitElementClickable(downloadApp);
			Boolean status = downloadApp.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		
	}
		
		
	public void facebookIsDisplay() throws NoSuchElementException {
			try {
			//	waitElement();
				waitElementClickable(linkFacebook);
				Boolean status = linkFacebook.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
	} 

	public void instagramIsDisplay() throws NoSuchElementException {
		try { 
			//waitElement();
			waitElementClickable(linkInstagram);
			Boolean status = linkInstagram.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	}  
	
	public void layananIsDisplay() throws NoSuchElementException {
		try { 
			//waitElement();
			waitElementClickable(layananPelanggan);
			Boolean status = layananPelanggan.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	} 
	
	public void daftarTrxIsDisplay() throws NoSuchElementException {
		try { 
			//waitElement();
			waitElementClickable(daftarTrxHome);
			Boolean status = daftarTrxHome.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
		
		} 
	}  
	
	public void itemSaldoIsDisplay() throws NoSuchElementException {
		try { 
			//waitElement();
			waitElementClickable(itemSaldoHome);
			Boolean status = itemSaldoHome.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	}  

	public void profileIsDisplay() throws NoSuchElementException {

		try { 
			//waitElement();
			waitElementClickable(profileUser);
			Boolean status = profileUser.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	} 
	

	public void searchIsDisplay() {
		try { 
			waitElementClickable(search);
		//	waitElement();
			Boolean status = search.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	} 
	//-------------------search----------------------
	public void searchSamsatKeyword(String strKeywordSamsat) {
		try {
			waitElementClickable(search);	
		//	waitElement(); 
			search.sendKeys(strKeywordSamsat);
			Thread.sleep(10);
			
		}	catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	public void searchPulsaKeyword	(String strKeywordPulsa) {
		try {
			//waitElement(); 
			waitElementClickable(search);
			search.clear();
			search.sendKeys(strKeywordPulsa);
			Thread.sleep(1000);
			
		} 	catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	public void searchPLNKeyword	(String strKeywordPLN) {
		try {
			//waitElement(); 
			
			waitElementClickable(search);
			search.clear();
			search.sendKeys(strKeywordPLN);
			Thread.sleep(1000);
			
			} 	catch (InterruptedException e) {
			e.printStackTrace();
			}
	} 
	
	public void searchBPJSKeyword	(String strKeywordBPJS) {
		try {
			//waitElement(); 
			waitElementClickable(search);
			search.clear();
			search.sendKeys(strKeywordBPJS);
			Thread.sleep(1000);
			
			} 	catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	public void searchPBBKeyword (String strKeywordPBB) {
		try {
			//waitElement(); 
			waitElementClickable(search);
			search.clear();
			search.sendKeys(strKeywordPBB);
			Thread.sleep(1000);
			
			} 	catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	public void searchPDAMKeyword (String strKeywordPDAM) {
		try {
			//waitElement(); 
			waitElementClickable(search);
			search.clear();
			search.sendKeys(strKeywordPDAM);
			Thread.sleep(1000);
			
			} 	catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	
	public void clickSearchSamsatKeyword() {
		try {
			waitElementClickable(resultSearchSamsatBanten);
			resultSearchSamsatBanten.click();
			Thread.sleep(1000);
			String expectedResult = "https://virtual.klikindomaret.com/category/ESamsat?permalink=e-samsat-jawa-timur&productid=0deb539c-928d-4198-ac57-36ca5e27e44e";
			String actualResult = driver.getCurrentUrl();
			Assert.assertEquals(expectedResult, actualResult);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
	} 
	
	public void clickSearchPulsaKeyword() { 
		try {
			//waitElement(); 
			waitElementClickable(resultSearchPulsa);
			resultSearchPulsa.click();
			Thread.sleep(1000);
			String expectedResult = "https://virtual.klikindomaret.com/?fde94763-8c56-45a3-abc9-6efe422f321c";
			String actualResult = driver.getCurrentUrl();
			Assert.assertEquals(expectedResult, actualResult);
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void clickSearchPLNKeyword() { 
		try {
			//waitElement(); 
			waitElementClickable(resultSearchPLN);
			resultSearchPLN.click();
			Thread.sleep(1000);
			String expectedResult = "https://virtual.klikindomaret.com/category/pln?permalink=pra-bayar&productid=3f74698b-6cc6-4f84-b507-bb02eb2f9567";
			String actualResult = driver.getCurrentUrl();
			Assert.assertEquals(expectedResult, actualResult);
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void clickSearchBPJSKeyword() { 
		try {
			//waitElement(); 
			new WebDriverWait(driver, 60)

            .until(ExpectedConditions.elementToBeClickable(resultSearchBPJS));
			//waitElementClickable();
			resultSearchBPJS.click();
			Thread.sleep(1000);
			String expectedResult = "https://virtual.klikindomaret.com/category/bpjs?permalink=bpjs-kesehatan&productid=d45cd255-b92a-47db-bc2b-54a519403a2a";
			String actualResult = driver.getCurrentUrl();
			Assert.assertEquals(expectedResult, actualResult);
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSearchPBBKeyword() { 
		try {
			//waitElement(); 
			//waitElementClickable(resultSearchPBB);
			new WebDriverWait(driver, 60)

            .until(ExpectedConditions.elementToBeClickable(resultSearchPBB));
			resultSearchPBB.click();
			Thread.sleep(1000);
			String expectedResult = "https://virtual.klikindomaret.com/category/pbb?permalink=pbb-dki-jakarta&productid=9ab3cce3-22e1-4f73-a228-cd5ef58b92bd";
			String actualResult = driver.getCurrentUrl();
			Assert.assertEquals(expectedResult, actualResult);
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSearchPDAMKeyword() { 
		try {
			//waitElement(); 
			waitElementClickable(resultSearchPDAM);
			resultSearchPDAM.click();
			Thread.sleep(1000);
			String expectedResult = "https://virtual.klikindomaret.com/category/pdam";
			String actualResult = driver.getCurrentUrl();
			Assert.assertEquals(expectedResult, actualResult);
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//-------------------------search end------------
	public void bannerIsDisplay() throws NoSuchElementException {
		try { 
			//waitElement();
			waitElementClickable(bannerVirtual);
			Boolean status = bannerVirtual.isDisplayed();
			Assert.assertTrue(status);	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	
	}
	
	public void btnNextBannerVirtualValidate() throws NoSuchElementException {
		try {
			waitElementClickable(btnNextBannerVirtual);
			Boolean status = bannerVirtual.isDisplayed();
			Assert.assertTrue(status);	
			btnNextBannerVirtual.click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public void btnPrevBannerVirtualValidate() throws NoSuchElementException {
		try {
			waitElementClickable(btnPrevBannerVirtual);
			Boolean status = btnPrevBannerVirtual.isDisplayed();
			Assert.assertTrue(status);	
			btnPrevBannerVirtual.click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	//-----------------------validate category-------------------------
	 public void categoryPulsaIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				//waitElementClickable(categoryEmoney);
				Boolean status = categoryPulsa.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryPulsa() throws NoSuchElementException {
		 try { 
			//	waitElement();
				waitElementClickable(categoryPulsa);
				categoryPulsa.click();
				String expectedUrl = "https://virtual.klikindomaret.com/" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl); 
				
				 String expectedTitle = "Beli Pulsa Online, Mudah & Aman | KlikIndomaret" ;
			        String actualTitle = driver.getTitle();
			        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		}  
	
	public void getTitlePulsa() {
		 String expectedTitle = "Beli Pulsa Online, Mudah & Aman | KlikIndomaret";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
	} 
	
	 
	 public void categoryEmoneyIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				//waitElementClickable(categoryEmoney);
				Boolean status = categoryEmoney.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryEmoney() throws NoSuchElementException {
		 try { 
			//	waitElement();
				waitElementClickable(categoryEmoney);
				categoryEmoney.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/EWallet" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl); 
				
				 String expectedTitle = "Bayar dan Ewallet, Mudah & Aman | KlikIndomaret" ;
			        String actualTitle = driver.getTitle();
			        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void categoryESamsatIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				//waitElementClickable(categoryEsamsat);
				Boolean status = categoryEsamsat.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryEsamsat() throws NoSuchElementException {
		 try { 
			//	waitElement();
				waitElementClickable(categoryEsamsat);
				categoryEsamsat.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/ESamsat" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl); 
				
				 String expectedTitle = "Bayar dan Cek Tagihan Angsuran Kredit Multifinance Online, Mudah & Aman | KlikIndomaret";
			        String actualTitle = driver.getTitle();
			        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void categoryPLNIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryPLN.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryPln() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryPLN);
				categoryPLN.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/pln" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
					
				String expectedTitle = "Beli Token Listrik dan Bayar Tagihan PLN Online, Mudah & Aman | KlikIndomaret";
		     
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 

	 public void categoryBPJSIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryBPJS.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryBpjs() throws NoSuchElementException {
		 try { 
			 	waitElementClickable(categoryBPJS);
				categoryBPJS.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/bpjs" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar BPJS Kesehatan dan Ketenagakerjaan Online, Mudah & Aman | KlikIndomaret";
		     
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		}
	 
		 
	 public void categoryInternetTVKabelIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryInternetTvKabel.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryInternetTVKabel() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryInternetTvKabel);
				categoryInternetTvKabel.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/internettv" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Internet / TV Kabel Online, Mudah & Aman | KlikIndomaret";
		    
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		} 
	 
	 public void categoryVoucherGameIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryVoucherGame.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryVoucherGame() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryVoucherGame);
				categoryVoucherGame.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/gameonline" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Beli Voucher Game Online, Mudah & Aman | KlikIndomaret";
		        
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		} 

	 public void categoryStreamingIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryStreaming.isDisplayed();
				Assert.assertTrue(status);
				
				
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryStreaming() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryStreaming);
				categoryStreaming.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/Streaming" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Beli kode redeem untuk produk streaming, Mudah & Aman | KlikIndomaret";
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		} 


	 public void categoryGasIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryGas.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryGas() throws NoSuchElementException {
		 try { 
			 	waitElementClickable(categoryGas);
				categoryGas.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/pgn" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Gas PGN Online, Mudah & Aman | KlikIndomaret";
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		} 
	 
	 public void categoryPBBIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryPBB.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryPBB() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryPBB);
				categoryPBB.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/pbb" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl); 
				
				String expectedTitle = "Bayar dan Cek Tagihan Pajak PBB Online, Mudah & Aman | KlikIndomaret";
		      
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		} 
	 
	 public void categoryPDAMIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryPDAM.isDisplayed();
				Assert.assertTrue(status);
				
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryPDAM() throws NoSuchElementException {
		 try { 
			 	waitElementClickable(categoryPDAM);
				categoryPDAM.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/pdam" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Air PDAM Online, Mudah & Aman | KlikIndomaret";
				
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
		        
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		} 

	 public void categoryTelkomTelponIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryTelkomTelpon.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryTelkomTelpon() throws NoSuchElementException {
		 try { 
			 	waitElementClickable(categoryTelkomTelpon);
				categoryTelkomTelpon.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/telponpascabayar" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Telpon Pasca Bayar, Mudah & Aman | KlikIndomaret";
		        
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			
			} 
		} 
	 
	 
		 public void categoryIPLIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryIPL.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryIPL() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryIPL);
				categoryIPL.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/ipl" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Iuran Pemeliharaan Lingkungan - IPL, Mudah & Aman | KlikIndomaret";
				
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		} 


	 public void categoryAsuransiIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryAsuransi.isDisplayed();
				Assert.assertTrue(status);
				
				
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryAsuransi() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryAsuransi);
				categoryAsuransi.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/asuransijiwa" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Asuransi Mudah & Online | KlikIndomaret";
		       
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			
			} 
		} 

	 public void categoryMultiFinanceiIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryMultiFinance.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 
	 public void validateCategoryMultiFinance() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryMultiFinance);
				categoryMultiFinance.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/multifinance" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Angsuran Kredit Multifinance Online, Mudah & Aman | KlikIndomaret";
				
				String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			
			} 
		} 
	 
	 public void categoryPendidikaniIsDisplay() throws NoSuchElementException {
			try { 
				waitElement();
				Boolean status = categoryPendidikan.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
		
		} 
	 
	 public void validateCategoryPendidikan() throws NoSuchElementException {
		 try { 
				waitElementClickable(categoryPendidikan);
				categoryPendidikan.click();
				String expectedUrl = "https://virtual.klikindomaret.com/category/pendidikan" ;
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl, actualUrl);
				
				String expectedTitle = "Bayar dan Cek Tagihan Pendidikan Sekolah, Mudah & Aman | KlikIndomaret";
		        String actualTitle = driver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);	
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			
			} 
		} 

} 



