package com.TestRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "com.FeatureFiles"
		,glue={"com.StepDefinitions"}
		)
 
public class TestRunner {
 
}