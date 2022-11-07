package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CartPage;
import services.CartPageService;
import services.WomenPageService;

public class WomenPageTest extends BaseTest {


    WomenPageService womenPageService;
    CartPageService cartPageService;
    CartPage cartPage;


    @BeforeClass
    public void setUp() {
        womenPageService= new WomenPageService();
        cartPageService= new CartPageService();
        cartPage= new CartPage();

    }

    @Test
    // ������ � �������� //a[contains(text(), '����')]
    public void  changeTheCurrencyOnTheWebsiteTest(){
        womenPageService.changeTheCurrencyOnTheWebsite();
        String actualCurrencyName = womenPageService.getTextCurrencyOnTheSite();
        String expectedCurrencyName= "EUR";
        Assert.assertEquals(actualCurrencyName,expectedCurrencyName,"The currency on the page is incorrect");

    }

    @Test  //������ �� �������� �������  ���� //div[@class='current']//span[contains(text(), '���������')]}]
    public void changeTheLanguageOnTheWebsiteTest(){
        womenPageService.changeTheLanguageOnTheWebsite();
        String actualLanguageName= womenPageService.getTextLanguageOnTheSite();
        String expectedLanguageName= "���������";
        Assert.assertEquals(actualLanguageName,expectedLanguageName,"The language on the page is incorrect");
    }
    @Test //�������� �������� �����
    public void addItemToCartTest() {
        womenPageService.addItemToCart();
        String actualNameOfItemTheCart= womenPageService.getTitleItemInTheCart();
        cartPage.clickOnLogoutButton();//���������� ��� �������� ������
        String expectedNameOfItemTheCartText ="Printed Dress";
        Assert.assertEquals(actualNameOfItemTheCart,expectedNameOfItemTheCartText,"actual name");
    }


}