package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		// the path of the feature files
		features = "C:/01Work/03Automation/01Automation2020/FreeCRMBDD/src/main/java/Features/login.feature",

		// the path of the step definition files
		glue = { "stepDefinations" },

		// to generate different types of reporting
		plugin = { "pretty", "html:test-outout" },
		// , "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml

		monochrome = true, // display the console output in a proper readable format
		// strict = true, //it will check if any step is not defined in step definition
		// file
		// dryRun = false //to check the mapping is proper between feature file and step
		// def file
		tags = { "~@SmokeTest", "~@RegressionTest", "~@End2End" })

public class TestRunner {

}
