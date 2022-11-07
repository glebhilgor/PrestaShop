package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverSingleton;

public class CreateNewAccountPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 15);

    @FindBy(xpath = "//input[@id='id_gender2']") //��-� ��� �-��
    private WebElement title;

    @FindBy(xpath = "//input[@id='customer_firstname']")// ���
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordCreate;


    @FindBy(xpath = "//span[contains(text(), 'Register')]")
    private WebElement registerButton;

    public void clickTitle() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(title));
        title.click();
    }

    public CreateNewAccountPage fillInFirstName(String firstNameString) {
        firstName.clear();
        firstName.sendKeys(firstNameString);
        return this;
    }

    public CreateNewAccountPage fillInLastName(String lastNameString) {
        lastName.clear();
        lastName.sendKeys(lastNameString);
        return this;
    }

    public CreateNewAccountPage fillInPassword(String passwordString) {
        passwordCreate.clear();
        passwordCreate.sendKeys(passwordString);
        return this;
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

}