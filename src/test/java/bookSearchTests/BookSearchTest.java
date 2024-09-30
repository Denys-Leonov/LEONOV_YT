package bookSearchTests;

import baseTest.BaseTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class BookSearchTest extends BaseTest {

    @Test
    @Parameters(method = "parametersForSearchBook")
    public void searchBook(String bookName, int expectedNumberOfResults) {
        pageProvider.getMainPage().openMainPage().clickOnBookStore().enterTextToSearchBox(bookName)
                .checkSearchResult(expectedNumberOfResults);

    }

    public Object[][] parametersForSearchBook() {
        return new Object[][]{{"Java", 4}, {"Non-existent", 0}};
    }

}
