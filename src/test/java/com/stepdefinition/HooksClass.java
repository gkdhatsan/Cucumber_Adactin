package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.Scenario;
/**
 * 
 * @author Ganesh
 * @date 22/08/2022
 * @description Hooks Class
 *
 */

public class HooksClass extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		System.out.println("@before method");
		getBrowser(getPropertyFileValue("browserName"));
		getUrl(getPropertyFileValue("url"));
        maximizeWin();
        
	}

	@After
	public void afteScenario(Scenario scenario) {
		System.out.println("@after method");
		if (scenario.isFailed()) {

			TakesScreenshot ss = (TakesScreenshot) driver;
			byte[] screenshotAs = ss.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "png", "Every failed scenario");

		}

		
		quit();

	}


}
