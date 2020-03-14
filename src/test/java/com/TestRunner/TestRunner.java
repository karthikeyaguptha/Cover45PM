package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/test/java/com/features/Division.feature",
                glue = "com.Division_StepDefns",
                monochrome = true,
                tags="@AddDivision",
                strict = true
//                plugin =
//                        {
//                                "pretty","html:"
//
//                        }
        )

public class TestRunner extends AbstractTestNGCucumberTests {

}
