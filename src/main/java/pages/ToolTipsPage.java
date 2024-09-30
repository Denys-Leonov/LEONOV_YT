package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToolTipsPage extends ParentPage {

    public ToolTipsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/tool-tips";
    }

    @FindBy(id = "toolTipButton")
    private WebElement buttonWithToolTip;

    @FindBy(id = "toolTipTextField")
    private WebElement inputFieldWithToolTip;

    @FindBy(xpath = "//a[text()='Contrary']")
    private WebElement linkWithToolTip;

    @FindBy(xpath = "//div[@id='buttonToolTip']")
    private WebElement toolTipForButton;

    @FindBy(xpath = "//div[@id='textFieldToolTip']")
    private WebElement toolTipForInputField;

    @FindBy(xpath = "//div[@id='contraryTexToolTip']")
    private WebElement toolTipForLink;


    public ToolTipsPage hoverOnButtonWithToolTip() {
        scrollToElement(buttonWithToolTip);
        scrollByAmount(100);
        hoverOverElement(buttonWithToolTip);
        return this;
    }

    public ToolTipsPage checkToolTipForButton() {
        checkIsElementVisible(toolTipForButton);
        return this;
    }

    public ToolTipsPage hoverOnInputFieldWithToolTip() {
        scrollToElement(inputFieldWithToolTip);
        scrollByAmount(100);
        hoverOverElement(inputFieldWithToolTip);
        return this;
    }

    public ToolTipsPage checkToolTipForInputField() {
        checkIsElementVisible(toolTipForInputField);
        return this;
    }

    public ToolTipsPage hoverOnLinkWithToolTip() {
        scrollToElement(linkWithToolTip);
        scrollByAmount(100);
        hoverOverElement(linkWithToolTip);
        return this;
    }

    public ToolTipsPage checkToolTipForLink() {
        checkIsElementVisible(toolTipForLink);
        return this;
    }
}
