package testDefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity1StepDefinitions extends Base {

    @Given("The user is on the home page")
    public void userIsOnHomePage() {
        driver.get("https://training-support.net/");
    }

    @When("The user clicks About Us Button")
    public void userClicksAboutUsButton() {
        driver.findElement(By.xpath("/html/body/div/" +
                "main/div/div/main/a")).click();
    }

    @Then("User should be taken to About Us Page")
    public void verifyUserIsOnAboutUsPage() {
        wait.until(ExpectedConditions.titleContains("About"));
        Assertions.assertEquals("About Us", driver.findElement(By.tagName("h1")).getText());
    }
}
