package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99LoginPage {
    private final WebDriver driver;
    private final By user = By.name("uid");
    private final By password = By.name("password");
    private final By title = By.cssSelector(".barone");
    private final By loginButton = By.name("btnLogin");

    public Guru99LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String userName, String passwordValue) {
        driver.findElement(user).sendKeys(userName);
        driver.findElement(password).sendKeys(passwordValue);
        driver.findElement(loginButton).click();
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }
}
