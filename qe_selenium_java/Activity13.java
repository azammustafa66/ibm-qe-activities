package demos;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/tables");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        System.out.println("Number of rows: " + rows.size());

        List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]/td"));
        System.out.println("Number of columns: " + columns.size());

        System.out.println("Values in the third row: ");
        List<WebElement> thirdRowCells = driver.findElements(By.xpath("//table//tr[3]/td"));

        for (WebElement cell : thirdRowCells)
            System.out.println(cell.getText());

        System.out.println(
                "Value at 2nd Row, 2nd Column: " + driver.findElement(By.xpath("//table//tr[2]//td[2]")).getText());

        driver.quit();
    }

}