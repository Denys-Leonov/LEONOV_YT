package pages;

import org.openqa.selenium.WebDriver;
import pages.leftNavBar.LeftNavBar;

public class WidgetsPage extends ParentPage {

    public WidgetsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/widgets";
    }

    public LeftNavBar getLeftNavBar() {
        return new LeftNavBar(webDriver);
    }

    public WidgetsPage openWidgetsPage() {
        webDriver.get(baseUrl + getRelativeUrl());
        return this;
    }
}
