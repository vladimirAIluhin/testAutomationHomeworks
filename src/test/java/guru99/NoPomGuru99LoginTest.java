package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NoPomGuru99LoginTest {
    WebDriver chromeDriver;

    @BeforeClass
    public void createDriver() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("http://demo.guru99.com/V4/");
    }

    @AfterTest
    public void closeDriver() {
        chromeDriver.quit();
    }

    @Test
    public void testHomePageAppearsCorrectly() {
        chromeDriver.findElement(By.name("uid")).sendKeys("mngr249627");
        chromeDriver.findElement(By.name("password")).sendKeys("zAmasYz");
        chromeDriver.findElement(By.name("btnLogin")).click();
        String homeText = chromeDriver.findElement(By.cssSelector(".barone")).getText();
        Assert.assertTrue(
                homeText.toLowerCase().contains("guru99 bank"),
                "Home text should contain : 'guru99 bank' while actual text is:" + homeText);
    }
}
