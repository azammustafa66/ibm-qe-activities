import base.Base;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestActivity6 extends Base {
    @Test
    public void testLogin() {
        wait.until(ExpectedConditions.titleContains("Alchemy"));
        WebElement myAccountRef = driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]"));
        myAccountRef.click();

        wait.until(ExpectedConditions.titleContains("My Account"));
        driver.findElement(By.className("ld-login-button")).click();

        Dotenv dotenv = Dotenv.load();
        WebElement userNameInput = driver.findElement(By.id("user_login"));
        WebElement passwordInput = driver.findElement(By.id("user_pass"));

        userNameInput.clear();
        passwordInput.clear();
        userNameInput.sendKeys(dotenv.get("USERNAME"));
        passwordInput.sendKeys(dotenv.get("PASSWORD"));

        boolean isMyAccountPage = wait.until(ExpectedConditions.titleContains("My Account"));
        Assert.assertTrue(isMyAccountPage);
    }
}
