package pages;

import org.openqa.selenium.WebDriver;
import pages.leftNavBar.LeftNavBar;

public class MainPage extends ParentPage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "";
    }

    public MainPage openMainPage() {
        webDriver.get(baseUrl);
        return this;
    }


}
