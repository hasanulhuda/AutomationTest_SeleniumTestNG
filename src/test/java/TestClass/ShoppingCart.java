package TestClass;

import PagesObject.ObjectPage_Products;
import PagesObject.ObjectPage_ShoppingCart;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import report.TestReportListener;
import utils.Utility;

public class ShoppingCart extends Utility {
	ObjectPage_ShoppingCart objectPage_shoppingCart;

	  	@Test 
	  	public void ShoppingCart(){
	  		TestReportListener.getTest().log(Status.INFO,"to Shopping Cart");
			try {
				Thread.sleep(5000);
//				driver.navigate().to("https://www.klikindomaret.com/product/pencuci-piring-new-1");
				objectPage_shoppingCart  = new ObjectPage_ShoppingCart(driver);
				objectPage_shoppingCart.clickIkonShoppingCart();
				Thread.sleep(20);
				String ActualText = objectPage_shoppingCart.getTextTombolBayarSekarang();
				String ExpectedText = "Bayar Sekarang";

				Assert.assertEquals(ActualText, ExpectedText);
				System.out.println("Actual: "+ActualText);
				objectPage_shoppingCart.clickTombolBayarSekarang();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	  	

//			driver.get("https://www.klikindomaret.com/product/pencuci-piring-new-1");

		
} 


