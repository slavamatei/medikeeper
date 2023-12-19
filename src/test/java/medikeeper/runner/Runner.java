package medikeeper.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "medikeeper/step_definitions",
        dryRun = false,
        tags = "@Login"
)

public class Runner extends AbstractTestNGCucumberTests {
}