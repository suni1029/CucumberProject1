package testRunner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},glue = {"stepDefinition"}, monochrome = true,
plugin= {"pretty","html:ERPProject/report/cucumber.html","json:ERPProject/report/cucumber.json","junit:target/report/cucumber.junit"},tags = ("@Customer"))
public class AppTest extends AbstractTestNGCucumberTests {

}

