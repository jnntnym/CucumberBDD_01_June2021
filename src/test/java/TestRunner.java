import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",    // manually type for feature file location
        glue = "stepDef",                       // manually type make relation between features file with stepDef by glue
        plugin = {                              // manually type for report
                "json:target/cucumber.json"
        }
)
                                                // Java folder> right click> Java Class
public class TestRunner extends AbstractTestNGCucumberTests {
                                                // extends AbstractTestNGCucumberTests for Automate
}
