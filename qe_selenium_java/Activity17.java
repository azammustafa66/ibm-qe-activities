package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        WebElement dropdown = driver.findElement(By.tagName("select"));

        Select select = new Select(dropdown);

        select.selectByVisibleText("One");

        select.selectByIndex(2);

        select.selectByValue("three");

        List<WebElement> options = select.getOptions();

        System.out.println("All dropdown options:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
}