package formy;

import formy.pages.ButtonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UiFormyButtonsTest {
    private WebDriver chromeDriver;
    private ButtonsPage buttonsPage;

    @BeforeClass
    public void setupEnvironmentAndCreateNewChromeDriver() {
        chromeDriver = new ChromeDriver();
        buttonsPage = new ButtonsPage(chromeDriver);
    }

    @BeforeMethod
    public void openButtonsPage() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
    }

    @AfterClass
    public void closeDriver() {
        chromeDriver.quit();
    }
//
//   @AfterMethod
//    public void waitABit() {
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testPrimaryButton() {
        buttonsPage.clickOnPrimaryButton();
    }

    @Test(dependsOnMethods = {"testPrimaryButton"})
    public void testSuccessButton() {
        buttonsPage.clickOnSuccessButton();
    }

    @Test(dependsOnMethods = {"testSuccessButton"})
    public void testInfoButton() {
        buttonsPage.clickOnInfoButton();
    }

    @Test(dependsOnMethods = {"testInfoButton"})
    public void testWarningButton() {
        buttonsPage.clickOnWarningButton();
    }

    @Test(dependsOnMethods = {"testWarningButton"})
    public void testDangerButton() {
        buttonsPage.clickOnDangerButton();
    }

    @Test(dependsOnMethods = {"testDangerButton"})
    public void testLinkButton() {
        buttonsPage.clickOnLinkButton();
    }

    @Test(dependsOnMethods = {"testLinkButton"})
    public void testLeftButton() {
        buttonsPage.clickOnLeftButton();
    }

    @Test(dependsOnMethods = {"testLeftButton"})
    public void testMiddleButton() {
        buttonsPage.clickOnMiddleButton();
    }

    @Test(dependsOnMethods = {"testMiddleButton"})
    public void testRightButton() {
        buttonsPage.clickOnRightButton();
    }

    @Test(dependsOnMethods = {"testRightButton"})
    public void test1Button() {
        buttonsPage.clickOnOneButton();
    }

    @Test(dependsOnMethods = {"test1Button"})
    public void test2Button() {
        buttonsPage.clickOnTwoButton();
    }


    @Test(dependsOnMethods = {"test2Button"})
    public void testDropdownLink1Button() {
        chromeDriver.findElement(By.cssSelector("#btnGroupDrop1")).click();
        buttonsPage.clickOnDropdownLinkOneButton();
    }

    @Test(dependsOnMethods = {"testDropdownLink1Button"})
    public void testDropdownLink2Button() {
        chromeDriver.findElement(By.cssSelector("#btnGroupDrop1")).click();
        buttonsPage.clickOnDropdownLinkTwoButton();
    }
}
