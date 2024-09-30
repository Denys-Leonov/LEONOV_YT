package pages;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends ParentPage {
    public PracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/automation-practice-form";
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    private WebElement inputEmail;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement genderMale;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement genderFemale;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement genderOther;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    private WebElement inputMobileNumber;

    @FindBy(id = "subjectsInput")
    private WebElement inputSubject;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement hobbySports;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement hobbyReading;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement hobbyMusic;

    @FindBy(id = "currentAddress")
    private WebElement inputCurrentAddress;

    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement selectStateDropdown;

    @FindBy(id = "react-select-3-option-0")
    private WebElement stateNCR;

    @FindBy(id = "react-select-3-option-1")
    private WebElement stateUttarPradesh;

    @FindBy(id = "react-select-3-option-2")
    private WebElement stateHaryana;

    @FindBy(id = "react-select-3-option-3")
    private WebElement stateRajasthan;

    @FindBy(id = "city")
    private WebElement selectCityDropdown;

    @FindBy(id = "react-select-4-option-0")
    private WebElement cityDelhi;

    @FindBy(id = "react-select-4-option-1")
    private WebElement cityGurgaon;

    @FindBy(id = "react-select-4-option-2")
    private WebElement cityNoida;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "closeLargeModal")
    private WebElement closeButton;

    @FindBy(xpath = "//td[text()='Student Name']//..//td[2]")
    private WebElement studentName;

    @FindBy(xpath = "//td[text()='Student Email']//..//td[2]")
    private WebElement studentEmail;

    @FindBy(xpath = "//td[text()='Gender']//..//td[2]")
    private WebElement studentGender;

    @FindBy(xpath = "//td[text()='Mobile']//..//td[2]")
    private WebElement studentMobile;

    @FindBy(xpath = "//td[text()='Subjects']//..//td[2]")
    private WebElement studentSubject;

    @FindBy(xpath = "//td[text()='Hobbies']//..//td[2]")
    private WebElement studentHobbies;

    @FindBy(xpath = "//td[text()='Address']//..//td[2]")
    private WebElement studentAddress;

    @FindBy(xpath = "//td[text()='State and City']//..//td[2]")
    private WebElement studentStateAndCity;



    public PracticeFormPage fillFormFirstName(String firstName) {
        clearAndEnterTextIntoElement(inputFirstName, firstName);
        return this;
    }

    public PracticeFormPage fillFormLastName(String lastName) {
        clearAndEnterTextIntoElement(inputLastName, lastName);
        return this;
    }

    public PracticeFormPage fillFormEmail(String email) {
        clearAndEnterTextIntoElement(inputEmail, email);
        return this;
    }

    public PracticeFormPage selectGenderInForm(String gender) {
        switch (gender) {
            case "Male":
                scrollByAmount(200);
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            case "Other":
                clickOnElement(genderOther);
                break;
        }
        return this;

    }

    public PracticeFormPage fillFormMobile(String mobile) {
        clearAndEnterTextIntoElement(inputMobileNumber, mobile);
        return this;
    }

    public PracticeFormPage fillFormSubject(String subject) {
        clearAndEnterTextIntoElement(inputSubject, subject);
        selectSubjectFromDropdown();
        return this;
    }

    public PracticeFormPage selectHobbiesInForm(String hobby) {
        switch (hobby) {
            case "Sports":
                clickOnElement(hobbySports);
                break;
            case "Reading":
                clickOnElement(hobbyReading);
                break;
            case "Music":
                clickOnElement(hobbyMusic);
                break;
        }
        return this;
    }

    public PracticeFormPage fillFormCurrentAddress(String currentAddress) {

        scrollToElement(inputCurrentAddress);
        scrollByAmount(200);
        clearAndEnterTextIntoElement(inputCurrentAddress, currentAddress);
        return this;
    }

    public PracticeFormPage selectStateInForm(String state) {

        scrollToElement(selectStateDropdown);
        scrollByAmount(200);
        clickOnElement(selectStateDropdown);
        switch (state) {
            case "NCR":
                clickOnElement(stateNCR);
                break;
            case "Uttar Pradesh":
                clickOnElement(stateUttarPradesh);
                break;
            case "Haryana":
                clickOnElement(stateHaryana);
                break;
            case "Rajasthan":
                clickOnElement(stateRajasthan);
                break;
        }
        return this;
    }


    public PracticeFormPage selectCityInForm(String city) {

        clickOnElement(selectCityDropdown);
        switch (city) {
            case "Delhi":
                clickOnElement(cityDelhi);
                break;
            case "Gurgaon":
                clickOnElement(cityGurgaon);
                break;
            case "Noida":
                clickOnElement(cityNoida);
                break;
        }
        return this;
    }

    public PracticeFormPage clickOnSubmitButton() {
        clickOnElement(submitButton);
        return this;
    }

    public PracticeFormPage checkIsFormSubmitted(String firstName, String lastName
                                                 ,String gender, String email, String mobile, String subject, String currentAddress, String state, String city) {
        scrollToElement(closeButton);
        scrollByAmount(200);
        checkIsElementVisible(closeButton);

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(studentName.getText()).as("Student name").isEqualTo(firstName + " " + lastName);
        softAssertions.assertThat(studentEmail.getText()).as("Student email").isEqualTo(email);
        softAssertions.assertThat(studentMobile.getText()).as("Student mobile").isEqualTo(mobile);
        softAssertions.assertThat(studentGender.getText()).as("Student gender").isEqualTo(gender);
        softAssertions.assertThat(studentSubject.getText()).as("Student subject").isEqualTo(subject);
        softAssertions.assertThat(studentAddress.getText()).as("Student address").isEqualTo(currentAddress);
        softAssertions.assertThat(studentStateAndCity.getText())
                .as("Student state and city").isEqualTo(state + " " + city);
        softAssertions.assertAll();
        return this;
    }
}

