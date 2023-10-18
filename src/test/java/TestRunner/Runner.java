package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\nitin.goel\\eclipse-workspace\\Nitin_G\\src\\test\\java\\Features\\DemoWebShop.feature",
		glue={"StepDefinitions"},
		tags = "@giftCards",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		//tags = {'@Regression'}
		
		)

public class Runner {

}
