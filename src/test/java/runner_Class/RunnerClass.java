package runner_Class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:featutes",
		glue = "step_DefinationClass",
		tags = "@OtherScenario1",
		monochrome = true,
		dryRun = false,
		plugin = {
				
				"pretty",
				"html: target/cucumber",
				"json:target/cucumber.json"
				
				
		}
		)
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		




















public class RunnerClass {
		
		
		
		
	}



