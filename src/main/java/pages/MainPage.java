package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.helpers.Util;
import pages.leftNavBar.LeftNavBar;
import utils.Utils;

public class MainPage extends ParentPage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "";
    }

    @FindBy(xpath = "//h5[text()='Book Store Application']")
    private WebElement bookStoreCard;

    public MainPage openMainPage() {
        webDriver.get(baseUrl);
        return this;
    }

    public BookStorePage clickOnBookStore() {
        scrollByAmount();
        clickOnElement(bookStoreCard);
        return new BookStorePage(webDriver);
    }


}
