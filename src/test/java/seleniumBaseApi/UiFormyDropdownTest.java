package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class UiFormyDropdownTest {
    private WebDriver chromeDriver;
    private static final String BASE_URL = "https://formy-project.herokuapp.com";
    private static final List<String> hrefAttributesForDropdownItems = Arrays.asList(
            "/autocomplete", "/buttons", "/checkbox", "/datepicker", "/dragdrop", "/dropdown", "/enabled", "/fileupload",
            "/filedownload", "/keypress", "/modal", "/scroll", "/radiobutton", "/switch-window", "/switch-window",
            "/form");


    @BeforeClass
    public void createDriver() {
        chromeDriver = new ChromeDriver();

    }

    @AfterClass
    public void closeDriver() {
        chromeDriver.quit();
    }

//    @AfterMethod
//    public void waitABit() {
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testUrlFromDropdown() {
        chromeDriver.get(BASE_URL + "/dropdown");
        for (String href : hrefAttributesForDropdownItems) {
            chromeDriver.findElement(By.cssSelector("button.dropdown-toggle")).click();
            chromeDriver.findElement(By.cssSelector(".dropdown-menu.show>.dropdown-item[href='" + href + "']")).click();
            Assert.assertEquals(chromeDriver.getCurrentUrl(), BASE_URL + href, "URL should match.");
            chromeDriver.get(BASE_URL + "/dropdown");
        }
    }
}
