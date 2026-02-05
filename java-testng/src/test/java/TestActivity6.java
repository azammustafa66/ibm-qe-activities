import java.time.Duration;
import java.util.Objects;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestActivity6 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/webelements/login-form");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test(groups = { "Login" })
    @Parameters({ "username", "password" })
    public void testing(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        WebElement userNameInput = driver.findElement(Objects.requireNonNull(By.id("username")));
        WebElement passwordInput = driver.findElement(Objects.requireNonNull(By.id("password")));
        WebElement loginButton = driver.findElement(Objects.requireNonNull(By.xpath("//button[text()='Submit']")));

        userNameInput.clear();
        passwordInput.clear();
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h1"), "Login Success"));

        String message = driver.findElement(Objects.requireNonNull(By.tagName("h1"))).getText();
        Assert.assertEquals(message, "Login Success!");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
