package Runner;

import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	
	@CucumberOptions(
			plugin = {"pretty", "html:target/kavi.html"}, //reporting purpose
			monochrome=false,  //console output
			//tags = "@TS001", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"stepDefinitions"}) //location of step definition files

	public class testRunner {

	}

}
