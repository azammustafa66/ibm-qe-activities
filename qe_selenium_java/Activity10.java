package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/drag-drop");
        Thread.sleep(2000);

        System.out.println("Page title: " + driver.getTitle());

        Actions actions = new Actions(driver);

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        actions.dragAndDrop(ball, dropzone1).perform();
        Thread.sleep(1000);
        System.out.println("Dropzone 1: " + dropzone1.getText());

        actions.dragAndDrop(ball, dropzone2).perform();
        Thread.sleep(1000);
        System.out.println("Dropzone 2: " + dropzone2.getText());

        Thread.sleep(3000);
        driver.quit();

    }

}
