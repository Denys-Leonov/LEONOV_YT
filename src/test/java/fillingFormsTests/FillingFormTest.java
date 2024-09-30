package fillingFormsTests;

import baseTest.BaseTest;
import org.junit.Test;
import testData.TestData;

import static testData.TestData.*;

public class FillingFormTest extends BaseTest {

    @Test
    public void fillingFormTest() {
        pageProvider.getMainPage().openMainPage().clickOnFormsPage().getLeftNavBar().clickOnPracticeForm()
                .fillFormFirstName(FIRST_NAME).fillFormLastName(LAST_NAME).fillFormEmail(EMAIL)
                .selectGenderInForm("Male").fillFormMobile(MOBILE).fillFormSubject(SUBJECT)
                .selectHobbiesInForm("Sports").selectHobbiesInForm("Reading")
                .selectHobbiesInForm("Music").fillFormCurrentAddress(CURRENT_ADDRESS)
                .selectStateInForm(STATE).selectCityInForm(CITY).clickOnSubmitButton()
                .checkIsFormSubmitted(FIRST_NAME,LAST_NAME,"Male", EMAIL, MOBILE, SUBJECT, CURRENT_ADDRESS, STATE, CITY);

    }
}
