package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://training-support.net");

        System.out.println("Home Page Title: " + driver.getTitle());

        WebElement aboutUs = driver.findElement(By.linkText("About Us"));
        aboutUs.click();

        Thread.sleep(2000);
        System.out.println("About Us Page Title: " + driver.getTitle());

        driver.quit();
    }
}
