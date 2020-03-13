package linkedin.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static linkedin.LinkedinTest.chromeDriver;

public class LinkedinStepdefs {

    @Given("linkedin login page is opened")
    public void linkedinIsOpened() {
        chromeDriver.navigate().to("https://www.linkedin.com/");
    }

    @When("user {string} with password {string} log in")
    public void userWithPasswordLogIn(String user, String password) {
        waitFor().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='session_key']")));
        chromeDriver.findElement(By.cssSelector("[name='session_key']")).sendKeys(user);
        chromeDriver.findElement(By.cssSelector("[name='session_password']")).sendKeys(password);
        chromeDriver.findElement(By.cssSelector(".sign-in-form__submit-btn")).click();
    }

    @Then("user logged in a linkedin")
    public void userLoggedInALinkedin() {
        waitFor().until(ExpectedConditions.urlToBe("https://www.linkedin.com/feed/?trk=guest_homepage-basic_sign-in-submit"));
    }

    private WebDriverWait waitFor() {
        return new WebDriverWait(chromeDriver,3);
    }
}
