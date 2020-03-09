package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginWithFactoryPage {
    private final WebDriver driver;

    @FindBy(name = "uid")
    private WebElement user;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(css = ".barone")
    private WebElement title;
    @FindBy(name = "btnLogin")
    private WebElement loginButton;

    public Guru99LoginWithFactoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String userName, String passwordValue) {
        user.sendKeys(userName);
        password.sendKeys(passwordValue);
        loginButton.click();
    }
    public String getTitle(){
        return title.getText();
    }
}
