package formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class DropDownPage {
    private final WebDriver driver;
    private static final String BASE_URL = "https://formy-project.herokuapp.com";
    @FindBy(css = "button.dropdown-toggle")
    private WebElement dropdownButton;
    @FindBy(css=".dropdown-menu.show>.dropdown-item[href]")
    private List<WebElement> dropdownItems;

    private static final List<String> hrefAttributesForDropdownItems = Arrays.asList(
            "/autocomplete", "/buttons", "/checkbox", "/datepicker", "/dragdrop", "/dropdown", "/enabled", "/fileupload",
            "/filedownload", "/keypress", "/modal", "/scroll", "/radiobutton", "/switch-window", "/switch-window",
            "/form");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openDropdownList(){
        dropdownButton.click();
    }

    public void openPage() {
        driver.get(BASE_URL + "/dropdown");
    }

    public String getUrlByHref(String href) {
        return BASE_URL + href;
    }

    public List<String> getHrefAttributesForDropdownItems() {
        return hrefAttributesForDropdownItems;
    }

    public void clickOnDropdownItem(String href) {
        for (WebElement dropdownItem:dropdownItems) {
            if (dropdownItem.getAttribute("href").equals(getUrlByHref(href))) {
                dropdownItem.click();
                return;
            }
        }
        throw new RuntimeException("Failure with click on dropdown item by href:"+href+". Such item is not found");
    }
}
