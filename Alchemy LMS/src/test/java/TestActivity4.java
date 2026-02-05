import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestActivity4 extends Base {
    @Test
    public void test() {
        WebElement parentDiv = driver.findElement(By.className("ld-course-list-items"));
        List<WebElement> courseTitles = parentDiv.findElements(By.className("entry-title"));
        boolean isFound = false;

        for (WebElement title : courseTitles) {
            if (title.getText().equals("Email Marketing Strategies")) {
                isFound = true;
                break;
            }
        }
        Assert.assertTrue(isFound, "The course 'Email Marketing Strategies' was not found in the list.");
    }
}
