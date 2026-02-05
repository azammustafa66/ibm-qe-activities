import base.Base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestActivity2 extends Base {
    @Test
    public void test() {
        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        String actual = heading.getText();
        String expected = "Learn from Industry Experts";
        Assert.assertEquals(actual, expected);
    }
}
