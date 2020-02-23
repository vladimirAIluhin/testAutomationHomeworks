package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestCases {

    @Test
    public void verifyString() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
    }

}
