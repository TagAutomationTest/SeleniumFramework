package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/Resources/Features", plugin = "json:target/cucumber.json", glue = {
        "Definitions"}, tags = "not @ignore")

public class Testrunner {
//this test
}
