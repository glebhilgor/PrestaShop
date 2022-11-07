package services;

import org.openqa.selenium.WebDriver;
import pages.CreateNewAccountPage;
import pages.LoginPage;

import static utils.Data.*;

public class CreateNewAccountService {

    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    LoginPageService loginPageService = new LoginPageService();
    LoginPage loginPage = new LoginPage();
    WebDriver driver;

    public void createNewAccountFailed() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillEmailCreate(EMAIL_CREATE_FAILED)
                .clickCreateAnAccountButton();
    }

    public String getTextInvalidEmailMessage() {
        return loginPage.getTextInvalidEmailMessage();
    }


    public void createNewAccount() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillEmailCreate(EMAIL_CREATE)
                .clickCreateAnAccountButton(); // нужно ожидание
        createNewAccountPage.clickTitle();
        createNewAccountPage.fillInFirstName(FIRST_NAME);
        createNewAccountPage.fillInLastName(LAST_NAME);
        createNewAccountPage.fillInPassword(PASSWORD_CREATE);
        createNewAccountPage.clickRegisterButton();
    }

    public String getTextPageName() {
        return loginPage.getTextMessageAboutCreating();


    }

}