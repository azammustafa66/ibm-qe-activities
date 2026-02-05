package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

    public static void main(String[] args) throws InterruptedException {

        // If geckodriver is not in PATH, uncomment and set path
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        try {
            // Open site
            driver.get("https://training-support.net/webelements/mouse-events");
            Thread.sleep(2000);

            System.out.println("Page title: " + driver.getTitle());

            Actions actions = new Actions(driver);

            // Click Cargo.lock -> Cargo.toml
            WebElement cargoLock = driver.findElement(By.id("cargo-lock"));
            WebElement cargoToml = driver.findElement(By.id("cargo-toml"));

            actions.click(cargoLock)
                    .moveToElement(cargoToml)
                    .click()
                    .build()
                    .perform();

            Thread.sleep(1000);
            System.out.println("Confirmation: " +
                    driver.findElement(By.id("result")).getText());

            // Double click src and right click target
            WebElement src = driver.findElement(By.id("src"));
            WebElement target = driver.findElement(By.id("target"));

            actions.doubleClick(src)
                    .contextClick(target)
                    .build()
                    .perform();

            Thread.sleep(1000);

            // Click Open
            WebElement openOption = driver.findElement(By.id("open"));
            openOption.click();

            Thread.sleep(1000);
            System.out.println("Confirmation: " +
                    driver.findElement(By.id("result")).getText());

        } finally {
            driver.quit();
        }
    }
}
