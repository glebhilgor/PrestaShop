package services;

import pages.CheckoutOrderPage;

public class CheckoutOrderPageService {
    WomenPageService womenPageService = new WomenPageService();
    AddressService addressService = new AddressService();
    CartPageService cartPageService = new CartPageService();
    CheckoutOrderPage checkoutOrderPage = new CheckoutOrderPage();

    public void order() {
        addressService.createYourAddress();
        womenPageService.addItemToCart();
        cartPageService.clickOnProceedToCheckoutButton();
        checkoutOrderPage.clickOnProceedToCheckoutButton();
        checkoutOrderPage.ChoosingTheTypeOfDelivery();
        checkoutOrderPage.clickOnProceedToCheckoutButtonAfterAgreementOfTermsOfServices();
        checkoutOrderPage.clickOnBankTransferButton();
        checkoutOrderPage.clickOnOrderConfirmationButton();

    }

    public String getTextOfOderConfirmationMessage() {
        return checkoutOrderPage.getTextOfOrderConfirmationMessage();
    }

    public void deleteAddress() {
        addressService.deleteAddress();
    }
}