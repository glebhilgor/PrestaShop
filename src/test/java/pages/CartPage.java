package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CartPage extends BasePage {
    @FindBy(xpath = "//td[@class='cart_description']//*[contains(text(), 'Printed Dress')]")
    private WebElement ItemInTheCart; //  товар в корзине

    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    private WebElement countOfItemInTheCart;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement logoutButton;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='price']//span")
    private WebElement unitPrice;

    @FindBy(xpath = "//td[@id='total_product']")
    private WebElement totalPriceWithTax;

    @FindBy(xpath = "//td[@id='total_price_container']/span")
    private WebElement totalOrderValue;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    //@FindBy(xpath = "//a[@class='cart_quantity_delete']");
    //private WebElement clickOnDeleteButton;

    public String descriptionItemInTheCart() {
        log.info("GetTing the Product description In the Shopping Cart");
        return ItemInTheCart.getText(); // получить название товара в корзине
    }

    public String getCountOfItemsInTheCart() {
        log.info("Getting count of items in the cart");
        return countOfItemInTheCart.getText();
    }

    public void clickOnLogoutButton() {
        log.info("Clicking on the logout button");
        logoutButton.click();
    }

    public String getTextOfLoginButton() {
        log.info("Getting text of button");
        return loginButton.getText();
    }

    public String getPriceOfItem() {
        log.info("Getting price of item");
        return unitPrice.getText();
    }

    public String getTotalPriceWithTax() {
        log.info("Getting total price of item with tax");
        return totalPriceWithTax.getText();
    }

    public String getTotalOrderValue() {
        log.info("Getting total order value");
        return totalOrderValue.getText();
    }

    public void clickOnProceedToCheckoutButton() {
        log.info("Clicking on the proceed to checkout button");
        proceedToCheckoutButton.click();
    }
    public void clickOnDeleteButton() {
        log.info("Clicking on delete button");
        clickOnDeleteButton();
    }
}
