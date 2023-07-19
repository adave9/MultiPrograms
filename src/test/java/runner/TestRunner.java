package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features =  {"src/test/resources/features/GoogleSearch_Feature.feature"},
	
				/*{"src/test/resources/features/login.feature",
				"src/test/resources/features/googlesearch.feature",
				"src/test/resources/features/paramtest.feature", 
			"src/test/resources/features/test.feature",
			"src/test/resources/features/trial.feature"}, 
		"@target/rerun.txt",*/
		
		glue = {"stepDef"},
			//	tags = "@SmokeTest", 
				plugin = { "pretty", 
						//"json:target/cucumber-reports/json-report.json",
						//"junit:target/cucumber-reports/html-report.xml",
						"html:target/cucumber-reports/xml-report.html"},
		publish = true,
		monochrome = true,
		dryRun = false
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
