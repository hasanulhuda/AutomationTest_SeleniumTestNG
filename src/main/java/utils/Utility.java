package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Utility {
    public String testUrl ;
    public static WebDriver driver;

    @BeforeSuite
    public void startApps() {
//		System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver90.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\GIT SERVER\\Virtual_Web\\driver\\chromedriver90.exe");
        testUrl = "https://klikindomaret.com/";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //maximize window
        driver.manage().window().maximize();
        // driver.navigate().to(testUrl);
        driver.get(testUrl);
    }


    @AfterSuite
    public void closeApp() {
//        driver.quit();
    }
}
