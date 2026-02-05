import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class TestActivity9 extends Base {
    @Test
    public void testCourses() {
        WebElement coursesPageLink = driver.findElement(By.xpath("//*[@id=\"menu-item-1508\"]"));
        coursesPageLink.click();

        wait.until(ExpectedConditions.titleContains("All Courses"));
        WebElement parentDiv = driver.findElement(By.className("ld-course-list-items"));
        List<WebElement> coursesList = parentDiv.findElements(By.className("ld_course_grid"));

        coursesList.getFirst().click();
    }
}