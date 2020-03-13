package formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {
    private final WebDriver webDriver;
    @FindBy(xpath = "//*[@id='checkbox-1']")
    private WebElement checkbox1;
    @FindBy(xpath = "//*[@id='checkbox-2']")
    private WebElement checkbox2;
    @FindBy(xpath = "//*[@id='checkbox-3']")
    private WebElement checkbox3;

    public CheckboxesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void toggleCheckbox1() {
        checkbox1.click();
    }

    public void toggleCheckbox2() {
        checkbox2.click();
    }

    public void toggleCheckbox3() {
        checkbox3.click();
    }
}

