package pages;

import org.openqa.selenium.WebDriver;
import pages.leftNavBar.LeftNavBar;

public class FormsPage extends ParentPage {
    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/forms";
    }

    public LeftNavBar getLeftNavBar() {
        return new LeftNavBar(webDriver);
    }

}
