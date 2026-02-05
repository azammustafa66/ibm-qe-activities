import base.Base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestActivity1 extends Base {
    @Test
    public void test() throws InterruptedException {
        Thread.sleep(2000);
        String title = driver.getTitle();
        String expected = "Alchemy LMS – An LMS Application";
        Assert.assertEquals(title, expected);
    }
}
