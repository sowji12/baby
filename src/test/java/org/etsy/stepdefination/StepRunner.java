package org.etsy.stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue="org.etsy.stepdefination",plugin="html:target","rerun:src/test/resources/failed.txt","json:target/report.json")

public class StepRunner {

}
