
package runner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(value = Cucumber.class)
@CucumberOptions(features = "resources/features",
					glue ="stepDef", 
					dryRun=false,
					monochrome = true,
				    //plugin = { "pretty","html:target/cucumber-reports.html" },
					plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
					tags="@Login"
)
public class Runner{}