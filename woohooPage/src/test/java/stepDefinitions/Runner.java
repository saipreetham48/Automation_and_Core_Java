package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/woohoo.feature"}, glue = {"stepDefinitions"},
plugin = {"pretty","html:target/HtmlReports/index.html",
		"json:target/JsonReports/reports.json","junit:target/JunitReports/report.xml"},monochrome = true
		

		)

public class Runner {

}
