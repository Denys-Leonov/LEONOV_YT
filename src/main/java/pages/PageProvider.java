package pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage getLoginPage() {
        return new LoginPage(webDriver);
    }

    public WidgetsPage getHomePage() {
        return new WidgetsPage(webDriver);
    }

    public MainPage getMainPage() {
        return new MainPage(webDriver);
    }

    public ProfilePage getProfilePage() {
        return new ProfilePage(webDriver);
    }

    public BookStorePage getBookStorePage() {
        return new BookStorePage(webDriver);
    }
}
