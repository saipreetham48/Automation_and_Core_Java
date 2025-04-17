package Tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureTags", glue = {"StepDefinitions"},
tags = "(@smoke or not @regression) and not @important"


		)
public class TestRunner_tags {
	

}
