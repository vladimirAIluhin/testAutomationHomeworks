package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckAssertions {
    WebDriver chromeDriver;

    @BeforeTest
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @AfterTest
    public void closeDriver() {
        chromeDriver.quit();
    }

    @Test
    public void testAssertEqualsForStrings() {
        chromeDriver.navigate().to("http://google.com");
        Assert.assertEquals(chromeDriver.getTitle(), "Google");
    }

    @Test
    public void testAssertEqualsForStringsWithMessage() {
        chromeDriver.navigate().to("http://google.com");
        Assert.assertEquals(chromeDriver.getTitle(), "Google","title should match");
    }

    @Test
    public void testAssertEqualsForBoolean() {
        chromeDriver.navigate().to("http://google.com");
        Assert.assertEquals("Google".equals(chromeDriver.getTitle()), true,"title should match");
    }

    @Test
    public void testAssertEqualsForCollectionsWithMessage() {
        chromeDriver.navigate().to("http://google.com");
        List<String> actualValues = Arrays.asList(chromeDriver.getTitle(), chromeDriver.getCurrentUrl());
        List<String> expectedValues = Arrays.asList("Google", "https://www.google.com/");
        Assert.assertEquals(actualValues, expectedValues,"title and URL should match");
    }

    @Test
    public void testAssertTrue() {
        chromeDriver.navigate().to("http://google.com");
        Assert.assertTrue("Google".equals(chromeDriver.getTitle()));
    }
    @Test
    public void testAssertTrueWithMessage() {
        chromeDriver.navigate().to("http://google.com");
        Assert.assertTrue("Google".equals(chromeDriver.getTitle()),"title should match");
    }

    @Test
    public void testAssertFalse() {
        chromeDriver.navigate().to("http://google.com");
        Assert.assertFalse("mail.ru".equals(chromeDriver.getTitle()));
    }

    @Test
    public void testAssertFalseWithMessage() {
        chromeDriver.navigate().to("http://google.com");
        Assert.assertFalse("mail.ru".equals(chromeDriver.getTitle()),"Title shouldn't be mail.ru");
    }
}
