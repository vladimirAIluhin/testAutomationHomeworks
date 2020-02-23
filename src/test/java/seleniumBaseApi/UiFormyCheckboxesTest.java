package seleniumBaseApi;

import lesson1.Email;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class UiFormyCheckboxesTest {
    WebDriver chromeDriver;

    @BeforeClass
    public void createDriver() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @AfterClass
    public void closeDriver() {
        chromeDriver.quit();
    }

//   @AfterMethod
//    public void waitABit() {
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @DataProvider(name = "css")
    public static Object[][] cssSelectors() {
        return new Object[][]{
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/buttons']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {".dropdown-menu.show>a[href='/autocomplete']"},
                {"#checkbox-2"},
                {"#checkbox-3"}};
    }

    @Test(dataProvider = "css")
    public void testCheckboxesViaCss(String css) {
        chromeDriver.findElement(By.cssSelector(css)).click();
    }

    @DataProvider(name = "xpath")
    public static Object[][] xpathSelectors() {
        return new Object[][]{
                {"//*[@id='checkbox-1']"},
                {"//*[@id='checkbox-2']"},
                {"//*[@id='checkbox-3']"}};
    }

    @Test(dataProvider = "xpath")
    public void testCheckboxesViaXpath(String xpath) {
        chromeDriver.findElement(By.xpath(xpath)).click();
    }

}
