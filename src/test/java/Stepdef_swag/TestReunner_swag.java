package Stepdef_swag;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome = true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/Feature", // location of feature file
		glue = "Stepdef_swag", //name of the package
		tags = {"@Sanity or @regression"} // to run multiple tags
		)
public class TestReunner_swag {

}
