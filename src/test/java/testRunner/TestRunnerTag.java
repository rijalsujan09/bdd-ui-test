package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureWithTags/", 
glue = {"StepDefinations" }, 
monochrome = true, 
tags = "(@smoke or @regression) and not @important")
public class TestRunnerTag {

}