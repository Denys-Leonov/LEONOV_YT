package loginTests;

import baseTest.BaseTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.ConfigProvider;
import utils.ExcelSpreadsheetData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;

import static testData.TestData.PASSWORD;
import static testData.TestData.USER_NAME;

@RunWith(JUnitParamsRunner.class)
public class LoginTests extends BaseTest {

    @Test
    public void validLogin() {
        pageProvider.getLoginPage().openLoginPage().enterUsername(USER_NAME).enterPasswordInput(PASSWORD)
                .clickLoginButton().checkIsLoginButtonNotVisible();
        pageProvider.getProfilePage().checkProfilePageIsOpened(USER_NAME);
    }

    @Test
    @Parameters(method ="parametersForValidationMessagesTest")
    public void invalidLoginValidationMessages(String username, String password, String expectedErrors) {
        pageProvider.getLoginPage().openLoginPage().enterUsername(username).enterPasswordInput(password)
                .clickLoginButton().checkForErrors(expectedErrors);
    }


    public Collection parametersForValidationMessagesTest() throws IOException {
        String pathToDataFile = ConfigProvider.configProperties.DATA_FILE_PATH() + "testDataSuit.xls";
        String sheetName = "registrationErrors";
        boolean skipFirstRow = false;
        logger.info("Reading data from file: " + pathToDataFile + " sheet: " + sheetName);
        logger.info("Skip first row: " + skipFirstRow);
        return new ExcelSpreadsheetData(new FileInputStream(pathToDataFile), sheetName, skipFirstRow).getData();
    }
}
