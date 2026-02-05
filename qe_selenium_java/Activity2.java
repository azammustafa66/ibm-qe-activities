package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/login-form/");
        System.out.println(driver.getTitle());
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#username")).sendKeys("admin");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(1000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}