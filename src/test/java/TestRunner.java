import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",    // manually type for location
        glue = "stepDef",                       // manually type make relation between features file with stepDef
        plugin = {                              // manually type for report

        }
)
                                                // Java folder> right click> Java Class
public class TestRunner extends AbstractTestNGCucumberTests {
                                                // extends AbstractTestNGCucumberTests

}
