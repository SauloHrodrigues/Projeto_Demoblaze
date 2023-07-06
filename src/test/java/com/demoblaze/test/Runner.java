package com.demoblaze.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/resources/feature/", ///login_logout.feature
				glue = {"com.demoblaze","test","kernel"},//,"kernel","test"
				tags = {"~@loginLogout", "~@usuarios","@video"},//apresentacao_video
				monochrome = false, 
				snippets = SnippetType.CAMELCASE, //usuarios.feature
				dryRun = false, 
				strict = true)
@RunWith(Cucumber.class)
public class Runner {

}
