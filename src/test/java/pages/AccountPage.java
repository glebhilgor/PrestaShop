package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Log4j2
public class AccountPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(), 'My account')]")
    private WebElement pageName;

    @FindBy(xpath = "//p[contains(text(), 'Your account has been created.')]")
    private WebElement messageAccountCreate;

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement pageTitleWomenButton;

    @FindBy(xpath = "//span[contains(text(), 'Add my first address')]")
    private WebElement nameAddMyFirstAddressButton;


    public String getTextPageName()
    {
        log.info("Getting the page name");
        return pageName.getText();
    }

    public String getTextMessageAccountCreate() {
        log.info("Getting message Account Create");
        return messageAccountCreate.getText();
    }

    public void clickPageTitleWomen() {
        log.info("Clicking button title Women");
        pageTitleWomenButton.click();
    }

    public void clickNameAddMyFirstAddressButton() {
        log.info("Clicking the Add My First Address button");
        nameAddMyFirstAddressButton.click();
    }
}