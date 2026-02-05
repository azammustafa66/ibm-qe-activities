package demos;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity14 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/tables");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        System.out.println("Number of rows: " + driver.findElements(By.xpath("//table//tr")).size());

        System.out.println("Number of columns: " + driver.findElements(By.xpath("//table//tr[1]/td")).size());

        System.out
                .println("Book Name in Fifth Row: " + driver.findElement(By.xpath("//table//tr[5]//td[2]")).getText());

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.xpath("//table//thead//tr[1]//th[5]"))).perform();

        System.out
                .println("Book Name in Fifth Row: " + driver.findElement(By.xpath("//table//tr[5]//td[2]")).getText());

        driver.quit();
    }

}