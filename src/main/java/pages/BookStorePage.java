package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.leftNavBar.LeftNavBar;

import java.util.List;


public class BookStorePage extends ParentPage {

    public BookStorePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getRelativeUrl() {
        return "/books";
    }

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(xpath = "//div[@class='action-buttons']")
    private List<WebElement> foundBooks;


    public LeftNavBar getLeftNavBar() {
        return new LeftNavBar(webDriver);
    }

    public BookStorePage openBookStorePage() {
        webDriver.get(baseUrl + getRelativeUrl());
        return this;
    }

    public BookStorePage enterTextToSearchBox(String text) {
        clearAndEnterTextIntoElement(searchBox, text);
        return this;
    }

    public BookStorePage checkSearchResult(int expectedNumberOfResults) {
        Assert.assertEquals("Number of found books is not as expected", expectedNumberOfResults, foundBooks.size());
        logger.info("Number of found books expected: " + expectedNumberOfResults + ";" + " actual: " + foundBooks.size() + ";");
        return this;
    }


}
