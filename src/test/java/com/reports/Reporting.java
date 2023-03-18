package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

public static  void generateJvmReport(String jsonfile) {
		
		File file = new File("C:\\Users\\User\\eclipse-workspace\\OMRBranchAdctinAutomation\\target");
		
		Configuration configuration = new Configuration(file,"CucumberProgramms");
		
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("BrowserVersion", "104");
		configuration.addClassifications("OS", "Windows");
		configuration.addClassifications("Sprint", "34");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(jsonfiles,configuration);
		
		
		builder.generateReports();
	
	
}
	
}
