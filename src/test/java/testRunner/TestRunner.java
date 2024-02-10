package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/", 
glue= {"StepDefinations"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml", 
		            "html:target/HTMLReports/report.html",
		            "json:target/JSONReports/report.json"})
public class TestRunner {

}
