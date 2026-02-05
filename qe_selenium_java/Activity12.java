package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-content");
        System.out.println(driver.getTitle());

        WebElement genButton = driver.findElement(By.id("genButton"));
        genButton.click();

        WebElement word = driver.findElement(By.id("word"));

        wait.until(ExpectedConditions.textToBePresentInElement(word, "release"));
        System.out.println("Word is: " + word.getText());

        driver.quit();
    }
}