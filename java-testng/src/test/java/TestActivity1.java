import java.util.Objects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestActivity1 {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://training-support.net");
    }

    @Test
    public void testing() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Training Support", title);
        driver.findElement(Objects.requireNonNull(By.xpath("//a[text()='About Us']"))).click();
        ;
        String aboutTitle = driver.getTitle();
        System.out.println("About us :" + aboutTitle);
        Assert.assertEquals(aboutTitle, "Training Support");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
