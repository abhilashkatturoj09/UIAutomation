package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"StepDefs"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-report.html"},
        monochrome = true,
        tags = "@RegisterUser"
)
public class TestRunner {
}
