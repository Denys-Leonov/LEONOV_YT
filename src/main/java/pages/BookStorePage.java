package pages;

import org.openqa.selenium.WebDriver;
import pages.leftNavBar.LeftNavBar;

public class BookStorePage extends ParentPage {

    public BookStorePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/books";
    }

    public LeftNavBar getLeftNavBar() {
        return new LeftNavBar(webDriver);
    }

    public BookStorePage openBookStorePage() {
        webDriver.get(baseUrl + getRelativeUrl());
        return this;
    }


}
