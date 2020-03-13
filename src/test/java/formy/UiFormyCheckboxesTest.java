package formy;

import formy.pages.CheckboxesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class UiFormyCheckboxesTest {
    private WebDriver chromeDriver;
    private CheckboxesPage checkboxesPage;

    @BeforeClass
    public void setupEnvironmentAndCreateNewChromeDriver() {
        chromeDriver = new ChromeDriver();
        checkboxesPage = new CheckboxesPage(chromeDriver);
    }

    @AfterClass
    public void closeDriver() {
        chromeDriver.quit();
    }

    @BeforeMethod
    public void openUrl() {
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @Test
    public void testCheckboxes() {
        checkboxesPage.toggleCheckbox1();
        checkboxesPage.toggleCheckbox2();
        checkboxesPage.toggleCheckbox3();
    }
}


