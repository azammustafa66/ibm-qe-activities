import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;
import org.slf4j.*;

public class TestActivity9 {
    private WebDriver driver;
    private WebDriverWait wait;
    private static Logger logger = LoggerFactory.getLogger(TestActivity9.class);

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Navigating to the url provided");
        driver.get("https://training-support.net/webelements/alerts");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test(groups = { "Alerts" })
    public void simpleAlertsTest() {
        WebElement simpleAlertButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Objects.requireNonNull(By.id("simple")))));
        logger.info("Clicking the button");
        simpleAlertButton.click();

        String alertText = driver.switchTo().alert().getText();
        logger.info("Matching the alert text with expectation");
        Assert.assertEquals(alertText, "You've just triggered a simple alert!");

        logger.info("Dismissing the alert");
        driver.switchTo().alert().dismiss();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
