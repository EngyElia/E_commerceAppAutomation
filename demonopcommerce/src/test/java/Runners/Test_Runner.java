package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "junit:target/cukes.xml",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        dryRun = false,
        tags = "@smoke"
)
public class Test_Runner extends AbstractTestNGCucumberTests {
}
