package services;

import org.openqa.selenium.Alert;
import pages.AccountPage;
import pages.AddressPage;
import utils.DriverSingleton;

import static utils.Data.*;

public class AddressService {
    AddressPage addressPage = new AddressPage();
    LoginPageService loginPageService = new LoginPageService();
    AccountPage accountPage = new AccountPage();


    public void createYourAddressErrors() {
        loginPageService.login();
        accountPage.clickNameAddMyFirstAddressButton();
        addressPage.fillInFirstName(FIRST_NAME)
                .fillInLastName(LAST_NAME)
                .fillAddress(ADDRESS)
                .fillInZipCode(ZIPCODE)
                .fillInCity(CITY)
                .fillInPhoneHome(HOME_PHONE)
                .fillInPhoneMobile(MOBILE_PHONE)
                .clickSaveAddressButton();
    }

    public String getTheTextAddressError() {

        return addressPage.getTheTextAddressError();
    }

    public void createYourAddress() {
        loginPageService.login();
        accountPage.clickNameAddMyFirstAddressButton();
        addressPage.fillInFirstName(FIRST_NAME)
                .fillInLastName(LAST_NAME)
                .fillAddress(ADDRESS)
                .fillInZipCode(ZIPCODE)
                .fillInCity(CITY)
                .fillInPhoneHome(HOME_PHONE)
                .fillInPhoneMobile(MOBILE_PHONE)
                .clickDropDownListButton();
        addressPage.clickNameStateButton(STATE);//«ƒ≈—№ ѕјƒј≈“ , здесь не клик а выбор по  букве
        addressPage.clickSaveAddressButton();

    }

    public String getTheNameAboutCreatingNewAddress() {

        return addressPage.getTheTextAboutCreatingNewAddress();
    }

    public String getTheTitleBlockNameMyAddress() {

        return addressPage.getTheTextAboutCreatingNewAddress();
    }

    Alert alert;

    public void deleteAddress() {
        addressPage.openPage(PAGE_URL_ADDRESS)
                .clickDeleteAddressButton();
        alert = DriverSingleton.getDriver().switchTo().alert();
        alert.accept();
    }

    public String getTextOfPageAfterDeleteAddress() {
        return addressPage.getText();
    }
}