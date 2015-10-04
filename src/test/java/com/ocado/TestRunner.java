package com.ocado;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "Stories"
		,glue = {"com.ocado.bdd"}
		,format={"pretty","html:reports/test-report"}
		)
public class TestRunner {

}
