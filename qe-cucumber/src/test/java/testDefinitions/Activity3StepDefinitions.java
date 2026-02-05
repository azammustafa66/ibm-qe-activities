package testDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.*;

public class Activity3StepDefinitions extends Base {
    private static Alert alert;

    @Given("User is on the page")
    public void alertPage() {
        driver.get("https://training-support.net/webelements/alerts");
        Assertions.assertEquals("Selenium: Alerts", driver.getTitle());
    }

    @When("User clicks the Simple Alert button")
    public void simpleAlert() {
        driver.findElement(By.id("simple")).click();
    }

    @When("User clicks the Confirm Alert button")
    public void confirmationAlert() {
        driver.findElement(By.id("confirmation")).click();
    }

    @When("User clicks the Prompt Alert button")
    public void promptAlert() {
        driver.findElement(By.id("prompt")).click();
    }

    @Then("Alert opens")
    public void switchToAlert() {
        // This wait ensures the alert exists before we try to switch to it
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
    }

    @And("Read the text from it and print it")
    public void getAlertText() {
        System.out.println("Alert text: " + alert.getText());
    }

    @And("Close the alert")
    public void acceptAlert() {
        alert.accept();
    }

    @And("Close the alert with cancel")
    public void dismissAlert() {
        alert.dismiss();
    }

    @And("Write a custom message in it {string}")
    public void enterMessage(String message) {
        alert.sendKeys(message);
    }

    @And("Read the result text")
    public void resultMessage() {
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result: " + result.getText());
    }
}