package guru99;

import guru99.pages.Guru99LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NoPomGuru99LoginWithPageTest {
    WebDriver chromeDriver;
    Guru99LoginPage loginPage;

    @BeforeClass
    public void createDriver() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("http://demo.guru99.com/V4/");
        loginPage = new Guru99LoginPage(chromeDriver);
    }

    @AfterTest
    public void closeDriver() {
        chromeDriver.quit();
    }

    @Test
    public void testHomePageAppearsCorrectly() {
        loginPage.login("mngr249627", "zAmasYz");
        String homeText = loginPage.getTitle();
        Assert.assertTrue(
                homeText.toLowerCase().contains("guru99 bank"),
                "Home text should contain : 'guru99 bank' while actual text is:" + homeText);
    }
}
