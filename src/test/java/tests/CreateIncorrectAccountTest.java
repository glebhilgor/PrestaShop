package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.CreateNewAccountService;

public class CreateIncorrectAccountTest {

    CreateNewAccountService createNewAccountService;

    @BeforeClass
    public void setUp() {
        createNewAccountService= new CreateNewAccountService();}

    @Test
    public void createNewAccountFailedTest(){
        createNewAccountService.createNewAccountFailed();
        String actualTextOfAccountFailed=createNewAccountService.getTextInvalidEmailMessage();
        String expectedTextOfAccountFailedText= "Invalid email address.";
        Assert.assertEquals(actualTextOfAccountFailed,expectedTextOfAccountFailedText,"Email incorrect");

    }

}