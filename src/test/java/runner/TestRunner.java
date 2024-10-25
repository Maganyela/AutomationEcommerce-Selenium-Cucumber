package runner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json","cucumber-picocontainer"}

)
public class TestRunner {


}
