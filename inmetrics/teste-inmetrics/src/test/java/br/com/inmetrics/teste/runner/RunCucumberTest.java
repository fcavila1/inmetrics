package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = { "html:target/cucumber-report","json:target/cucumber-report/cucumber.json"}, 
	features = "src/test/resources/features/", 
	glue = {"br.com.inmetrics.teste.steps" }, 
	snippets = SnippetType.CAMELCASE, 
	monochrome = true, 
	tags = {}, 
	strict = false, 
	dryRun = false
	)
public class RunCucumberTest {

}
