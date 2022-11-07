package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverSingleton;

@Log4j2
public class WomenPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 20);

    @FindBy(xpath = "//div[@class='button-container']//a[@data-id-product='3']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='right-block']")
    private WebElement element;

    @FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "////a[@rel='nofollow']//span[@class='ajax_cart_quantity']")
    private WebElement cartButton;

    @FindBy(xpath = " //a[@title='Printed Dress']//ancestor::div[@class='right-block']//span[@itemprop='price']")
    private WebElement priceOfItem;


    @FindBy(xpath = "//span[contains(text(), 'Валюта :')]")
    private WebElement currencyListButton;

    @FindBy(xpath = "//a[contains(text(), 'Евро')]")
    private WebElement currencySelectionButton; //выбор валюты

    @FindBy(xpath = "//span[contains(text(), '€')]")
    private WebElement currencyPresenceOnThePage;//наличие валюты на странице

    @FindBy(xpath = "//span[contains(text(), '€')]")
    private WebElement currencyOnTheSite; //валюта сайта , строка сверху

    @FindBy(xpath = "//div[@id='languages-block-top']")
    private WebElement languageListButton;

    @FindBy(xpath = "//span[contains(text(), 'Українська')]")
    private WebElement languageSelectionButton; //выбор язвка

    @FindBy(xpath = " //div[@class='current']//span[contains(text(), 'Українська')]")
    private WebElement languageOnTheSite;

    @FindBy(xpath = "//b[contains(text(), 'Кошик:')]")
    private WebElement languagePresenceOnThePage;//наличие языка на странице


    public void clickCurrencyListButton() {
        log.info("Clicking the currency list");
        currencyListButton.click();// клик список валюты
    }

    public void clickCurrencySelectionButton() {
        log.info("Clicking on the currency select");
        currencySelectionButton.click(); //валюта
    }

    public String getTextСurrencyPresenceOnThePage() {
        log.info("Getting currency presence on the page");
        return currencyPresenceOnThePage.getText(); //
    }

    public String getTextCurrencyOnTheSite() {
        log.info("Getting currency received on the top line");
        return currencyOnTheSite.getText(); //валюта на сайте сврху строка
    }

    public void clickLanguageListButton() {
        log.info("Clicking the language list");
        languageListButton.click();
    }

    public void clickLanguageSelection() {
        log.info("Clicking on the language select");
        languageSelectionButton.click();
    }

    public String getTextLanguageOnTheSite() {
        log.info("Getting language received on the top line");
        return languageOnTheSite.getText();
    }

    public String getTextLanguagePresenceOnThePage() {
        log.info("Getting language presence on the page");
        return languagePresenceOnThePage.getText();
    }

    public void clickToAddToCartButton() {
        log.info("Clicking on the add to the cart button");
        addToCartButton.click();
    }


    public void clickToContinueShoppingButton() {
        log.info("Clicking on the continue to shopping button");
        wait.until(ExpectedConditions.visibilityOf(continueShoppingButton)).click();
        continueShoppingButton.click();
    }

    public void clickToCartButton() {
        log.info("Clicking on the cart button");
        cartButton.click();
    }

    public String getPriceOfItem() {
        log.info("Getting price of item");
        return priceOfItem.getText();
    }
}