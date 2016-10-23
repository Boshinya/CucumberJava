package com.boshinya;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by bothees on 19/10/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format ={"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json"},features ="src/test/resources/features",glue="com.boshinya.stepdefinitions")
public class RunTest {

}





