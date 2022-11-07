package services;

import pages.AccountPage;
import pages.LoginPage;

import static utils.Data.*;

public class LoginPageService {


    protected LoginPage loginPage = new LoginPage();
    protected User user = new User();

    public AccountPage login() {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInEmailAddress(EMAIL)
                .fillInPassword(PASSWORD_CREATE)
                .clickSignInButton();
        return new AccountPage();
    }
}
