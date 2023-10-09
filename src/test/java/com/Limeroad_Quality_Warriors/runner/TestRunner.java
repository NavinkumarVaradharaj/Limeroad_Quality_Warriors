package com.Limeroad_Quality_Warriors.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions( features="C:\\Users\\Home\\eclipse-workspace\\ipt1_LimeRoad\\src\\test\\java\\com\\Feature\\lime.feature",
				 glue={"com.StepDefinition"},
						 monochrome = true,
						 dryRun = false,
						 tags = "@Bob",
						 plugin = {"pretty",
								 "json:Resources/lime.json"}

		          )



public class TestRunner extends BaseClass {
	@BeforeClass
public static void browserlaunch() {
	getDriver("chrome");




  

}

	public static void getDriver(String string) {
		// TODO Auto-generated method stub
		
	}
}
