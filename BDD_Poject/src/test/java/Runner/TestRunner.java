package Runner;

import TestCases.BaseTest;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features ="src/test/java/Features",
        glue={"steps"},
        plugin={"pretty","html:target/cucumber-html-report.html"})
public class TestRunner extends BaseTest {

}
