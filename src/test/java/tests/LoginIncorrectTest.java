package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AccountPage;
import services.LoginIncorrectService;
import services.LoginPageService;

public class LoginIncorrectTest extends BaseTest {

    LoginIncorrectService loginIncorrectService;

    @BeforeClass
    public void setUp() {
        loginIncorrectService = new LoginIncorrectService();
        LoginPage loginPage = new LoginPage();
    }

    @Test
    public void loginPageInvalidTest() {
        LoginPage loginPage = loginIncorrectService.login();
        String actualTextOfMainPage = loginPage.getTextAuthenticationFailed();
        String expectedTextAuthenticationFailed = loginPage.getTextOfNameOfMainPageSection();
        Assert.assertEquals(actualTextOfMainPage, expectedTextAuthenticationFailed, "The actual text of " +
                "the page does not match expected!");
    }
}