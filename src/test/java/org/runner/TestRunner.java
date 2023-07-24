package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "org.steps", monochrome= true, snippets = SnippetType.CAMELCASE, plugin = {
		"pretty", "json:target\\output.json" })
public class TestRunner {

	@AfterClass
	public static void afterExecution() {
		Report.generateJVMReport(System.getProperty("user.dir") + "\\target\\output.json");
	}

}
