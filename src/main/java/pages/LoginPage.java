package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.leftNavBar.LeftNavBar;
import utils.Utils;

import java.util.List;

public class LoginPage extends ParentPage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//input[@placeholder='UserName']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement inputPassword;

    @FindBy(id = "login")
    private WebElement buttonLogin;

    @FindBy(xpath = "//*[@class='mr-sm-2 is-invalid form-control' and @placeholder='UserName']")
    private WebElement errorLogin;

    @FindBy(xpath = "//*[@class='mr-sm-2 is-invalid form-control' and @placeholder='Password']")
    private WebElement errorPassword;

    @FindBy(xpath = "//p[text()='Invalid username or password!']")
    private WebElement errorInvalidUsernameOrPassword;

    private String LIST_OF_ERRORS = "//*[@class='mr-sm-2 is-invalid form-control']";


    @Override
    public String getRelativeUrl() {
        return "/login";
    }

    public LeftNavBar getLeftNavBar() {
        return new LeftNavBar(webDriver);
    }

    public LoginPage openLoginPage() {
        webDriver.get(baseUrl + getRelativeUrl());
        return this;
    }


    public LoginPage enterUsername(String userName) {
        if (userName.equals("\"\"")) {
            return this;
        } else {
            clearAndEnterTextIntoElement(inputLogin, userName);
            return this;
        }

    }

    public LoginPage enterPasswordInput(String password) {
        if (password.equals("\"\"")) {
            return this;
        } else {
            clearAndEnterTextIntoElement(inputPassword, password);
            return this;

        }
    }

    public LoginPage clickLoginButton() {
        scrollByAmount();
        clickOnElement(buttonLogin);
        Utils.waitABit(1);// потрібно виконати додатковий скрол до кнопки через наявну рекламу, яка відсуває кнопку вниз
        return this;
    }

    public void checkIsLoginButtonNotVisible() {
        checkIsElementNotVisible(buttonLogin);
    }

    public void checkForErrors(String expectedErrors) {
        switch (expectedErrors) {
            case "login":
                checkIsElementVisible(errorLogin);
                break;
            case "password":
                checkIsElementVisible(errorPassword);
                break;
            case "Invalid username or password!":
                checkIsElementVisible(errorInvalidUsernameOrPassword);
                break;
            case "redTwoFields":
                checkIsElementVisible(errorLogin);
                checkIsElementVisible(errorPassword);
                break;
            default:
                logger.error("Can not find expected error");
        }
    }
}
