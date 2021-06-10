package TestClass;

import PagesObject.ObjectPage_Login;
import PagesObject.ObjectPage_Products;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class Products extends Utility {
	ObjectPage_Products objectPage_products;

	  	@Test 
	  	public void AddProduct(){
	  		TestReportListener.getTest().log(Status.INFO,"TS01-Go To Website");
			try {
				Thread.sleep(2000);
				driver.navigate().to("https://www.klikindomaret.com/product/cussons-imperial-leather-shower-gel");
				objectPage_products  = new ObjectPage_Products(driver);
				objectPage_products.clickGuideProdukTerdekat();
				objectPage_products.clickTambahKuantitas();
				objectPage_products.clickKurangiKuantitas();
				objectPage_products.clickTambahKuantitas();
				objectPage_products.clickTombolBeli();
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	  	

//			driver.get("https://www.klikindomaret.com/product/pencuci-piring-new-1");

		
} 


