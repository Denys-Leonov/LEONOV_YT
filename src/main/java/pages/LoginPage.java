package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.leftNavBar.LeftNavBar;

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
        clearAndEnterTextIntoElement(inputLogin, userName);
        return this;
    }

    public LoginPage enterPasswordInput(String password) {
        clearAndEnterTextIntoElement(inputPassword, password);
        return this;
    }

    public LoginPage clickLoginButton() {
        scrollToElement(buttonLogin); // потрібно виконати додатковий скрол до кнопки через наявну рекламу, яка відсуває кнопку вниз
        clickOnElement(buttonLogin);
        return this;
    }

    public void checkIsLoginButtonNotVisible() {
        checkIsElementNotVisible(buttonLogin);
    }
}
