package suites;

import bookSearchTests.BookSearchTest;
import fillingFormsTests.FillingFormTest;
import loginTests.LoginTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import toolTipsTests.ToolTipsTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookSearchTest.class,
        FillingFormTest.class,
        LoginTests.class,
        ToolTipsTests.class
})

public class AllTests {

}
