package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println(driver.getTitle());

        WebElement textField = driver.findElement(By.id("input-text"));
        System.out.println(textField.isEnabled());

        WebElement enableButton = driver.findElement(By.id("toggleInput"));
        enableButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(textField));

        System.out.println(textField.isEnabled());

        driver.quit();
    }
}
