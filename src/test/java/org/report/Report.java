package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void generateJVMReport(String jsonFile) {

		Configuration configuration = new Configuration(new File(System.getProperty("user.dir") + "\\target"),
				"GlobalFairMobileAutomation");

		configuration.addClassifications("platformName", "Android");
		configuration.addClassifications("platformVersion", "11");
		configuration.addClassifications("Author", "Subrammmanniam T");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
