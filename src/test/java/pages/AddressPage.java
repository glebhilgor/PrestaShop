package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Log4j2
public class AddressPage extends BasePage {
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement zipcode;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneHome;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement phoneMobile;

    @FindBy(xpath = "//div[@id='uniform-id_state']")
    private WebElement stateButton;

    @FindBy(xpath = "//select[@id='id_state']//option[@value='337']")
    private WebElement stateNameButton; //здесь падает , нужен ввод буквы А

    @FindBy(xpath = "//button[@id='submitAddress']")
    private WebElement saveAddressButton;

    @FindBy(xpath = "//p[contains(text(), 'There are 3 errors ')]")
    private WebElement  errorsAddress;

    @FindBy(xpath = "//strong[contains(text(), 'Your addresses are listed below.')]")
    private WebElement messageAddress;

    @FindBy(xpath = "//h3[contains(text(), 'My address')]")
    private WebElement blockNameMyAddress;

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement deleteAddressButton;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElement availableAddressesButton;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement logoutButton;


    public AddressPage openPage(String url) {
        log.info ("Open address page by URL");
        driver.get(url);
        return this;
    }

    public AddressPage fillInFirstName(String firstNameString) {
        log.info("Entering a name");
        firstName.clear();
        firstName.sendKeys(firstNameString);
        return this;
    }

    public AddressPage fillInLastName(String lastNameString) {
        log.info("Entering Last Name");
        lastName.clear();
        lastName.sendKeys(lastNameString);
        return this;
    }

    public AddressPage fillAddress(String addressString) {
        log.info("Entering an address");
        address.clear();
        address.sendKeys(addressString);
        return this;
    }


    public AddressPage fillInZipCode(String zipCodeString) {
        log.info("Entering a zip code");
        zipcode.clear();
        zipcode.sendKeys(zipCodeString);
        return this;
    }

    public AddressPage fillInCity(String cityString) {
        log.info("Entering a city");
        city.clear();
        city.sendKeys(cityString);
        return this;
    }

    public AddressPage fillInPhoneHome(String phoneHomeString) {
        log.info("Entering a phone home");
        phoneHome.clear();
        phoneHome.sendKeys(phoneHomeString);
        return this;
    }

    public AddressPage fillInPhoneMobile(String phoneMobileString) {
        log.info("Entering a phone mobile");
        phoneMobile.clear();
        phoneMobile.sendKeys(phoneMobileString);
        return this;
    }

    public void clickDropDownListButton() {
        log.info("Clicking a dropdown");
        stateButton.click();
    }

    public void clickNameStateButton(String state) {
        log.info("Clicking a state");
        stateNameButton.click();
    }

    public void clickSaveAddressButton() {
        log.info("Clicking ont he save Button");
        saveAddressButton.click();
    }

    public String getTheTextAddressError() {
        log.info("Getting a text of name of address errors");
        return errorsAddress.getText();
    }


    public String getTheTextAboutCreatingNewAddress() {
        log.info("Getting a text of name of address");
        return messageAddress.getText(); //

    }
    public String getTheTextBlockNameMyAddress() {
        log.info("Getting a text of name block of address");
        return blockNameMyAddress.getText();

    }
    public void clickDeleteAddressButton() {
        log.info("Clicking on the delete address button");
        deleteAddressButton.click();
    }
    public String getText() {
        log.info("Getting text from the button (for assert)");
        return availableAddressesButton.getText();
    }


    public void clickOnLogoutButton() {
        log.info("Clicking on the logout button");
        logoutButton.click();
    }
}