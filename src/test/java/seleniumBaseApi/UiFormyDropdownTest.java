package seleniumBaseApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class UiFormyDropdownTest {
    private WebDriver chromeDriver;
    private static final String BASE_URL = "https://formy-project.herokuapp.com";

    @BeforeClass
    public void createDriver() {
        chromeDriver = new ChromeDriver();

    }

    @AfterClass
    public void closeDriver() {
        chromeDriver.quit();
    }

    @AfterMethod
    public void waitABit() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void openDropdownPage() {
        chromeDriver.get(BASE_URL + "/dropdown");
    }

}
