package linkedin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class LinkedinTest {
    public static WebDriver chromeDriver;

    @BeforeClass
    public static void setupEnvironmentAndCreateNewChromeDriver() {
        chromeDriver = new ChromeDriver();
    }

    @AfterClass
    public static void closeDriver() {
        chromeDriver.quit();
    }
}
