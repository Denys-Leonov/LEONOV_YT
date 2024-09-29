package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage{

    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/profile";
    }

     String usernameLocator = "//label[contains(text(), '%s')]";

    @FindBy(xpath = "//button[text()='Log out']")
    private WebElement buttonLogOut;

    public void checkProfilePageIsOpened(String username) {
        Assert.assertTrue("Incorrect username displayed"
                , isElementVisible(String.format(usernameLocator, username)));
    }
}
