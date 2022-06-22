package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

///@Test
//cucumberOPtions annotaion is used to run the test which has two parameters, feature  file and step def
//this will need cucumber jvm:testng jars
@CucumberOptions(
		features ="src/test/java/features", //path of the feature files
		tags = "@DataTableMap",//tags which we want to run
		glue = {"stepDefination","cucumberHooks"}, //step defination package name and hooks if present
		plugin = {"pretty", "json:target/Reports/report.json",
				"testng:target/Reports/repost.xml"},
		//plugins can be used for reporting purpose
		publish = false, //used for builtin cucumber reports
		monochrome=true, //used to elimante all the unwanted characters
		dryRun = false // is used to check if the steps are missing or not.. does not execute the test
		)		

public class TestRunner  extends AbstractTestNGCucumberTests{
//to run tests in TestNG with cucumber we need to extend the class with AbstractTestNGCucumberTests
}
