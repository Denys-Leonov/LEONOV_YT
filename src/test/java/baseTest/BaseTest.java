package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testData.TestData;
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

        webDriver.get("https://demoqa.com/login");

        WebElement userNameField =  webDriver.findElement(By.xpath("//input[@placeholder='UserName']"));
        WebElement passwordField =  webDriver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginButton = webDriver.findElement(By.id("login"));
        userNameField.sendKeys(TestData.USER_NAME);
        passwordField.sendKeys(TestData.PASSWORD);
        logger.info("check title: " + webDriver.getTitle());
        loginButton.click();
        Utils.waitABit(2);
        webDriver.quit();
    }
}
