import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestActivity5 extends Base {

    @Test
    public void test() {
        wait.until(ExpectedConditions.titleContains("Alchemy"));
        WebElement myAccountRef = driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]"));
        myAccountRef.click();
        boolean isMyAccountPage = wait.until(ExpectedConditions.titleContains("My Account"));
        Assert.assertTrue(isMyAccountPage);
    }
}
