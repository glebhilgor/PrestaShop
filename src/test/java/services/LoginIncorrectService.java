package services;

import pages.LoginPage;

import static utils.Data.*;

public class LoginIncorrectService {
    protected User user = new User();
    protected LoginPage loginPage = new LoginPage();

    public LoginPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInEmailAddress(EMAIL)
                .fillInPassword(PASSWORD_FALSE)
                .clickSignInButton();
        return new LoginPage();


    }
}