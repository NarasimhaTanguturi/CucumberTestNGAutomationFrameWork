
	package Runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/Feature",
			glue = "StepDefinition",
			plugin= {"pretty",
					 "json:target/cucumberJSONReports/Cucumber.json",
					 "junit:target/cucumberXMLReports/Cucumber.xml",
					"html:target/cucumberreport.html"		
			},
			monochrome = true
			)


	public class TestRunnerDemo {

		
		
	}

	

