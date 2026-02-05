package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/keyboard-events");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        Actions actions = new Actions(driver);

        actions.sendKeys("string from Selenium script").perform();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']/following-sibling::h1"));
        System.out.println(result.getText());
        driver.quit();
    }
}