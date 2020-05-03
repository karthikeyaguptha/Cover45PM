package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/test/java/com/features",
                glue = "com.stepDefs",
                monochrome = true,
                tags = "@Add_Edit_Delete_Division",
                strict = true,
                plugin = {"pretty","html:target/cucumber.html",
                        "json:target/cucumber_json.json",
                        "junit:target/cucumber_xml.xml",
                        "rerun:target/cucumber_rerun.txt",

//                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                }
             )

public class TestRunner extends AbstractTestNGCucumberTests {

}
