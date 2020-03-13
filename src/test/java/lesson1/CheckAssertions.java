package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class CheckAssertions {
    private WebDriver chromeDriver;

    @BeforeClass
    public void setupEnvironmentAndCreateNewChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @BeforeMethod
    public void openUrl() {
        chromeDriver.navigate().to("http://google.com");
    }

    @AfterClass
    public void closeDriver() {
        chromeDriver.quit();
    }

    @Test
    public void testAssertEqualsForStrings() {
        Assert.assertEquals(chromeDriver.getTitle(), "Google");
    }

    @Test
    public void testAssertEqualsForStringsWithMessage() {
        Assert.assertEquals(chromeDriver.getTitle(), "Google", "title should match");
    }

    @Test
    public void testAssertEqualsForBoolean() {
        Assert.assertEquals("Google".equals(chromeDriver.getTitle()), true, "title should match");
    }

    @Test
    public void testAssertEqualsForCollectionsWithMessage() {
        List<String> actualValues = Arrays.asList(chromeDriver.getTitle(), chromeDriver.getCurrentUrl());
        List<String> expectedValues = Arrays.asList("Google", "https://www.google.com/");
        Assert.assertEquals(actualValues, expectedValues, "title and URL should match");
    }

    @Test
    public void testAssertTrue() {
        Assert.assertTrue("Google".equals(chromeDriver.getTitle()));
    }

    @Test
    public void testAssertTrueWithMessage() {
        Assert.assertTrue("Google".equals(chromeDriver.getTitle()), "title should match");
    }

    @Test
    public void testAssertFalse() {
        Assert.assertFalse("mail.ru".equals(chromeDriver.getTitle()));
    }

    @Test
    public void testAssertFalseWithMessage() {
        Assert.assertFalse("mail.ru".equals(chromeDriver.getTitle()), "Title shouldn't be mail.ru");
    }
}
