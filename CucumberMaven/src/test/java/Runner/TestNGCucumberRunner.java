package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Feature",
		glue = "StepDefinition",
		plugin= {"pretty",
				"html:target/cucumberreport.html"		
		},
		tags="@login",
		monochrome = true
		)



public class TestNGCucumberRunner extends AbstractTestNGCucumberTests{

}
