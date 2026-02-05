package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println(checkbox.isDisplayed());

        driver.findElement(By.id("toggleCheckbox")).click();
        Thread.sleep(2000);

        System.out.println(driver.findElements(By.id("checkbox")).size() > 0);

        driver.quit();
    }
}
