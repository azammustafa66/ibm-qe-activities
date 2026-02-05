package cucumberOptions;

import io.cucumber.testng.*;

@CucumberOptions(features = "src/test/java/features",
        glue = "stepDefinitions", monochrome = true)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
