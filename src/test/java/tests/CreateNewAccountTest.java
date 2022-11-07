package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.CreateNewAccountService;

import static utils.Data.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class CreateNewAccountTest extends BaseTest {
    CreateNewAccountService createNewAccountService;

    @BeforeClass
    public void setUp() {
        createNewAccountService = new CreateNewAccountService();
    }


    @Test
    public void createNewAccountTest() {
        createNewAccountService.createNewAccount();
        String actualTextOfAccount = createNewAccountService.getTextPageName();
        Assert.assertEquals(actualTextOfAccount, EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE, "The actual text of the page does not match expected!");

    }
}