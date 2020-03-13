package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class UiFormyButtonsTest {
    private WebDriver chromeDriver;

    @BeforeClass
    public void setupEnvironmentAndCreateNewChromeDriver() {
        chromeDriver = new ChromeDriver();
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
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Primary']")).click();
    }

    @Test (dependsOnMethods={"testPrimaryButton"})
    public void testSuccessButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Success']")).click();
    }

    @Test(dependsOnMethods={"testSuccessButton"})
    public void testInfoButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Info']")).click();
    }

    @Test(dependsOnMethods={"testInfoButton"})
    public void testWarningButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Warning']")).click();
    }

    @Test(dependsOnMethods={"testWarningButton"})
    public void testDangerButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Danger']")).click();
    }

    @Test(dependsOnMethods={"testDangerButton"})
    public void testLinkButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Link']")).click();
    }

    @Test(dependsOnMethods={"testLinkButton"})
    public void testLeftButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Left']")).click();
    }

    @Test(dependsOnMethods={"testLeftButton"})
    public void testMiddleButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Middle']")).click();
    }

    @Test(dependsOnMethods={"testMiddleButton"})
    public void testRightButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Right']")).click();
    }

    @Test(dependsOnMethods={"testRightButton"})
    public void test1Button() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='1']")).click();
    }

    @Test(dependsOnMethods={"test1Button"})
    public void test2Button() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='2']")).click();
    }


    @Test(dependsOnMethods={"test2Button"})
    public void testDropdownLink1Button() {
        chromeDriver.findElement(By.cssSelector("#btnGroupDrop1")).click();
        chromeDriver.findElement(By.xpath("//div[@aria-labelledby='btnGroupDrop1']/a[contains(@class,'dropdown-item') and text()='Dropdown link 1']")).click();
    }

    @Test(dependsOnMethods={"testDropdownLink1Button"})
    public void testDropdownLink2Button() {
        chromeDriver.findElement(By.cssSelector("#btnGroupDrop1")).click();
        chromeDriver.findElement(By.xpath("//div[@aria-labelledby='btnGroupDrop1']/a[contains(@class,'dropdown-item') and text()='Dropdown link 2']")).click();
    }
}
