package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/java/featureFiles", 
		glue = {"steps"}
//		monochrome = true, 
//		dryRun = true
		)

public class Runner extends AbstractTestNGCucumberTests{

}
