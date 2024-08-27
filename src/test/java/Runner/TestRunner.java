package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature"},glue = {"classpath:Steps"},tags="@smoke",
monochrome = true)
public class TestRunner{
	

}
