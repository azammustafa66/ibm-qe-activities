import java.util.Objects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestActivity5 {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setupClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test(groups = { "Title" })
    public void testing1() {
        Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
    }

    @Test(groups = { "Headers" })
    public void testing2() {
        WebElement thirdHeader = driver.findElement(Objects.requireNonNull(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]")));
        Assert.assertEquals(thirdHeader.getText(), "Heading #3");

        WebElement fifthHeader = driver.findElement(Objects.requireNonNull(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5")));
        String color = fifthHeader.getCssValue("color");
        Assert.assertTrue(
                color.equals("rgb(147, 51, 234)") ||
                        color.equals("rgba(147, 51, 234, 1)"),
                "Unexpected h5 color: " + color);
    }

    @Test(groups = { "Buttons" })
    public void testing3() {
        WebElement thirdRowButton = driver
                .findElement(Objects.requireNonNull(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[5]")));
        String color = thirdRowButton.getCssValue("color");
        Assert.assertTrue(
                color.equals("rgb(88, 28, 135)") ||
                        color.equals("rgba(88, 28, 135, 1)"),
                "Unexpected button color: " + color);
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}