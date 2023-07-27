package com.demoblaze.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/resources/feature//",
				glue = {"com.demoblaze","test//","test/steps/logout","kernel"},//,"kernel","test"
				tags = {},// {"~@0001","~@0002","~@0003","~@0004","~@0005","~@0006","~@0007","~@0008","~@0009","~@0010","~@0011","~@0012"},//{"~@ignorar"},
				monochrome = false, 
				snippets = SnippetType.CAMELCASE,
				dryRun = false, 
				strict = true)
@RunWith(Cucumber.class)
public class Runner {

}