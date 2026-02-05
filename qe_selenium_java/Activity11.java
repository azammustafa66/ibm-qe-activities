package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(driver.getTitle());

        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox"));

        WebElement toggleBtn = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
        toggleBtn.click();

        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        toggleBtn.click();

        WebElement newCheckbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("#checkbox")));

        newCheckbox.click();

        System.out.println("Checkbox selected successfully!");

        driver.quit();
    }
}