package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;
import pages.AccountPage;
import services.LoginPageService;

import static utils.Data.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class LoginTest extends BaseTest {

    LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        LoginPage loginPage = new LoginPage();
    }

    @Test
    public void loginTest() {
        AccountPage accountPage = loginPageService.login();
        String actualTextOfMainPage = accountPage.getTextPageName();
        Assert.assertEquals(actualTextOfMainPage,EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE, "The actual " +
                "text of the page does not match expected!");
    }


}