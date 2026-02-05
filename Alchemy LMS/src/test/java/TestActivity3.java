import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestActivity3 extends Base {
    @Test
    public void test() {
        String actual = driver.findElement(By.xpath("//*[@id=\"uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810\"]/div/div" +
                "/div/div[2]/h3")).getText();
        String expected = "Actionable Training";
        Assert.assertEquals(actual, expected);
    }
}
