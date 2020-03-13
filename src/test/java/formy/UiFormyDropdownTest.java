package formy;

import formy.pages.DropDownPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class UiFormyDropdownTest {
    private WebDriver chromeDriver;
    private DropDownPage dropDownPage;

    @BeforeClass
    public void setupEnvironmentAndCreateNewChromeDriver() {
        chromeDriver = new ChromeDriver();
        dropDownPage = new DropDownPage(chromeDriver);
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
        dropDownPage.openPage();
        for (String href : dropDownPage.getHrefAttributesForDropdownItems()) {
            dropDownPage.openDropdownList();
            dropDownPage.clickOnDropdownItem(href);
            Assert.assertEquals(chromeDriver.getCurrentUrl(), dropDownPage.getUrlByHref(href), "URL should match.");
            dropDownPage.openPage();
        }
    }
}
