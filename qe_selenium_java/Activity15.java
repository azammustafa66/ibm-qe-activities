package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
        public static void main(String[] args) {

                WebDriver driver = new FirefoxDriver();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                driver.get("https://training-support.net/webelements/dynamic-attributes");
                driver.manage().window().maximize();

                System.out.println(driver.getTitle());

                driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"))
                                .sendKeys("Pranshu Tiwari");

                driver.findElement(By.xpath("//input[contains(@id,'email')]"))
                                .sendKeys("pranshut110@gmail.com");

                driver.findElement(By.xpath("//input[@type='date']"))
                                .sendKeys("2003-09-17"); // correct format for date input

                driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]"))
                                .sendKeys("hello, my name is Milind.");

                driver.findElement(By.xpath("//button[text()='Submit']")).click();

                WebElement confirmation = wait.until(
                                ExpectedConditions.visibilityOfElementLocated(
                                                By.xpath("//h3[@id='action-confirmation']")));

                System.out.println("Confirmation message: " + confirmation.getText());
                driver.quit();
        }
}