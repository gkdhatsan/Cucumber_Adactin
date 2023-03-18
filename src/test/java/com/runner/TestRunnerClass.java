package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags=("@Login"),
		dryRun=false,
		monochrome=true,
        publish=true,
        stepNotifications=true,snippets=SnippetType.CAMELCASE,
        plugin= {"pretty","html:target\\login.html",
		"junit:target\\login.xml",
		"json:target\\login2.json","rerun:target\\rerun2.txt"
		},features= {"C:\\Users\\User\\eclipse-workspace\\OMRBranchAdctinAutomation\\src\\test\\resources\\Features"},
		glue= {"com.stepdefinition"})

public class TestRunnerClass {
	
	
	@AfterClass
	public static void afterClass() {
		
		Reporting.generateJvmReport("C:\\Users\\User\\eclipse-workspace\\OMRBranchAdctinAutomation\\target\\login2.json");
		

	}

	}


