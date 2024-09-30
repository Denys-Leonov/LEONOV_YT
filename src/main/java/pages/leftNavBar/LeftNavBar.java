package pages.leftNavBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;
import pages.PracticeFormPage;
import pages.ToolTipsPage;

public class LeftNavBar extends CommonActionsWithElements {

    public LeftNavBar(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div//span[text()='Tool Tips']")
    private WebElement toolTips;

    @FindBy(xpath = "//div//span[text()='Select Menu']")
    private WebElement selectMenu;

    @FindBy(xpath = "//div//span[text()='Practice Form']")
    private WebElement pagePracticeForm;





    public ToolTipsPage clickOnToolTips() {
        scrollToElement(selectMenu);
        clickOnElement(toolTips);
        return new ToolTipsPage(webDriver);
    }


    public PracticeFormPage clickOnPracticeForm() {
        scrollToElement(pagePracticeForm);
        clickOnElement(pagePracticeForm);
        return new PracticeFormPage(webDriver);
    }
}
