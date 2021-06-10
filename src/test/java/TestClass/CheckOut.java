package TestClass;

import PagesObject.ObjectPage_CheckOut;
import PagesObject.ObjectPage_ShoppingCart;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class CheckOut extends Utility {
	ObjectPage_CheckOut objectPage_checkOut;

	  	@Test 
	  	public void CheckOut(){
	  		TestReportListener.getTest().log(Status.INFO,"to Shopping Cart");
			try {
//				driver.navigate().to("https://www.klikindomaret.com/product/pencuci-piring-new-1");
				objectPage_checkOut  = new ObjectPage_CheckOut(driver);
				String ActualText = objectPage_checkOut.getTextCheckout();
				String ExpectedText = "Pengiriman pesanan akan menyesuaikan pembatasan jam operasional sesuai Ketentuan Pemerintah";

				Assert.assertEquals(ActualText, ExpectedText);
				System.out.println("Actual: "+ActualText);
				Thread.sleep(3000);
				objectPage_checkOut.clickTombolCheckOut();
				Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	  	

//			driver.get("https://www.klikindomaret.com/product/pencuci-piring-new-1");

		
} 


