package pages;

import org.openqa.selenium.WebDriver;

public class ToolTipsPage extends ParentPage {

    public ToolTipsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/tool-tips";
    }
}
