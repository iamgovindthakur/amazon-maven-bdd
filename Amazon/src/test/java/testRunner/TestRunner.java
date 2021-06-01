package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = { "./src/test/resources/features/testcase.feature" }, glue = {
		"stepDefinition" }, plugin = { "pretty", "html:Reports/Amazoncucumber-html-report" })

public class TestRunner {
}
