package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.CheckoutOrderPageService;

import static utils.Data.EXPECTED_MESSAGE_OF_CHECKOUT_PAGE;
//падает так какне создается адрес
public class CheckoutOrderTest extends BaseTest {

    CheckoutOrderPageService checkoutOrderPageService;

    @BeforeClass
    public void setUp(){

        checkoutOrderPageService=new CheckoutOrderPageService();
    }
    @Test
    public void checkoutOrderTest(){
        checkoutOrderPageService.order();
        String actualMessageOfCheckoutPage = checkoutOrderPageService.getTextOfOderConfirmationMessage();
        String expectedMessageOfCheckoutPage = EXPECTED_MESSAGE_OF_CHECKOUT_PAGE;

        Assert.assertTrue(actualMessageOfCheckoutPage.contains(expectedMessageOfCheckoutPage), "The actual " +
                "text of checkout page does not match expected!");
    }
}