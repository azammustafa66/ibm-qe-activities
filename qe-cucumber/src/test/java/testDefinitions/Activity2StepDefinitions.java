package testDefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity2StepDefinitions extends Base {

    @Given("The user is on the login page")
    public void userIsOnLoginPage() {
        driver.get("https://training-support.net/webelements/login-form");
    }

    @When("The user enters username and password")
    public void entersCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
    }

    @And("Clicks the submit btn")
    public void clicksSubmit() {
        driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
    }

    @Then("Get the confirmation message and verify it")
    public void verifyConfirmation() {
        wait.until(ExpectedConditions.titleContains("Success!"));
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("Login Success!", actualText);
    }

    @Then("Get the confirmation message and verify the message as {string}")
    public void getTheConfirmationMessageAndVerifyTheMessageAs(String expected) {
        wait.until(ExpectedConditions.titleContains("Success!"));
        String actual = driver.findElement(By.tagName("h2")).getText();
        Assertions.assertEquals(expected, actual);
    }

    @When("The user enters {string} and {string}")
    public void theUserEnters(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("Get the confirmation text and verify the message as {string}")
    public void getTheConfirmationTextAndVerifyTheMessageAs(String expected) {
        WebElement invalidCreds = driver.findElement(By.xpath(
                "//*[@id=\"subheading\"]"));
        wait.until(ExpectedConditions.visibilityOf(invalidCreds));
        Assertions.assertTrue(invalidCreds.getText().contains("Invalid"));
    }
}