package org.example.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/main/resources/Features/carrito.feature",
        glue = {"StepDefinition"},
        plugin = {"json:test/report/cucumber_report.json"},
        format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
        monochrome = true,
        strict = true,
        dryRun = false,
        snippets = CAMELCASE
)

public class TestRunner_Opencart {
}
