package services;

import pages.AccountPage;
import pages.CartPage;
import pages.WomenPage;

public class WomenPageService {
    WomenPage womenPage = new WomenPage();
    LoginPageService loginPageService = new LoginPageService();
    AccountPage accountPage = new AccountPage();
    CartPage cartPage = new CartPage();

    public String addItemToCart() {
        loginPageService.login();
        accountPage.clickPageTitleWomen();
        womenPage.clickToAddToCartButton();
        womenPage.clickToContinueShoppingButton();
        return womenPage.getPriceOfItem();


    }

    public String getTitleItemInTheCart() {
        return cartPage.descriptionItemInTheCart();
    }

    public String changeTheCurrencyOnTheWebsite() {
        loginPageService.login();
        accountPage.clickPageTitleWomen();
        womenPage.clickCurrencyListButton();
        womenPage.clickCurrencySelectionButton();
        return womenPage.getText—urrencyPresenceOnThePage();

    }

    public String getText—urrencyPresenceOnThePage() {
        return womenPage.getText—urrencyPresenceOnThePage(); //‚‡Î˛Ú‡ Ì‡ ÒÚ‡ÌËˆÂ

    }

    public String getTextCurrencyOnTheSite() {
        return womenPage.getTextCurrencyOnTheSite();
    }

    public void changeTheLanguageOnTheWebsite() {
        loginPageService.login();
        accountPage.clickPageTitleWomen();
        womenPage.clickLanguageListButton();
        womenPage.clickLanguageListButton();
    }

    public String getTextLanguagePresenceOnThePage() {
        return womenPage.getTextLanguagePresenceOnThePage();
    }

    public String getTextLanguageOnTheSite() {
        return womenPage.getTextLanguageOnTheSite();
    }
}