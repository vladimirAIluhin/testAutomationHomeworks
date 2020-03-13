package formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
    private final WebDriver driver;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Primary']")
    private WebElement primaryButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Success']")
    private WebElement successButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Info']")
    private WebElement infoButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Warning']")
    private WebElement warningButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Danger']")
    private WebElement dangerButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Link']")
    private WebElement linkButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Left']")
    private WebElement leftButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Middle']")
    private WebElement middleButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Right']")
    private WebElement rightButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='1']")
    private WebElement oneButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='2']")
    private WebElement twoButton;
    @FindBy(xpath = "//div[@aria-labelledby='btnGroupDrop1']/a[contains(@class,'dropdown-item') and text()='Dropdown link 1']")
    private WebElement dropdownLinkOneButton;
    @FindBy(xpath = "//div[@aria-labelledby='btnGroupDrop1']/a[contains(@class,'dropdown-item') and text()='Dropdown link 2']")
    private WebElement dropdownLinkTwoButton;


    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnPrimaryButton() {
        primaryButton.click();
    }

    public void clickOnSuccessButton() {
        successButton.click();
    }

    public void clickOnInfoButton() {
        infoButton.click();
    }

    public void clickOnWarningButton() {
        warningButton.click();
    }

    public void clickOnDangerButton() {
        dangerButton.click();
    }

    public void clickOnLinkButton() {
        linkButton.click();
    }

    public void clickOnLeftButton() {
        leftButton.click();
    }

    public void clickOnMiddleButton() {
        middleButton.click();
    }

    public void clickOnRightButton() {
        rightButton.click();
    }

    public void clickOnOneButton() {
        oneButton.click();
    }

    public void clickOnTwoButton() {
        twoButton.click();
    }

    public void clickOnDropdownLinkOneButton() {
        dropdownLinkOneButton.click();
    }

    public void clickOnDropdownLinkTwoButton() {
        dropdownLinkTwoButton.click();
    }
}
