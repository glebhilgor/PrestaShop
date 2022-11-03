package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    CartPage cartPage;
    DressesLinkPage dressesLinkPage;
    WomenLinkPage womenLinkPage;
    TshirtsLinkPage tshirtsLinkPage;
    RegistrationPage registrationPage;


    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            //options.setHeadless(true);
            driver = new ChromeDriver(options);
        } else if (browser.equals("edge")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPage = new LoginPage(driver);
        cartPage = new CartPage(driver);
        dressesLinkPage = new DressesLinkPage(driver);
        womenLinkPage = new WomenLinkPage(driver);
        tshirtsLinkPage = new TshirtsLinkPage(driver);
        registrationPage = new RegistrationPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
