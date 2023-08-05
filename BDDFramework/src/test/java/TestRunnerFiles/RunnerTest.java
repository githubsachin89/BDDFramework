package TestRunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"AllFeatureFiles"},
			extraGlue= {"StepDefinationsFiles"},
			dryRun=false
			
			)
public class RunnerTest {

}
