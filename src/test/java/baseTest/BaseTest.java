package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageProvider;

import java.time.Duration;

import static utils.ConfigProvider.*;

public class BaseTest {
    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());
    protected PageProvider pageProvider;


    @Before
    public void setup() {
        logger.info("Test started: " + testName.getMethodName());
        logger.info("Start browser");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configProperties.TIME_FOR_IMPLICIT_WAIT()));
        pageProvider = new PageProvider(webDriver);

    }

    @Rule
    public TestName testName = new TestName();

    @After
    public void tearDown() {
        webDriver.quit();
        logger.info("Browser closed");
        logger.info("Test finished: " + testName.getMethodName());
    }
}
