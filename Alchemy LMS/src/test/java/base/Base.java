package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class Base {
    // Instance variables (better for TestNG than static)
    public WebDriver driver;
    public WebDriverWait wait;

    @Parameters("url")
    @BeforeClass(alwaysRun = true)
    public void setup(@Optional("https://alchemy.hguy.co/lms") String url) {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Navigate to the URL provided by XML (or the default optional one)
        driver.get(url);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}