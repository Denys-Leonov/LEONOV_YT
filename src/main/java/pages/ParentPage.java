package pages;

import org.openqa.selenium.WebDriver;
import utils.ConfigProvider;

public abstract class ParentPage extends CommonActionsWithElements {

    String baseUrl = ConfigProvider.configProperties.base_url();

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    abstract public String getRelativeUrl();





}
