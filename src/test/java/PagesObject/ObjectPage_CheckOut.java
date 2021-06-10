package PagesObject;

import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ObjectPage_CheckOut extends BasePage {
	public WebDriver driver;
	public ObjectPage_CheckOut(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	@FindBy(id = "btnMobile-checkout-step1")
	@FindBy(xpath = "//*[@id=\"btnMobile-checkout-step1\"]")
//	@FindBy(css = "#btnMobile-checkout-step1")
	public WebElement btnCheckOut;
	public void clickTombolCheckOut(){
		try {
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click()", btnCheckOut);
			waitElement();
//			waitElementClickable(btnCheckOut);
//			btnCheckOut.click();
		}catch (NoSuchElementException e){
			e.printStackTrace();
			Reporter.log("");
		}
	}

//	@FindBy(xpath = "//span[text()='Checkout']")
	@FindBy(xpath = "//div[@class=\"text-reminder\"]")
	public WebElement textCheckout;
	public String getTextCheckout(){
		try {
			waitElement();
			waitForVisibility(textCheckout);
		}catch (NoSuchElementException e){
			e.printStackTrace();
		}
		return getText(textCheckout, "Text");
	}

//	@FindBy(css = "span[class='icon headerClick']")
	@FindBy(xpath = "//div[@class=\"cart-count headerClick\"]")
//	@FindBy(xpath = "//span[@class = 'icon headerClick']")
	@CacheLookup
	public WebElement iconShoppingCart;
	public void clickIkonShoppingCart(){
		try {
			waitElement();
			waitForVisibility(iconShoppingCart);
			iconShoppingCart.click();
			Reporter.log("ikon [Shopping Cart] berhasil ditap");
		}catch (NoSuchElementException e){
			e.printStackTrace();
			Reporter.log("ikon [Shopping Cart] TIDAK dapat ditemukan");
		}
	}

	@FindBy(id = "btn-cart-checkout")
	public WebElement btnBayarSekarang;
	public String getTextTombolBayarSekarang(){
		try {
			waitElement();
			waitForVisibility(btnBayarSekarang);
		}catch (NoSuchElementException e){
			e.printStackTrace();
		}
		return getAttribute(btnBayarSekarang, "Text");
	}
	public void clickTombolBayarSekarang(){
		try {
			waitElement();
			btnBayarSekarang.click();
		}catch (NoSuchElementException e){
			e.printStackTrace();
			Reporter.log("");
		}
	}
} 
