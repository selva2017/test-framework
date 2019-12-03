package com.selva.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions( 
//		features = "src/test/java/resources"
//		,glue = {"classpath:.","src/test/java","com.selva.selenium.learning"}
//		,monochrome = true // console output in readable format
//		,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
//		,dryRun=true //check mapping b'wn cucumber and step def.missed step definitions 
//		,strict=true //fail if any step is not defined in step-def files
//		)

@CucumberOptions(
features = "src/test/java/resources"
,glue = {"classpath:.","src/test/java","com.selva.selenium.learning"}
//,format={'pretty','html:test-output'}
//,dryRun=true
)
public class CucumberRunner {

}
