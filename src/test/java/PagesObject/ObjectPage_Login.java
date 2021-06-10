package PagesObject;

import base.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ObjectPage_Login extends BasePage {
	public WebDriver driver;
	public ObjectPage_Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "ematic_background_overlay")
	public WebElement overlayBG;
	public void clickUntukHilangkanOverlayHomePage(){
		try {
			waitElement();
			waitForVisibility(overlayBG);
			overlayBG.click();
		}catch (NoSuchElementException e){
			e.printStackTrace();
		}
	}

	@FindBy(name="Email")
	public WebElement userName;
	public void setUsername(String strUsername){
		try {
			waitElement();
			userName.sendKeys(strUsername);
			Reporter.log("kolom USERNAME berhasil diinput");
		} catch  (org.openqa.selenium.NoSuchElementException e) {
			e.printStackTrace();
			Reporter.log("Kolom NAMA tidak berhasil diinput");
			// TODO: handle exception
		}
	}

	@FindBy(name="Password")
	public  WebElement password;
	public void setPassword(String strPassword)
	{
		try {
			waitElement();
			password.sendKeys(strPassword);
			Reporter.log("Kolom PASSWORD berhasil diinput");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Kolom PASSWORD tidak berhasil diinput!!");
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	@FindBy(xpath ="//*[@id=\"site-content\"]/div/div/div[1]/div/form/div[2]/button")
	public  WebElement login;
	public void clickSubmitLogin(){
		try {
			waitElement();
			login.click();
			Reporter.log("Tombol Submit untuk Login berhasil ditap");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			e.printStackTrace();
			Reporter.log("Tombol Submit untuk Login tidak berhasil ditap!");
			// TODO: handle exception
		}
	}


	@FindBy(xpath  = "//a[contains(.,'Masuk')]")
	public WebElement btnMasuk;
	public void clickTombolMasuk(){
		try {
			waitElement();
			waitForVisibility(btnMasuk);
			btnMasuk.click();
			System.out.println("Tombol Masuk berhasil ditap");
			Reporter.log("Tombol Masuk berhasil ditap");
		}catch (org.openqa.selenium.NoSuchElementException e){
			e.printStackTrace();
			Reporter.log("Tombol Masuk tidak berhasil ditap!");
			System.out.println("Tombol Masuk tidak berhasil ditap!");
		}
	}

	public void AlertOnLogin() throws java.util.NoSuchElementException {
		try {
			waitElementLong();
			alertLogin();
			Thread.sleep(10);

		}catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	//    @FindBy(name = "Mulai Belanja")
//    @FindBy(xpath = "//a[contains(.,'Mulai Belanja')]")
	@FindBy(xpath = "//span[text()='Mulai Belanja']")
	public WebElement btnMulaiBelanja;
	public void clickGuideMulaiBelanja(){
		try {
			waitElement();
			btnMulaiBelanja.click();
			Reporter.log("Guide mulai belanja berhasil ditap");
		}catch (NoSuchElementException e){
			e.printStackTrace();
			System.out.println("Guide mulai belanja tidak berhasil ditap");
		}
	}

	@FindBy(name = "search")
	public WebElement kolomSearch;
	public String getTextSearch(){
		waitElement();
		waitForVisibility(kolomSearch);
		return getAttribute(kolomSearch, "placeholder");
	}
} 
