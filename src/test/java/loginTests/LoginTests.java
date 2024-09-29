package loginTests;

import baseTest.BaseTest;
import org.junit.Test;
import testData.TestData;

import static testData.TestData.PASSWORD;
import static testData.TestData.USER_NAME;

public class LoginTests extends BaseTest {

    @Test
    public void validLogin() {
        pageProvider.getLoginPage().openLoginPage().enterUsername(USER_NAME).enterPasswordInput(PASSWORD)
                .clickLoginButton().checkIsLoginButtonNotVisible();
        pageProvider.getProfilePage().checkProfilePageIsOpened(USER_NAME);
    }
}
