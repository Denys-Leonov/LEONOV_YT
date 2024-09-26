package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Utils;

import java.time.Duration;

public class BaseTest {
    private WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());

    @Test
    public void setup() {
        logger.info("Start browser");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Browser opened");

        webDriver.get("https://www.youtube.com/");

        Utils.waitABit(5);
        logger.info("Open youtube.com");
        logger.info("check title: " + webDriver.getTitle());
        webDriver.quit();
    }
}
