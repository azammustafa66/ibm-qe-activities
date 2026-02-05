import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestActivity8 extends Base {
    @Test
    public void fillContactUsForm() {
        driver.findElement(By.xpath("//*[@id=\"menu-item-1506\"]")).click();
        wait.until(ExpectedConditions.titleContains("Contact"));

        WebElement nameField = driver.findElement(By.id("wpforms-8-field_0"));
        WebElement emailField = driver.findElement(By.id("wpforms-8-field_1"));
        WebElement subjectField = driver.findElement(By.id("wpforms-8-field_3"));
        WebElement messageField = driver.findElement(By.id("wpforms-8-field_2"));

        nameField.sendKeys("John Doe");
        emailField.sendKeys("john.doe@example.com");
        subjectField.sendKeys("Subject");
        messageField.sendKeys("lorem ipsum dolour sit amet");
    }
}
