package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://training-support.net/webelements/target-practice");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        WebElement thirdHeader = driver.findElement(By.xpath("(//h3)[3]"));
        System.out.println(thirdHeader.getText());

        WebElement fifthHeader = driver.findElement(By.xpath("(//h3)[5]"));
        System.out.println(fifthHeader.getCssValue("color"));

        WebElement purpleButton = driver.findElement(By.id("purple"));
        System.out.println(purpleButton.getAttribute("class"));

        WebElement slateButton = driver.findElement(By.cssSelector("button.bg-slate-500"));
        System.out.println(slateButton.getText());

        driver.quit();
    }
}
