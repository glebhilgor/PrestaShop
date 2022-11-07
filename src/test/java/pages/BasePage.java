package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverSingleton;


public class BasePage {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private final static int WAIT_TIMEOUT_SECONDS = 10;

    protected BasePage() {

        PageFactory.initElements(driver, this);
    }
}


