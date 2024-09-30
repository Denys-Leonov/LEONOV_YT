package toolTipsTests;

import baseTest.BaseTest;
import org.junit.Test;

public class ToolTipsTests extends BaseTest {

    @Test
    public void toolTipsTest() {
        pageProvider.getMainPage().openMainPage().clickOnWidgetsPage().getLeftNavBar().clickOnToolTips()
                .hoverOnButtonWithToolTip().checkToolTipForButton().hoverOnInputFieldWithToolTip().checkToolTipForInputField()
                .hoverOnLinkWithToolTip().checkToolTipForLink();
    }
}
