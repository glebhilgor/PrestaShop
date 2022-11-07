package services;

import pages.CartPage;

public class CartPageService {
    CartPage cartPage = new CartPage();

    public void deleteItemFromCart() {

        cartPage.clickOnDeleteButton();
    }

    public void clickOnProceedToCheckoutButton() {

    }
}
