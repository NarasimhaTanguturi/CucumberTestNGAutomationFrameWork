package DemoRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features/DemoWebshopLoginPage.feature",
		glue = "StepDefinition/CheckLoginFunctionality",
		plugin= {"pretty"},
		monochrome = true,
		tags = "loginCheck"
		)



public class RunnerClass {

}
