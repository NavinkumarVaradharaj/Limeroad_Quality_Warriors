package com.Limeroad_Quality_Warriors.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Limeroad_Quality_Warriors.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Preethi Venkatesan\\eclipse-workspace\\LimeRoad\\src\\test\\java\\com\\Feature\\lime.feature" ,
glue = "com.step", 
monochrome = true,
dryRun = false,
strict = true
,

//tags = "@smokeTest",
plugin = { "pretty",                 		 "json:Resources/lime.json",
		"html:Res/limeroad.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
		)

public class TestRunner extends BaseClass {

	@BeforeClass
	public static void browserLauncher()
	{
		//launchBrowser("chrome");
		getDriver("chrome");
		
		
		
	}
}
