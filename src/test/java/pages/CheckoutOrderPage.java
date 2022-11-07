package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class CheckoutOrderPage extends BasePage {
    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement proceedCheckoutButton;

    @FindBy(xpath = "//input[@value='1']")
    private WebElement consentCheckbox;

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//p[@class='payment_module']")
    private WebElement choosingPaymentMethodButton;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement orderConfirmationButton;

    @FindBy(xpath = "//p[@class='cheque-indent']")
    private WebElement orderConfirmationMessage;

    public void clickOnProceedToCheckoutButton() {
        log.info("Clicking on the proceed to checkout button");
        proceedToCheckoutButton.click();
    }

    public void ChoosingTheTypeOfDelivery() {
        log.info("Choosing the type of delivery");
        consentCheckbox.click();
    }

    public void clickOnProceedToCheckoutButtonAfterAgreementOfTermsOfServices() {
        log.info("Clicking on the proceed to checkout button after agreement of terms of delivery");
        proceedToCheckoutButton.click();
    }

    public void clickOnBankTransferButton() {
        log.info("Choosing a bank transfer payment");
        choosingPaymentMethodButton.click();
    }

    public void clickOnOrderConfirmationButton() {
        log.info("Clicking on the order confirmation button");
        orderConfirmationButton.click();
    }

    public String getTextOfOrderConfirmationMessage() {
        log.info("Getting a text of order confirmation message");
        return orderConfirmationMessage.getText();
    }


}